import players.Player;
import players.Prizes;

import utilities.DataQuestions;
import utilities.Messages;



public class App {
    static Messages msg = Messages.getInstance();
    static DataQuestions levels = new DataQuestions();

 /**
  * Metodo de arranque del juego, sé instancia la clase player para insertar un jugador nuevo
  * y comienza desde el nivel uno hacia el cinco. Teniendo la opción de retirarse cada vez que conteste bien
  * @param args d
  */
 public static void main(String[] args) {


     int totalPrize = 0;
     msg.showWelcome();


     Player user = new Player();

     String player = user.newPlayer();

     int easy = levels.newDataLevelOne(player, totalPrize);

     msg.showPrize(easy);
     Prizes prize = new Prizes(player);
     prize.withdraw( easy);

     int normal = levels.newDataLevelTwo(player, easy);


     msg.showPrize(normal);

     prize.withdraw(normal);

     int medium = levels.newDataLevelTree(player, normal);
     msg.showPrize(medium);
     prize.withdraw( medium);

     int hard = levels.newDataLevelFour(player, medium);
     msg.showPrize(hard);
     prize.withdraw( hard);

     int legend = levels.newDataLevelFive(player, hard);



     msg.showWin(player, legend);
     prize.setPrize( legend);


    }}

