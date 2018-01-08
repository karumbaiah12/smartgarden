//package src.com.geeklabs.smartgarden;
//
//import src.com.geeklabs.smartgarden.constants.exceptions.LoggingFailure;
//import org.eclipse.jetty.server.*;
//import org.eclipse.jetty.server.handler.HandlerCollection;
//import org.eclipse.jetty.server.handler.RequestLogHandler;
//import org.eclipse.jetty.util.thread.QueuedThreadPool;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
//import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
//import org.springframework.boot.context.embedded.jetty.JettyEmbeddedServletContainerFactory;
//import org.springframework.boot.context.embedded.jetty.JettyServerCustomizer;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.io.File;
//
///**
// * Created by shubha on 7/1/18.
// */
//@Configuration
//public class GSWebContainerInitializer {
//
//    /**
//     * Container customizer embedded servlet container customizer.
//     *
//     * @param keystoreFile    the keystore file
//     * @param keystorePass    the keystore pass
//     * @param port            the port
//     * @param acceptQueueSize the accept queue size
//     * @param maxThreads      the max threads
//     * @param minThreads      the min threads
//     * @param idleTimeout     the idle timeout
//     * @return the embedded servlet container customizer
//     * @throws Exception the exception
//     */
//    @Bean
//    EmbeddedServletContainerCustomizer containerCustomizer(
//            @Value("${keystore.file}") String keystoreFile,
//            @Value("${keystore.pass}") final String keystorePass,
//            @Value("${server.port:8080}") final String port,
//            @Value("${jetty.acceptqueuesize:5000}") final String acceptQueueSize,
//            @Value("${jetty.threadPool.maxThreads:2000}") final String maxThreads,
//            @Value("${jetty.threadPool.minThreads:8}") final String minThreads,
//            @Value("${jetty.threadPool.idleTimeout:60000}") final String idleTimeout,
//            @Value("${logging.path}") final String loggingPath)
//            throws Exception {
//
//        // This is boiler plate code to setup https on embedded Tomcat
//        // with Spring Boot:
//
//        return new EmbeddedServletContainerCustomizer() {
//
//            @Override
//            public void customize(ConfigurableEmbeddedServletContainer container) {
//                JettyEmbeddedServletContainerFactory tomcat
//                        = (JettyEmbeddedServletContainerFactory) container;
//                tomcat.setSessionTimeout(Integer.valueOf(idleTimeout));
//                tomcat.addServerCustomizers(new JettyServerCustomizer() {
//                    @Override
//                    public void customize(Server server) {
//                        // Enable logs
//                        File logFile = new File(loggingPath + "/hubble-mainapp-yyyy_mm_dd.access.log");
//                        String logFilename = logFile.getAbsolutePath();
//                        if (!logFile.getParentFile().exists() && !logFile.getParentFile().mkdirs()) {
//                            throw new LoggingFailure(String.format("%s could not be created.", logFile.getParentFile().getAbsolutePath()));
//                        }
//                        NCSARequestLog requestLog = new NCSARequestLog(logFilename);
//                        requestLog.setAppend(true);
//                        requestLog.setExtended(false);
//                        requestLog.setLogTimeZone("UTC");
//                        RequestLogHandler rlh = new RequestLogHandler();
//                        rlh.setRequestLog(requestLog);
//                        Handler[] handlers = server.getHandlers();
//                        if (handlers == null || handlers.length == 0) {
//                            server.setHandler(rlh);
//                        }
//                        else {
//                            HandlerCollection handlerCollection = new HandlerCollection();
//                            for (int i = 0; i < handlers.length; ++i) {
//                                handlerCollection.addHandler(handlers[i]);
//                            }
//                            handlerCollection.addHandler(rlh);
//                            server.setHandler(handlerCollection);
//                        }
//                        // Tweak the connection pool used by Jetty to handle incoming HTTP connections
//                        final QueuedThreadPool threadPool = server.getBean(QueuedThreadPool.class);
//                        threadPool.setMaxThreads(Integer.valueOf(maxThreads));
//                        threadPool.setMinThreads(Integer.valueOf(minThreads));
//                        threadPool.setIdleTimeout(Integer.valueOf(idleTimeout));
//                        threadPool.setName("Jetty-Threadpool");
//
//                        for (Connector connector : server.getConnectors()) {
//                            if (connector instanceof ServerConnector) {
//                                ServerConnector serverConnector = (ServerConnector)connector;
//                                serverConnector.setAcceptQueueSize(Integer.valueOf(acceptQueueSize));
//                                serverConnector.setIdleTimeout(Integer.valueOf(idleTimeout));
//                                HttpConnectionFactory connectionFactory = connector.getConnectionFactory(HttpConnectionFactory.class);
//                                connectionFactory.getHttpConfiguration().setSendServerVersion(false);
//                            }
//                        }
//                    }
//                });
//            }
//        };
//    }
//}
