package lms.itcluster.conference.assistant.mapper;

import lms.itcluster.conference.assistant.dto.ConferenceDto;
import lms.itcluster.conference.assistant.entity.Conference;

import java.util.List;
import java.util.stream.Collectors;

public class ConferenceMapper {
    public static ConferenceDto toDto(Conference entity) {
        return new ConferenceDto
                (entity.getId(),
                        entity.getName(),
                        entity.getDate(),
                        entity.getVenue(),
                        entity.getDescription()
                );
    }

    public static Conference fromDto(ConferenceDto dto) {
        Conference c = new Conference();
        c.setId(dto.getId());
        c.setName(dto.getName());
        c.setDate(dto.getDate());
        c.setVenue(dto.getVenue());
        c.setDescription(dto.getDescription());
        return c;
    }

    public static List<ConferenceDto> toDtoList(List<Conference> entities) {
        return entities
                .stream()
                .map((e) -> new ConferenceDto(e.getId(), e.getName(), e.getDate(), e.getVenue(), e.getDescription()))
                .collect(Collectors.toList());
    }

    public static List<Conference> toEntityList(List<ConferenceDto> dtos) {
        return dtos
                .stream()
                .map(ConferenceMapper::fromDto)
                .collect(Collectors.toList());
    }


}
