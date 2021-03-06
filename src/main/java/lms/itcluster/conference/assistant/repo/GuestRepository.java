package lms.itcluster.conference.assistant.repo;

import lms.itcluster.conference.assistant.entity.Guest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository  extends JpaRepository<Guest, Long> {
    Guest getByEmail(String email);
}
