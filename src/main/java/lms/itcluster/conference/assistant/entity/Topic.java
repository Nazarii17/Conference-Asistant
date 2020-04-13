package lms.itcluster.conference.assistant.entity;

import lms.itcluster.conference.assistant.constant.ValidationConstants;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "topic")

public class Topic {

    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "title", unique = true, nullable = false)
    @NotNull
    @NotBlank(message = "Please fill the title")
    private String title;
    private String speaker;
    @Column(name = "annotation", unique = true, nullable = false)
    @NotNull
    @NotBlank(message = "Please fill the annotation")
    private String annotation;

    @ManyToOne
    private Conference conference;
}
