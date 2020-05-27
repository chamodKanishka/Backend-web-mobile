package lk.sms.repository;

import lk.sms.entity.Students;
import lk.sms.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StudentRepository extends JpaRepository<Students, String> {

    @Query(value = "FROM Students WHERE email=?1")
    Students getStudent(String email);

}
