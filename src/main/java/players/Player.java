package players;

import utilities.Messages;

import java.io.*;

import static utilities.Messages.logger;
import static utilities.Messages.scan;


public class Player {

    private String name;
    private int round;
    private int prize;
    Messages msg = Messages.getInstance();



    public Player(String name) {
        this.name = name;



    }


    public String newPlayer() {
        msg.showNewNamePlayer();
        name = scan.nextLine();
        new Player(name);

        return name;






    }










}
