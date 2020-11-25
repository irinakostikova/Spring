package laba1.service;
import lombok.Data;

@Data
public class Question {

    private String answer;
    private String var;
    private String question;


    public Question(String question, String var, String answer) {

        this.question = question;
        this.var = var;
        this.answer = answer;
    }
}
