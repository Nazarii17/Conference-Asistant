package lms.itcluster.conference.assistant.service.impl;

import lms.itcluster.conference.assistant.repo.ConferenceRepository;
import lms.itcluster.conference.assistant.service.ConferenceService;
import lms.itcluster.conference.assistant.dto.ConferenceDto;
import lms.itcluster.conference.assistant.mapper.ConferenceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConferenceServiceImpl implements ConferenceService {

    @Autowired
    ConferenceRepository conferenceRepository;

    @Override
    public ConferenceDto findById(long id) {
        return ConferenceMapper.toDto(conferenceRepository.findById(id).get());
    }

    @Override
    public List<ConferenceDto> findAll() {
        return ConferenceMapper.toDtoList(conferenceRepository.findAll());
    }
}
