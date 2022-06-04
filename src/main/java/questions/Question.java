package questions;

import utilities.Messages;

import java.util.List;

import static utilities.Messages.logger;
import static utilities.Messages.scan;

public class Question {


        private final String question;
        private final List<Answers> answersList;
        private static final String OPTIONS = "1234";
        private final int prize;
        Messages msg = Messages.getInstance();

        public Question(String question, List<Answers> answersList, int prize) {
            this.question = question;
            this.answersList = answersList;
            this.prize = prize;
        }

        public int getPrize() {
            return prize;
        }

        public void addAnswer(Answers ans) {
            this.answersList.add(ans);
        }

        public boolean correctAnswer(char selectAnswer) {

            int place = OPTIONS.indexOf(selectAnswer);
            if (place == -1) {
                return false;
            }
            return this.answersList.get(place).correctAnswer;
        }

        public boolean printQuestion(int number, int randomNumber) {

            if (number == randomNumber) {
                logger.info(this.question);
                int index = 0;
                for (Answers ans : this.answersList) {
                    System.out.printf("%c) %s\n", OPTIONS.charAt(index), ans.answer);
                    index++;
                }
                msg.showOptionAnswers();

                char answer = scan.nextLine().charAt(0);
                return this.correctAnswer(answer);
            }
            return false;
        }
    }

