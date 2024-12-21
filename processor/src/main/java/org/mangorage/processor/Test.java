package org.mangorage.gradleplugin;

import com.google.auto.service.AutoService;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Processor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;
import java.util.Set;

@SupportedAnnotationTypes("org.mangorage.Test")
@SupportedSourceVersion(SourceVersion.RELEASE_23)
@AutoService(Processor.class)
public class Test extends AbstractProcessor {
    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        processingEnv.getMessager()
                .printMessage(Diagnostic.Kind.NOTE,
                        "Careful Buddy!"
                );
        System.out.println("LOL");
        return false;
    }
}
