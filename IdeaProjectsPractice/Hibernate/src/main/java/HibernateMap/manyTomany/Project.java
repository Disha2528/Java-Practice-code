package HibernateMap.manyTomany;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

import java.util.List;

@Entity
public class Project {
    @Id
    private int pid;
    private String pname;
    @ManyToMany (mappedBy = "p")
    private List<Emp> e;

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public List<Emp> getE() {
        return e;
    }

    public void setE(List<Emp> e) {
        this.e = e;
    }

    public Project(int pid, String pname, List<Emp> e) {
        this.pid = pid;
        this.pname = pname;
        this.e = e;
    }

    public Project() {
    }
}
