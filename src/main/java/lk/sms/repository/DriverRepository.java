package lk.sms.repository;

import lk.sms.entity.Drivers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepository extends JpaRepository<Drivers, String> {
}
