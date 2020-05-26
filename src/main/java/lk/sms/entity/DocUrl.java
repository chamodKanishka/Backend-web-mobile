package lk.sms.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DocUrl {

    @Id
    private long id;
    private String batch;
    private String degree;
    private String examUrl;
    private String lecUrl;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getExamUrl() {
        return examUrl;
    }

    public void setExamUrl(String examUrl) {
        this.examUrl = examUrl;
    }

    public String getLecUrl() {
        return lecUrl;
    }

    public void setLecUrl(String lecUrl) {
        this.lecUrl = lecUrl;
    }

    @Override
    public String toString() {
        return "DocUrl{" +
                "id=" + id +
                ", batch='" + batch + '\'' +
                ", degree='" + degree + '\'' +
                ", examUrl='" + examUrl + '\'' +
                ", lecUrl='" + lecUrl + '\'' +
                '}';
    }
}
