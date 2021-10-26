package org.iesfm.intituto;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.iesfm.intituto.reader.GroupReader;
import org.iesfm.intituto.reader.InstitutoReader;
import org.iesfm.intituto.reader.ScannerUtils;
import org.iesfm.intituto.reader.StudentReader;
import org.iesfm.intituto.writer.InstitutoWriter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Scanner;

@Configuration
@PropertySource("application.properties")
public class InstitutoConfiguration {

    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper();
    }

    @Bean
    public StudentReader studentReader(Scanner scanner) {
        return  new StudentReader(scanner);
    }

    @Bean
    public Scanner scanner() {
        return new Scanner(System.in);
    }

    @Bean
    public GroupReader groupReader(Scanner scanner, StudentReader studentReader, ScannerUtils scannerUtils) {
        return  new GroupReader(scanner, studentReader, scannerUtils);
    }

    @Bean
    public InstitutoReader institutoReader(Scanner scanner, GroupReader groupReader, ScannerUtils scannerUtils) {
        return  new InstitutoReader(scannerUtils, scanner, groupReader);
    }

    @Bean
    public ScannerUtils scannerUtils(Scanner scanner) {
        return new ScannerUtils(scanner);
    }

    @Bean
    public InstitutoWriter institutoWriter(ObjectMapper objectMapper,
                                           @Value("${instituto.path}") String path) {
        return new InstitutoWriter(objectMapper, path);
    }
}