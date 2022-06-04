package utilities;

import players.Prizes;
import questions.Answers;
import questions.Category;
import questions.Questions;


import java.util.List;

public class DataQuestions {

    /**
     * Métodos para crear nuevos datos de categoria con sus preguntas dentro, luego se van a utilizar de en el arranque
     * del juego.
     * @param player string nombre del jugador
     * @param totalPrize integer es el acumulado de premios
     * @return tipo integer, devuelve el nuevo valor de premios acumulados, o si pierde el valor 0.
     */
    public int newDataLevelOne (String player, int totalPrize ) {
        Category levelOne = new Category(1000);
        levelOne.addQuestion(new Questions("¿Qué país está entre Perú y Colombia?", List.of(
                new Answers("Ecuador", true),
                new Answers("Brasil", false),
                new Answers("Guyana", false),
                new Answers("Panama", false)
        )));

        levelOne.addQuestion(new Questions("¿En qué continente se encuentra Jamaica?", List.of(
                new Answers("Asia", false),
                new Answers("America del Sur", true),
                new Answers("America", true),
                new Answers("Europa", false)
        ) ));
        levelOne.addQuestion(new Questions("¿En qué continente se encuentra Australia?", List.of(
                new Answers("America del Sur", true),
                new Answers("Oceania", true),
                new Answers("Asia", false),
                new Answers("Europa", false)
        )));
        levelOne.addQuestion(new Questions("¿En qué país se encuentra el pico Aconcagua?", List.of(
                new Answers("Brasil", false),
                new Answers("Canada", false),
                new Answers("Argentina", true),
                new Answers("Suiza", false)
        )));
        levelOne.addQuestion(new Questions("¿Cuál es el idioma más hablado en Suiza?", List.of(
                new Answers("Japones", false),
                new Answers("Aleman", true),
                new Answers("Arabe", false),
                new Answers("Ingles", false)
        )));
        totalPrize += levelOne.getTotalPrize();
        if (levelOne.printQuestion()== 0) {
            Prizes prize = new Prizes(player);
            prize.loose();
        }

        return totalPrize;



    }
    public int newDataLevelTwo (String player, int totalPrize) {
        Category levelTwo = new Category(2000);
        levelTwo.addQuestion(new Questions("¿En qué año el hombre pisó la Luna por primera vez?", List.of(
                new Answers("1969", true),
                new Answers("1967", false),
                new Answers("1996", false),
                new Answers("1869", false)
        )));

        levelTwo.addQuestion(new Questions("¿Cuánto duró la Guerra de los Cien Años?", List.of(
                new Answers("112", false),
                new Answers("98", false),
                new Answers("116", true),
                new Answers("100", false)
        )));
        levelTwo.addQuestion(new Questions("¿Quiénes fueron, según la leyenda, los dos hermanos fundadores de la ciudad de Roma?", List.of(
                new Answers("Romualdo y Renaldo", false),
                new Answers("Romulo y Remo", true),
                new Answers("Marco y Aurelio", false),
                new Answers("Juan y Maximo", false)
        )));
        levelTwo.addQuestion(new Questions("¿Para qué religión es especialmente importante el rey Haile Selassie I?", List.of(
                new Answers("Budismo", false),
                new Answers("Judia", false),
                new Answers("Rastafari", true),
                new Answers("Protestante", false)
        )));
        levelTwo.addQuestion(new Questions("¿Cómo se apellidaban los dos exploradores que dieron la primera vuelta al mundo??", List.of(
                new Answers("Colon-Hernandez", false),
                new Answers("Cortez-Colon", false),
                new Answers("Polo-Khan", false),
                new Answers("Magallanes-Elcano", true)
        )));
          totalPrize += levelTwo.getTotalPrize();
        if (levelTwo.printQuestion()== 0) {
            Prizes prize = new Prizes(player);
            prize.loose();
        }

      return  totalPrize;

    }
    public int newDataLevelTree (String player, int totalPrize) {
        Category levelTree = new Category(3000);
        levelTree.addQuestion( new Questions("¿A quién interpretaba John Travolta en “Grease”?", List.of(
                new Answers("Samuel Zuko", false),
                new Answers("Doody", false),
                new Answers("Danny Zuko", true),
                new Answers("Sonny", false)
        )));

        levelTree.addQuestion( new Questions("¿Qué conocido cómico imitó a Hitler en la película “El Gran Dictador”?", List.of(
                new Answers("MrBean", false),
                new Answers("Charles Chaplin", true),
                new Answers("Steve Martin", false),
                new Answers("Bill Murray", false)
        )));
        levelTree.addQuestion( new Questions("¿Cómo se llama el protagonista de la serie de cómics The Sandman, de Neil Gaiman?", List.of(
                new Answers("Lucifer", false),
                new Answers("Hector Hall", false),
                new Answers("Morfeo", true),
                new Answers("Sandman", false)
        )));
        levelTree.addQuestion( new Questions("¿Cómo se llama la ciudad donde se encuentra el Mago de Oz?", List.of(
                new Answers("Esperanza", false),
                new Answers("Esmeralda", true),
                new Answers("Esperada", false),
                new Answers("Ronaldo Nazario", false)
        )));
        levelTree.addQuestion( new Questions("¿En qué país transcurre la acción de la película 'Chappie'?", List.of(
                new Answers("Sudafrica", true),
                new Answers("Irlanda", false),
                new Answers("Alemania", false),
                new Answers("Sudan", false)
        )));
        totalPrize += levelTree.getTotalPrize();
        if (levelTree.printQuestion()== 0) {
            Prizes prize = new Prizes(player);
            prize.loose();
        }

     return  totalPrize;

    }
    public int newDataLevelFour (String player, int totalPrize) {
        Category levelFour = new Category(4000);
        levelFour.addQuestion( new Questions("¿Quién escribió “La colmena”?", List.of(
                new Answers("Camilo José Cela", true),
                new Answers("Mario Benedetti", false),
                new Answers("Gabriel García Márquez", false),
                new Answers("Pablo Neruda", false)
        )));

        levelFour.addQuestion( new Questions("¿Qué animal mitológico da nombre a uno de los libros más conocidos de Thomas Hobbes??", List.of(
                new Answers("Basilisco", false),
                new Answers("Quimera", false),
                new Answers("Leviatán", true),
                new Answers("Toro de Creta", false)
        )));
        levelFour.addQuestion( new Questions("¿Qué pianista y cantante de jazz compuso un álbum titulado “Glad Rag Doll”?", List.of(
                new Answers("Carla Bley", false),
                new Answers("Erroll Garner", false),
                new Answers("Diana Krall", true),
                new Answers("Bud Powell", false)
        )));
        levelFour.addQuestion( new Questions("¿Cómo se llama el pintor noruego autor de la obra “El Grito”?", List.of(
                new Answers("Edvard Munch", true),
                new Answers("Erik Werenskiold", false),
                new Answers("Harald Sohlber", false),
                new Answers("Ragnhild Kaarbø", false)
        )));
        levelFour.addQuestion( new Questions("¿Qué pintor hizo el cuadro llamado “La joven de la perla”?", List.of(
                new Answers("Gustav Klimt", false),
                new Answers("Johannes Vermeer", true),
                new Answers("El Greco", false),
                new Answers("Alberto Durero", false)
        )));

        totalPrize += levelFour.getTotalPrize();
        if (levelFour.printQuestion()== 0) {
            Prizes prize = new Prizes(player);
            prize.loose();
        }

      return totalPrize;

    }
    public int  newDataLevelFive (String player, int totalPrize) {
        Category levelFive = new Category(10000);
        levelFive.addQuestion( new Questions("¿Cuáles son las bases nitrogenadas del ADN?", List.of(
                new Answers("citosina, uracilo y timina", true),
                new Answers("guanina, adenina, timina y citosina.", false),
                new Answers("adenosina, flavina, riboflavina, citosina", false),
                new Answers("guanodina, timidina, citisina", false)
        )));

        levelFive.addQuestion( new Questions("¿Qué especie de árbol de uso frecuente en la llamada medicina tradicional china es un ejemplo de fósil viviente por sus antiquísimos orígenes??", List.of(
                new Answers("Gingko biloba", true),
                new Answers("Cupressus chengiana", false),
                new Answers("Nageia nagi", false),
                new Answers("Picea brachytyla", false)
        )));
        levelFive.addQuestion( new Questions("¿En qué archipiélago vive la única especie de cormorán que no es capaz de volar??", List.of(
                new Answers("Archipiélago de Mergui", false),
                new Answers("Archipiélago de Hochelaga", false),
                new Answers("Islas Paracelso", false),
                new Answers("Islas Galápagos", true)
        )));
        levelFive.addQuestion( new Questions("¿Con qué denominación se conoce la línea dibujada por las estrellas Alnitak, Alnilam y Mintaka vistas desde nuestro planeta?", List.of(
                new Answers("Osa Mayor", false),
                new Answers("Cygnus", false),
                new Answers("Orión", true),
                new Answers("Pegaso", false)
        )));
        levelFive.addQuestion( new Questions("¿Cómo se llama el tipo de célula nerviosa más abundante en el cerebro humano??", List.of(
                new Answers("Neuronas", false),
                new Answers("Gliales", true),
                new Answers("Dendritas", false),
                new Answers("Astrositas", false)
        )));
        totalPrize += levelFive.getTotalPrize();
        if (levelFive.printQuestion()== 0) {
            Prizes prize = new Prizes(player);
            prize.loose();
        }

      return  totalPrize;

    }

}