package questions;

import utilities.Messages;

import java.util.List;

import static utilities.Messages.logger;
import static utilities.Messages.scan;

public class Questions {
    /**
     * Clase para manejar preguntas
     */

        private final String question;
        private final List<Answers> answersList;
        private static final String OPTIONS = "1234";

        Messages msg = Messages.getInstance();

    /**
     * Constructor de la clase, que utilizaremos para generar la base de preguntas por categoria.
     * @param question tipo String.
     * @param answersList tipo Array list, cada item es una clase Answer.
     *
     */

    public Questions(String question, List<Answers> answersList) {

            this.question = question;
            this.answersList = answersList;

        }





    /**
     * Metodo para conocer si la respuesta es correcta.
     * @param selectAnswer tipo character, es la eleccion del usuario.
     * @return devuelve un booleano, segun la eleccion del jugador.
     */
    public boolean correctAnswer(char selectAnswer) {

            int place = OPTIONS.indexOf(selectAnswer);
            if (place == -1) {
                return false;
            }
            return this.answersList.get(place).correctAnswer;
        }

    /**
     * Metodo por el cual imprimimos en consola una pregunta al azar de la categoria a jugar.
     * @param number tipo Integer
     * @param randomNumber tipo integer, se obtiene en categoria.
     * @return boolean nos devuelve si la opción elegida es correcta o no.
     */
    public boolean printQuestionAnswer(int number, int randomNumber) {

            if (number == randomNumber) {
                logger.info(this.question);
                int index = 0;
                for (Answers ans : this.answersList) {
                    System.out.printf("%c) %s%n", OPTIONS.charAt(index), ans.answer);
                    index++;
                }
                msg.showOptionAnswers();

                char answer = scan.nextLine().charAt(0);
                return this.correctAnswer(answer);
            }
            return false;
        }
    }

