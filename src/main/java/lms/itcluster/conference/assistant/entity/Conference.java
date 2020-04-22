package lms.itcluster.conference.assistant.entity;

import lms.itcluster.conference.assistant.constant.ValidationConstants;
import lombok.AllArgsConstructor;
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
    @JoinColumn(name = "name", unique = true, nullable = false)
    @NotNull
    @NotBlank(message = ValidationConstants.CONFERENCE_EMPTY_NAME)
    private String name;
    @JoinColumn(name = "logo")
    private String logo;
    @JoinColumn(name = "date")
    private Date date;
    @JoinColumn(name = "venue", nullable = false)
    @NotNull
    @NotBlank(message = ValidationConstants.CONFERENCE_EMPTY_VENUE)
    private String venue;
    @JoinColumn(name = "description")
    @NotNull
    @NotBlank(message = ValidationConstants.CONFERENCE_EMPTY_DESCRIPTION)
    @Size(
            min = ValidationConstants.CONFERENCE_DESCRIPTION_MIN_LENGTH,
            max = ValidationConstants.CONFERENCE_DESCRIPTION_MAX_LENGTH,
            message = ValidationConstants.CONFERENCE_DESCRIPTION_MAX_SIZE)
    private String description;
}