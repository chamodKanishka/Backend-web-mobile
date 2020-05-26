package lk.sms.entity;

import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ShuttleTimetable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String toUni;
    private String forUni;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getToUni() {
        return toUni;
    }

    public void setToUni(String toUni) {
        this.toUni = toUni;
    }

    public String getForUni() {
        return forUni;
    }

    public void setForUni(String forUni) {
        this.forUni = forUni;
    }
}
