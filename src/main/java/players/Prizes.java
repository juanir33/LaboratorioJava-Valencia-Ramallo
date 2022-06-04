package players;

import utilities.Messages;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static utilities.Messages.logger;
import static utilities.Messages.scan;

public class Prizes {

    private  int prizes;
    private String player;


    Messages msg = Messages.getInstance();

    public Prizes(String player, int prizes) {
        this.player = player;
        this.prizes = prizes;

    }

    public void  setPrize(String name, int prize) {

        File historicList = new File("historialdejuego.txt");

        try (BufferedWriter setPlays = new BufferedWriter(new FileWriter(historicList, true))) {
            setPlays.append(name).append(" --- premio ganado $").append(String.valueOf(prize));
            setPlays.newLine();

        }catch (IOException e){
            logger.warn(e.getMessage());
        }

    }




    public void loose(String playerName) {

        int loose = 0;
        msg.showLoose(loose);
        Prizes loosePrize = new Prizes(playerName, loose);
        loosePrize.setPrize(playerName, loose);
        System.exit(0);
    }

    public void withdraw(String player, int totalPrizes) {

        msg.showWithdraw();

        char option = scan.nextLine().charAt(0);
        if (option == 'r') {
            msg.showWithdrawPrizes( totalPrizes);
            Prizes prize = new Prizes(player, totalPrizes);
            prize.setPrize(player, totalPrizes);
            System.exit(0);
        }
    }



    public int getPrizes() {
        return prizes;
    }
}
