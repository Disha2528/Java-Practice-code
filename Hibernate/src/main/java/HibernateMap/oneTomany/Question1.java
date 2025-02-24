package HibernateMap.oneTomany;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Question1 {

    @Id
    @Column(name="Question_id")
    private int qId;
    private String question;

    @OneToMany(mappedBy = "question")
    private List<Answer1> answer;

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

    public List<Answer1> getAnswer() {
        return answer;
    }

    public void setAnswer(List<Answer1> answer) {
        this.answer = answer;
    }

    public Question1(int qId, String question, List<Answer1> answer) {
        this.qId = qId;
        this.question = question;
        this.answer = answer;
    }

    public Question1() {
    }
}
