package lk.sms.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Faculty {
    @Id
    private long id;
    private String facultyName;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }
}
