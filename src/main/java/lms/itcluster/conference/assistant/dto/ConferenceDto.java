package lms.itcluster.conference.assistant.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
@AllArgsConstructor
public class ConferenceDto {

    private long id;
    @NotBlank(message = "Please fill the name!")
    private String name;
    private Date date;
    @NotBlank(message = "Please fill the Venue!")
    private String venue;
    @NotBlank(message = "Please fill the Description!")
    @Size(max = 2048, message = "Description is to long!")
    private String description;
}
