package questions;
/**
 * @version  1.0.1
 * @author Juan Ramallo
 * Clase respuestas, para generar el listado de las mismas, y obtener cuál es correcta.
 * */
public class Answers {


    String answer;
    boolean correctAnswer;

    /**
     * Constructor de clase
     * @param answer
     * @param correctAnswer
     */
    public Answers(String answer , boolean correctAnswer) {


        this.answer = answer;
        this.correctAnswer = correctAnswer;
    }
}
