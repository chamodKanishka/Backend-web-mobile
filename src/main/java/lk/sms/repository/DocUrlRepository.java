package lk.sms.repository;

import lk.sms.entity.DocUrl;
import lk.sms.entity.Notes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DocUrlRepository extends JpaRepository<DocUrl, Long> {

    @Query(value = "FROM DocUrl WHERE degree=?1 AND batch=?2")
    DocUrl getDocUrl(String degree, String batch);

}
