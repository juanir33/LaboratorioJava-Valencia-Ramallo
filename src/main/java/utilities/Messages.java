package utilities;

import org.jboss.logging.Logger;

import java.util.Scanner;



public class Messages {
    public static final Logger logger = Logger.getLogger(Messages.class);
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

    public void showLoose(int prize){
        logger.info("\tHAS PERDIDO TU PREMIO QUEDA EN: "+ prize);
        logger.info("\t JUEGO TERMINADO");
    }

    public void showWithdraw(){
        logger.info("DESEAS RETIRARTE CON LO GANADO? \nr) -->Retirarse \\n cualquier letra) -->Continuar");


    }
    public void showWithdrawPrizes(int prizes){
        logger.info("\tTE HAS RETIRADO, \n\tTU PREMIO ES: "+prizes);
    }

    public void showOptionAnswers( ){
        logger.info("Elige una de las opciones: ");

    }

    public void showWelcome(){
        logger.info("<****=== Bienvenido al Preguntados 4.0 ===****>");
        logger.info("\t--- Consiste en 5 rondas de prguntas, agrupadas por categoria y dificultad ---");
        logger.info("=== Mucha suerte!!! ===");
    }

    public void showPrize(int totalPrize){
        logger.info("\tTU PUNTAJE ES: " + totalPrize);
    }

    public void showWin(String player , int totalPrize){
        logger.info("\t *** FELICIDADES  "+ player +" ERES EL CAMPEON!! ***");
        logger.info("\t TU PREMIO ACUMULADO ES: "+ totalPrize);
    }


}