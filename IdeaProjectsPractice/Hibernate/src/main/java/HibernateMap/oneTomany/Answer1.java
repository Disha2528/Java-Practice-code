package HibernateMap.oneTomany;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Answer1 {

    @Id
    @Column(name = "Answer_id")
    private int aId;
    private String answer;

    @ManyToOne
    private Question1 question;  // Changed from Question to Question1

    public int getaId() {
        return aId;
    }

    public void setaId(int aId) {
        this.aId = aId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Question1 getQuestion() {  // Changed return type to Question1
        return question;
    }

    public void setQuestion(Question1 question) {  // Changed parameter type to Question1
        this.question = question;
    }

    public Answer1(int aId, String answer, Question1 question) {  // Changed constructor parameter type to Question1
        this.aId = aId;
        this.answer = answer;
        this.question = question;
    }

    public Answer1() {
    }
}
