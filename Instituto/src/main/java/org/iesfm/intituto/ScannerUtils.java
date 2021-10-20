package org.iesfm.intituto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerUtils {

    private final static Logger log = LoggerFactory.getLogger(ScannerUtils.class);

    private Scanner scanner;

    public ScannerUtils(Scanner scanner) {
        this.scanner = scanner;
    }

    public int pideNumero() {
        Integer number = null;

        while (number == null) {

            try {
                number = scanner.nextInt();

            } catch (InputMismatchException e) {
                log.error("Error, no es un número");

            } finally {
                scanner.nextLine();
            }
        }

        return number;
    }

    public int positiveNumber() {
        log.info("Introduce un numero positivo");
        int positiveNumber = pideNumero();
        scanner.nextLine();
        while (positiveNumber < 1) {
            log.info("Introduce un numero positivo");
            positiveNumber = pideNumero();
            scanner.nextLine();

        }
        return positiveNumber;
    }
}
