package HibernateMap.oneToone;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Answer {

    @Id
    @Column(name = "Answer_id")
    private int aId;
    private String answer;

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

    public Answer(int aId, String answer) {
        this.aId = aId;
        this.answer = answer;
    }

    public Answer() {
    }
}
