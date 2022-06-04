import players.Player;
import players.Prizes;
import questions.Answers;
import questions.Category;
import questions.Question;
import utilities.Messages;

import java.util.List;

public class App {
    static Messages msg = Messages.getInstance();
    public static void main(String[] args) {
       int totalPrize = 0;
        msg.showWelcome();


        Player user = new Player();
        String player = user.newPlayer();

        Category levelOne = new Category();
        levelOne.addQuestion( new Question("¿Cuál es el jugador que más balones de oro ha ganado?", List.of(
                new Answers("Leonel Messi", true),
                new Answers("Marco van Basten", false),
                new Answers("Cristian Ronaldo", false),
                new Answers("Ronaldo Nazario", false)
        ), (1000)));

        levelOne.addQuestion( new Question("¿Cuál es el jugador que más balones de oro ha ganado?", List.of(
                new Answers("Leonel Messi", true),
                new Answers("Marco van Basten", false),
                new Answers("Cristian Ronaldo", false),
                new Answers("Ronaldo Nazario", false)
        ), (1000)));
        levelOne.addQuestion( new Question("¿Cuál es el jugador que más balones de oro ha ganado?", List.of(
                new Answers("Leonel Messi", true),
                new Answers("Marco van Basten", false),
                new Answers("Cristian Ronaldo", false),
                new Answers("Ronaldo Nazario", false)
        ), (1000)));
        levelOne.addQuestion( new Question("¿Cuál es el jugador que más balones de oro ha ganado?", List.of(
                new Answers("Leonel Messi", true),
                new Answers("Marco van Basten", false),
                new Answers("Cristian Ronaldo", false),
                new Answers("Ronaldo Nazario", false)
        ), (1000)));
        levelOne.addQuestion( new Question("¿Cuál es el jugador que más balones de oro ha ganado?", List.of(
                new Answers("Leonel Messi", true),
                new Answers("Marco van Basten", false),
                new Answers("Cristian Ronaldo", false),
                new Answers("Ronaldo Nazario", false)
        ), (1000)));

        totalPrize += levelOne.getTotalPrize();
        if (levelOne.printQuestion()== 0) {
            Prizes prize = new Prizes(player, totalPrize);
           prize.loose(player);
        }


        msg.showPrize(totalPrize);
        Prizes prize = new Prizes(player, totalPrize);
        prize.withdraw(player, totalPrize);


        Category levelTwo = new Category();
        levelTwo.addQuestion( new Question("¿Cuál es el jugador que más balones de oro ha ganado?", List.of(
                new Answers("Leonel Messi", true),
                new Answers("Marco van Basten", false),
                new Answers("Cristian Ronaldo", false),
                new Answers("Ronaldo Nazario", false)
        ), (1000)));

        levelTwo.addQuestion( new Question("¿Cuál es el jugador que más balones de oro ha ganado?", List.of(
                new Answers("Leonel Messi", true),
                new Answers("Marco van Basten", false),
                new Answers("Cristian Ronaldo", false),
                new Answers("Ronaldo Nazario", false)
        ), (1000)));
        levelTwo.addQuestion( new Question("¿Cuál es el jugador que más balones de oro ha ganado?", List.of(
                new Answers("Leonel Messi", true),
                new Answers("Marco van Basten", false),
                new Answers("Cristian Ronaldo", false),
                new Answers("Ronaldo Nazario", false)
        ), (1000)));
        levelTwo.addQuestion( new Question("¿Cuál es el jugador que más balones de oro ha ganado?", List.of(
                new Answers("Leonel Messi", true),
                new Answers("Marco van Basten", false),
                new Answers("Cristian Ronaldo", false),
                new Answers("Ronaldo Nazario", false)
        ), (1000)));
        levelTwo.addQuestion( new Question("¿Cuál es el jugador que más balones de oro ha ganado?", List.of(
                new Answers("Leonel Messi", true),
                new Answers("Marco van Basten", false),
                new Answers("Cristian Ronaldo", false),
                new Answers("Ronaldo Nazario", false)
        ), (1000)));


        if (levelTwo.printQuestion()== 0) {

            prize.loose(player);
        }

        totalPrize +=  levelTwo.getTotalPrize();
        msg.showPrize(totalPrize);

        prize.withdraw(player, totalPrize);

        Category levelTree = new Category();
        levelTree.addQuestion( new Question("¿Cuál es el jugador que más balones de oro ha ganado?", List.of(
                new Answers("Leonel Messi", true),
                new Answers("Marco van Basten", false),
                new Answers("Cristian Ronaldo", false),
                new Answers("Ronaldo Nazario", false)
        ), (1000)));

        levelTree.addQuestion( new Question("¿Cuál es el jugador que más balones de oro ha ganado?", List.of(
                new Answers("Leonel Messi", true),
                new Answers("Marco van Basten", false),
                new Answers("Cristian Ronaldo", false),
                new Answers("Ronaldo Nazario", false)
        ), (1000)));
        levelTree.addQuestion( new Question("¿Cuál es el jugador que más balones de oro ha ganado?", List.of(
                new Answers("Leonel Messi", true),
                new Answers("Marco van Basten", false),
                new Answers("Cristian Ronaldo", false),
                new Answers("Ronaldo Nazario", false)
        ), (1000)));
        levelTree.addQuestion( new Question("¿Cuál es el jugador que más balones de oro ha ganado?", List.of(
                new Answers("Leonel Messi", true),
                new Answers("Marco van Basten", false),
                new Answers("Cristian Ronaldo", false),
                new Answers("Ronaldo Nazario", false)
        ), (1000)));
        levelTree.addQuestion( new Question("¿Cuál es el jugador que más balones de oro ha ganado?", List.of(
                new Answers("Leonel Messi", true),
                new Answers("Marco van Basten", false),
                new Answers("Cristian Ronaldo", false),
                new Answers("Ronaldo Nazario", false)
        ), (1000)));

        totalPrize += levelOne.getTotalPrize() + levelTwo.getTotalPrize() + levelTree.getTotalPrize();
        if (levelTree.printQuestion() == 0) {
            prize.loose(player);
        }
        msg.showPrize(totalPrize);
        prize.withdraw(player, totalPrize);

        Category levelFour = new Category();
        levelTree.addQuestion( new Question("¿Cuál es el jugador que más balones de oro ha ganado?", List.of(
                new Answers("Leonel Messi", true),
                new Answers("Marco van Basten", false),
                new Answers("Cristian Ronaldo", false),
                new Answers("Ronaldo Nazario", false)
        ), (1000)));

        levelFour.addQuestion( new Question("¿Cuál es el jugador que más balones de oro ha ganado?", List.of(
                new Answers("Leonel Messi", true),
                new Answers("Marco van Basten", false),
                new Answers("Cristian Ronaldo", false),
                new Answers("Ronaldo Nazario", false)
        ), (1000)));
        levelFour.addQuestion( new Question("¿Cuál es el jugador que más balones de oro ha ganado?", List.of(
                new Answers("Leonel Messi", true),
                new Answers("Marco van Basten", false),
                new Answers("Cristian Ronaldo", false),
                new Answers("Ronaldo Nazario", false)
        ), (1000)));
        levelFour.addQuestion( new Question("¿Cuál es el jugador que más balones de oro ha ganado?", List.of(
                new Answers("Leonel Messi", true),
                new Answers("Marco van Basten", false),
                new Answers("Cristian Ronaldo", false),
                new Answers("Ronaldo Nazario", false)
        ), (1000)));
        levelFour.addQuestion( new Question("¿Cuál es el jugador que más balones de oro ha ganado?", List.of(
                new Answers("Leonel Messi", true),
                new Answers("Marco van Basten", false),
                new Answers("Cristian Ronaldo", false),
                new Answers("Ronaldo Nazario", false)
        ), (1000)));

        totalPrize = levelOne.getTotalPrize() + levelTwo.getTotalPrize() + levelTree.getTotalPrize() + levelFour.getTotalPrize();
        if (levelFour.printQuestion()== 0) {
            prize.loose(player);
        }
        msg.showPrize(totalPrize);
        prize.withdraw(player, totalPrize);

        Category levelFive = new Category();
        levelFive.addQuestion( new Question("¿Cuál es el jugador que más balones de oro ha ganado?", List.of(
                new Answers("Leonel Messi", true),
                new Answers("Marco van Basten", false),
                new Answers("Cristian Ronaldo", false),
                new Answers("Ronaldo Nazario", false)
        ), (1000)));

        levelFive.addQuestion( new Question("¿Cuál es el jugador que más balones de oro ha ganado?", List.of(
                new Answers("Leonel Messi", true),
                new Answers("Marco van Basten", false),
                new Answers("Cristian Ronaldo", false),
                new Answers("Ronaldo Nazario", false)
        ), (1000)));
        levelFive.addQuestion( new Question("¿Cuál es el jugador que más balones de oro ha ganado?", List.of(
                new Answers("Leonel Messi", true),
                new Answers("Marco van Basten", false),
                new Answers("Cristian Ronaldo", false),
                new Answers("Ronaldo Nazario", false)
        ), (1000)));
        levelFive.addQuestion( new Question("¿Cuál es el jugador que más balones de oro ha ganado?", List.of(
                new Answers("Leonel Messi", true),
                new Answers("Marco van Basten", false),
                new Answers("Cristian Ronaldo", false),
                new Answers("Ronaldo Nazario", false)
        ), (1000)));
        levelFive.addQuestion( new Question("¿Cuál es el jugador que más balones de oro ha ganado?", List.of(
                new Answers("Leonel Messi", true),
                new Answers("Marco van Basten", false),
                new Answers("Cristian Ronaldo", false),
                new Answers("Ronaldo Nazario", false)
        ), (1000)));

        totalPrize = levelOne.getTotalPrize() + levelTwo.getTotalPrize() + levelTree.getTotalPrize() + levelFour.getTotalPrize() + levelFive.getTotalPrize();
        if (levelFive.printQuestion()== 0) {
            prize.loose(player);
        }
        msg.showPrize(totalPrize);
        prize.withdraw(player, totalPrize);



        prize.setPrize(player, totalPrize);
    }
    }

