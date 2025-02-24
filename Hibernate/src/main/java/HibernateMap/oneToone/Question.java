package HibernateMap.oneToone;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Question {

    @Id
    @Column(name="Question_id")
    private int qId;
    private String question;
    @OneToOne
    private Answer answer;


    public int getqId() {
        return qId;
    }

    public void setqId(int qId) {
        this.qId = qId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }

    public Question(int qId, String question, Answer answer) {
        this.qId = qId;
        this.question = question;
        this.answer = answer;
    }

    public Question() {
    }
}
