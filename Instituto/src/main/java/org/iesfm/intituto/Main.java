package org.iesfm.intituto;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.iesfm.intituto.reader.InstitutoReader;
import org.iesfm.intituto.writer.InstitutoWriter;
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

        ObjectMapper objectMapper = new ObjectMapper();

        String path = "/tmp/instituto.json";

        InstitutoWriter institutoWriter = new InstitutoWriter(objectMapper, path);

        institutoWriter.write(instituto);
    }
}
