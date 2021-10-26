package org.iesfm.intituto.reader;

import org.iesfm.intituto.Group;
import org.iesfm.intituto.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class GroupReader {

    private final static Logger log = LoggerFactory.getLogger(StudentReader.class);

    private Scanner scanner;
    private StudentReader studentReader;
    private ScannerUtils scannerUtils;

    public GroupReader(Scanner scanner, StudentReader studentReader, ScannerUtils scannerUtils) {
        this.scanner = scanner;
        this.studentReader = studentReader;
        this.scannerUtils = scannerUtils;
    }

    public Group readGroup() {
        log.info("Introduce la letra");
        String letterGroup = scanner.nextLine();
        log.info("Introduce el curso");
        String courseGroup = scanner.nextLine();
        log.info("Introduce el numero de estudiantes a mostrar");
        int showNStuddents = scannerUtils.positiveNumber();
        scanner.nextLine();

        List<Student> students = new LinkedList<>();
        for (int i = 0; i < showNStuddents; i++) {
            students.add(studentReader.readerStudent());
        }

        return new Group(letterGroup, courseGroup, students);
    }
}
