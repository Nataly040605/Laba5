package utility;

import java.util.NoSuchElementException;
import java.util.Scanner;

import commands.Execute_script;

public class Console {
	static public Scanner scannerIn = new Scanner(System.in);
    static public boolean readFromFileStatus = false;

    public static String nextLine() {
        if (readFromFileStatus) {
            if (!scannerIn.hasNextLine()) {
                Console.scannerIn = new Scanner(System.in);
            }
        }
        return scannerIn.nextLine();
    }

    static public String next() throws NoSuchElementException,IllegalArgumentException {
        if (readFromFileStatus) {
            if (!scannerIn.hasNextLine()) {
                Console.scannerIn = new Scanner(System.in);
                Execute_script.deleteLastPath();
            }
        }
        return scannerIn.next();

    }

    public static boolean getReadFromFileStatus() {
        return readFromFileStatus;
    }

    public static void setReadFromFileStatus(boolean status) {
        readFromFileStatus = status;
    }

    public static void close() {
        scannerIn.close();
    }
}
