package src.com.geeklabs.smartgarden;

import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.datatype.joda.JodaModule;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by vinay on 6/16/17.
 */
@EnableJpaRepositories({"src.com.geeklabs.smartgarden.dao",
        "src.com.geeklabs.smartgarden.entity"
})
@ComponentScan(basePackages = {"src.com.geeklabs.smartgarden"})
@EnableAutoConfiguration
@EnableJpaAuditing
public class DatabaseConfiguration {

    @Value("${spring.datasource.driverClassName:com.mysql.jdbc.Driver}")
    private String dataSourceDriverClassName;
    @Value("${spring.datasource.url}")
    private String dataSourceURL;
    @Value("${spring.datasource.username:h2o}")
    private String dataSourceUsername;
    @Value("${spring.datasource.password:h2o123}")
    private String dataSourcePassword;
    @Value("${spring.datasource.max-wait:30000}")
    private int dataSourceMaxWait;
    @Value("${spring.datasource.max-active:2000}")
    private int dataSourceMaxActive;
    @Value("${spring.datasource.initial-size:10}")
    private int dataSourceInitialSize;
    @Value("${spring.datasource.test-on-borrow}")
    private boolean dataSourceTestOnBorrow;
    @Value("${spring.datasource.validation-query}")
    private String dataSourceValidationQuery;

    @Bean
    public DataSource dataSource() {
        DataSource dataSource = new DataSource();
        dataSource.setDriverClassName(dataSourceDriverClassName);
        dataSource.setUrl(dataSourceURL);
        dataSource.setUsername(dataSourceUsername);
        dataSource.setPassword(dataSourcePassword);
        dataSource.setInitialSize(dataSourceInitialSize);
        dataSource.setMaxActive(dataSourceMaxActive);
        dataSource.setTestOnBorrow(dataSourceTestOnBorrow);
        dataSource.setValidationQuery(dataSourceValidationQuery);
        return dataSource;
    }
    @Bean
    public Module jodaModule() {
        return new JodaModule();
    }

//    @Bean
//    public AuditorAware<String> auditorProvider() {
//        return new H2OAuditorAware();
//    }

}
