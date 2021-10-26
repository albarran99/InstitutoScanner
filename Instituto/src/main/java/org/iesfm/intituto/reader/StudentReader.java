package org.iesfm.intituto.reader;

import org.iesfm.intituto.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class StudentReader {

    private final static Logger log = LoggerFactory.getLogger(StudentReader.class);

    private Scanner scanner;

    public StudentReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Student readerStudent() {
        log.info("Introduce un nombre de alumno");
        String studentName = scanner.nextLine();
        log.info("Introduce el apellido");
        String studentSurname = scanner.nextLine();
        log.info("Introduce el StudentNif");
        String studentNif = scanner.nextLine();

        return new Student(studentName, studentSurname, studentNif);
    }
}
