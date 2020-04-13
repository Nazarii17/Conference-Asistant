package lms.itcluster.conference.assistant.entity;

import lms.itcluster.conference.assistant.constant.ValidationConstants;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;
import java.util.Set;

import static lms.itcluster.conference.assistant.constant.ValidationConstants.CONFERENCE_DESCRIPTION_MAX_LENGTH;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "question")

public class Question {

    @Id
    @GeneratedValue
    private Long id;
    @JoinColumn(name = "body", unique = true, nullable = false)
    private String body;

    @ManyToOne
    @JoinColumn(name = "author", nullable = false)
    @NotNull
    @NotBlank(message = "Please fill the author")
    private Guest author;

    @ManyToOne
    @JoinColumn(name = "topic", nullable = false)
    @NotNull
    @NotBlank(message = "Please fill the topic name")
    private Topic topic;

    @ManyToMany(cascade = CascadeType.REFRESH)
    @JoinTable(name = "question_likes",
    joinColumns = @JoinColumn(name = "question_id"),
    inverseJoinColumns = @JoinColumn(name = "guest_id"))
    private Set<Guest> likes;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Question question = (Question) o;
        return id.equals(question.id) &&
                body.equals(question.body) &&
                author.equals(question.author) &&
                topic.equals(question.topic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, body, author, topic);
    }
}
