package training.core.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class baseExceptions {
    static Logger logger = Logger.getLogger(baseExceptions.class.getName());

    public static void main(String[] args) {

        NullPointerExceptionMethod();

        try {
            RangeExceptionMethod("word", 8);
        } catch (RangeException e) {
            e.printStackTrace();
        }
        System.out.println("------------------------------------");
        readFileWithFinnallyBlock();
        System.out.println("------------------------------------");
        readFileWithTryResourceCatch();



    }


    private static void readFileWithTryResourceCatch() {
        try(FileReader fr = new FileReader("dummy.xml")){
            char[] text = new char[50];
            fr.read(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readFileWithFinnallyBlock() {
        File file = new File("dummy.file.txt");
        FileReader fr = null;
        try {
            fr = new FileReader(file);
            char[] text = new char[50];
            fr.read(text);
            for (char c : text){
                System.out.println(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }


    private static void RangeExceptionMethod(String word, int pos) throws RangeException {
        if (pos>= 0 && pos< word.length()) {
            System.out.println(word.charAt(pos));

        } else {
            throw new RangeException();
        }

    }

    private static void NullPointerExceptionMethod() {
        String nullString = null;
        try {
            if (nullString == null) {
                throw new NullPointerException("String is null!!");
            }
            Integer integer = Integer.parseInt(nullString); // mull string jest utworzony żeby wyświetlić później komunikat wyjątku
        } catch (NumberFormatException | NullPointerException e) {  /// e == exception jest na koncu po liście
            logger.log(Level.SEVERE, "Try to parse: " + nullString);
            logger.log(Level.SEVERE, e.toString());
        } catch (Exception e) {
            logger.log(Level.SEVERE, "General exception");
            /*chache od szczegółu o ogółu*/
        }
    }
}
