package lk.sms.repository;

import lk.sms.entity.ShuttleTimetable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShuttleRepository extends JpaRepository<ShuttleTimetable, Long> {
}
