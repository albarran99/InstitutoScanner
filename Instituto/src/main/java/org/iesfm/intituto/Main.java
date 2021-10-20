package org.iesfm.intituto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    private final static Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(InstitutoConfiguration.class);
        InstitutoReader programa = context.getBean(InstitutoReader.class);
        Instituto instituto = programa.readInstituto();

        log.info(String.valueOf(instituto));
    }
}
