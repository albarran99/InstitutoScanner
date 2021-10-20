package org.iesfm.intituto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class InstitutoReader {

    private final static Logger log = LoggerFactory.getLogger(InstitutoReader.class);

    private Scanner scanner;
    private GroupReader groupReader;
    private ScannerUtils scannerUtils;

    public InstitutoReader(ScannerUtils scannerUtils, Scanner scanner, GroupReader groupReader) {
        this.scannerUtils = scannerUtils;
        this.scanner = scanner;
        this.groupReader = groupReader;
    }

    public Instituto readInstituto() {
        log.info("Introduce el nombre de el Intituto");
        String nameInstituto = scanner.nextLine();
        log.info("Introduce el numero de grupos a mostrar");
        int numberGroup = scannerUtils.positiveNumber();
        scanner.nextLine();

        List<Group> groups = new LinkedList<>();

        for (int i = 0; i < numberGroup; i++) {
            groups.add(groupReader.readGroup());
        }
        return new Instituto(nameInstituto, groups);
    }
}
