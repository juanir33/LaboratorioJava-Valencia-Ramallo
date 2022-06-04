package questions;

import utilities.Messages;

import java.util.ArrayList;
import java.util.List;

public class Category {


        private final List<Question> questionList;
        private int totalPrize;
        private int hitsCount;
        Messages msg = Messages.getInstance();

        public Category() {
            this.questionList = new ArrayList<>();
            totalPrize = 0;
        }

        public int getTotalPrize() {
            return totalPrize;
        }

        public void addQuestion(Question question) {
            this.questionList.add(question);
        }

        public int printQuestion() {

            int index = 1;
            int randomNumber = (int) (Math.random() * 5) + 1;
            for (Question q : questionList) {
                boolean correct = q.printQuestion(index, randomNumber);
                index++;
                if (correct) {
                    msg.showCorrect();
                    hitsCount++;
                   totalPrize += q.getPrize();
                }
            }
            return this.hitsCount;
        }
    }


