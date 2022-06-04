package utilities;

import org.jboss.logging.Logger;

import java.util.Scanner;

public class Messages {
    private static final Logger logger = Logger.getLogger(Messages.class);
    public static final Scanner scan = new Scanner(System.in);
    public static Messages getInstance() {
        return new Messages();
    }

    public void showCorrect() {
        logger.info("\t TU RESPUESTA ES CORRECTA");
    }
    public void showNewNamePlayer(){
        logger.info("POR FAVOR INGRESA TU NOMBRE");

    }
}