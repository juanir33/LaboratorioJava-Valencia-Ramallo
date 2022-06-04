package players;

import utilities.Messages;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static utilities.Messages.logger;
import static utilities.Messages.scan;

public class Prizes {


    private final String player;


    Messages msg = Messages.getInstance();




    /**
     * Constructor de clase
     * @param player tipo String, nombre de quien está jugando.
     *
     */

    public Prizes(String player) {
        this.player = player;


    }

    /**
     * Metodo para guardar el progreso del jugador, cuando pierde, se retira o ha ganado.
     *
     * @param prize tipo Integer, es el premio acumulado por cada ronda.
     */
    public void  setPrize( int prize) {

        File historicList = new File("historialdejuego.txt");

        try (BufferedWriter setPlays = new BufferedWriter(new FileWriter(historicList, true))) {
            setPlays.append(player).append(" --- premio ganado $").append(String.valueOf(prize));
            setPlays.newLine();

        }catch (IOException e){
            logger.warn(e.getMessage());
        }

    }


    /**
     * Metodo para finalizar juego cuando se pierde
     */
    public void loose() {

        int loose = 0;
        msg.showLoose(loose);

        setPrize(loose);
        System.exit(0);
    }
    /**
     * Metodo para consultar al jugador si quiere continuar o retirarse con lo ganado.
     *
     * @param totalPrizes tipo Integer, es el premio acumulado por cada ronda.
     */

    public void withdraw( int totalPrizes) {

        msg.showWithdraw();

        char option = scan.nextLine().charAt(0);
        if (option == 'r') {
            msg.showWithdrawPrizes( totalPrizes);

            setPrize( totalPrizes);
            System.exit(0);
        }
    }




}
