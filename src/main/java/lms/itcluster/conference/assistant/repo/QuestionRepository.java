package lms.itcluster.conference.assistant.repo;

import lms.itcluster.conference.assistant.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
    List<Question> findByTopicId(long topicId);
}
