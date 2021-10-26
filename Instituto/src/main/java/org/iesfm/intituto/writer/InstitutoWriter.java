package org.iesfm.intituto.writer;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.iesfm.intituto.Instituto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

public class InstitutoWriter {

    private static final Logger log = LoggerFactory.getLogger(InstitutoWriter.class);

    private ObjectMapper objectMapper;
    private String path;

    public InstitutoWriter(ObjectMapper objectMapper, String path) {
        this.objectMapper = objectMapper;
        this.path = path;
    }

    public void write(Instituto instituto) {
        try {
            objectMapper.writeValue(new File(path), instituto);
        } catch (IOException e) {
            e.printStackTrace();
        }
        log.info("instituto escrito en fichero adecuadamente");
    }
}
