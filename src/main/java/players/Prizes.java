package players;

import utilities.Messages;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static utilities.Messages.logger;

public class Prizes {

    private  int prizes;
    private String player;

    Messages msg = Messages.getInstance();

    public Prizes(String player, int prizes) {
        this.player = player;
        this.prizes = prizes;
    }

    public void setPrize(String name, int prize) {

        File historicList = new File("historialdejuego.txt");

        try (BufferedWriter setPlays = new BufferedWriter(new FileWriter(historicList, true))) {
            setPlays.append(name).append(" : ").append(String.valueOf(prize));
            setPlays.newLine();

        }catch (IOException e){
            logger.warn(e.getMessage());
        }

    }

    public void loose(String playerName, int prizes) {

        int loose = prizes * 0;
        msg.showLoose(loose);
        Prizes loosePrize = new Prizes(playerName, prizes);
        loosePrize.setPrize(playerName, loose);
        System.exit(0);
    }


    public int getPrizes() {
        return prizes;
    }
}
