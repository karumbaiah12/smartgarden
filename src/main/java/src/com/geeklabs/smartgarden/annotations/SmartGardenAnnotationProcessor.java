package src.com.geeklabs.smartgarden.annotations;

import com.google.auto.service.AutoService;


        import javax.annotation.processing.*;
        import javax.lang.model.SourceVersion;
        import javax.lang.model.element.Element;
        import javax.lang.model.element.Modifier;
        import javax.lang.model.element.TypeElement;
        import javax.tools.Diagnostic;
        import java.util.Set;

/**
 * Created by shubha on 7/1/18.
 */
@SupportedSourceVersion(SourceVersion.RELEASE_8)
@SupportedAnnotationTypes("com.geeklabs.smartgarden.annotations.ORMCache")
@AutoService(Processor.class)
public class SmartGardenAnnotationProcessor extends AbstractProcessor {
    @Override
    public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.latestSupported();
    }

    @Override
    public boolean process(Set<? extends TypeElement> typeElements, RoundEnvironment roundEnvironment) {
        processingEnv.getMessager().printMessage(Diagnostic.Kind.NOTE, "Test Message");
        for (Element element : roundEnvironment.getElementsAnnotatedWith(ORMCache.class)) {
            Element classElement = element.getEnclosingElement();
            boolean isPublic = element.getModifiers().contains(Modifier.PUBLIC);
            if (!isPublic) {
                processingEnv.getMessager().printMessage(Diagnostic.Kind.ERROR, classElement + "#" + element + " is not public, but @Transactional only works with public methods");
            }
        }
        return true;
    }
}
