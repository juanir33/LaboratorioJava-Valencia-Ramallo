package questions;

import utilities.Messages;

import java.util.ArrayList;
import java.util.List;

public class Category {

    private final List<Questions> questionsList;
    private int totalPoints;

    private int hitsCount;

    Messages msg;

    {
        msg = new Messages();
    }


    public Category( ) {
        questionsList = new ArrayList<>();
        totalPoints = 0;
    }

    public int getTotalPoints() {
        return this.totalPoints;
    }

    public void addQuestions(Question q) {
        this.questionsList.add(q);
    }

    public int showQuestion() {

        int index = 1;
        int randomIndex = (int) (Math.random() * 5) + 1;
        for (Question q : questionsList) {
            boolean correct = q.showQuestion(index, randomIndex);
            index++;
            if (correct) {
                msg.showCorrect();
                this.hitsCount++;
                totalPoints += q.getPoints();
            }
        }
        return this.hitsCount;
    }
}
