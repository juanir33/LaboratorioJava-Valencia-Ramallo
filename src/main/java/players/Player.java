package players;

import utilities.Messages;




import static utilities.Messages.scan;


public class Player {

    private String name;


    Messages msg = Messages.getInstance();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String newPlayer() {
        msg.showNewNamePlayer();
        name = scan.nextLine();

        setName(name);
        return getName();






    }










}
