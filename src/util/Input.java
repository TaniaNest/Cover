package util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public float getNumber() {
        try {
            scanner = new Scanner(System.in);
            return scanner.nextFloat();
        } catch (InputMismatchException ex) {
            System.out.println(ex.getMessage());
        }
        return 0;
    }

    public String getAnswer() {
        scanner = new Scanner(System.in);
        return scanner.next();
    }

}
