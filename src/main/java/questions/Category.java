package questions;

import utilities.Messages;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Category {

    private static final Random r = new Random();
        private final List<Questions> questionList;
        private final int totalPrize;
        private int hitsCount;
        Messages msg = Messages.getInstance();

        public Category(int totalPrize) {
            this.questionList = new ArrayList<>();
            this.totalPrize = totalPrize;
        }

        public int getTotalPrize() {
            return totalPrize;
        }

        public void addQuestion(Questions question) {
            this.questionList.add(question);
        }

    /**
     * Método para imprimir la pregunta y sus respuestas en la consola.
     * @return tipo integer, nos devuelve un valor de aciertos, si pierde es 0 y finaliza el juego.
     */
    public int printQuestion() {

            int index = 0;

            int randomNumber = r.nextInt (5);
            for (Questions q : questionList) {
                boolean correct = q.printQuestionAnswer(index, randomNumber);
                index++;
                if (correct) {
                    msg.showCorrect();
                    hitsCount++;

                }
            }
            return this.hitsCount;
        }
    }


