package lms.itcluster.conference.assistant.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "conference")
public class Conference {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "name", unique = true, nullable = false)
    @NotNull
    @NotBlank(message = "Please fill the name!")
    private String name;
    @Column(name = "date")
    private Date date;
    @Column(name = "venue", nullable = false)
    @NotNull
    @NotBlank(message = "Please fill the Venue!")
    private String venue;
    @Column(name = "description", length = 2048)
    @NotNull
    @NotBlank(message = "Please fill the Description!")
    @Size(max = 2048, message = "Description is to long!")
    private String description;
}
