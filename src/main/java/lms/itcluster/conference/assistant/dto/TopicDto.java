package lms.itcluster.conference.assistant.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
/* DTO for topic */
public class TopicDto {

    private long id;
    private String title;
    private String speaker;
    private String annotation;
    private long confId;
}
