package util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    Scanner scanner = new Scanner(System.in);

    public float getNumber() {
        try {
            return scanner.nextFloat();
        } catch (InputMismatchException ex) {
            System.out.println(ex.getMessage());
        }
        return 0;
    }

    public String getAnswer() {
        return scanner.next();
    }

}
