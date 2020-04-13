package lms.itcluster.conference.assistant.entity;

import lms.itcluster.conference.assistant.constant.ValidationConstants;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "guest")

public class Guest {

    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "email", unique = true, nullable = false)
    @NotNull
    @NotBlank(message = "Please fill the email")
    private String email;

    @ManyToMany(mappedBy = "likes")
    private Set<Question> liked;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Guest guest = (Guest) o;
        return id.equals(guest.id) &&
                email.equals(guest.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email);
    }
}
