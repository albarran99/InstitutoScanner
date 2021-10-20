package org.iesfm.intituto;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Scanner;

@Configuration
public class InstitutoConfiguration {

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
}
