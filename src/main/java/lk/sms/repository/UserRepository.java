package lk.sms.repository;

import lk.sms.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, String> {

    @Query(value = "FROM User WHERE userEmail=?1 AND userPassword=?2 AND userRole=?3")
    User getUser(String username, String userPassword, int userRole);

}
