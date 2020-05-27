package lk.sms.dto;

import lk.sms.entity.DocUrl;
import lk.sms.entity.Faculty;

public class StudentDTO {

    public class DocUrl{
        private lk.sms.entity.DocUrl url;

        public DocUrl(lk.sms.entity.DocUrl url) {
            this.url = url;
        }

        public lk.sms.entity.DocUrl getUrl() {
            return url;
        }

        public void setUrl(lk.sms.entity.DocUrl url) {
            this.url = url;
        }
    }

    private String sId;
    private String name;
    private String batch;
    private String degree;
    private String email;
    private DocUrl docUrl;
    private Faculty faculty;

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public DocUrl getDocUrl() {
        return docUrl;
    }

    public void setDocUrl(DocUrl docUrl) {
        this.docUrl = docUrl;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }
}
