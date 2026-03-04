package com.oreip.LanguageStudyTracker.service;

import com.oreip.LanguageStudyTracker.entity.StudySession;
import com.oreip.LanguageStudyTracker.repository.StudySessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudySessionServiceImpl implements StudySessionService{

    private StudySessionRepository repository;

    @Autowired
    public StudySessionServiceImpl(StudySessionRepository theRepository) {
        repository = theRepository;
    }

    @Override
    public List<StudySession> findByUserId(int theId) {
        return repository.findByUserId(theId);
    }

    @Override
    public List<StudySession> findByUserIdAndLanguageId(int userId, int languageId) {
        return repository.findByUserIdAndLanguageId(userId, languageId);
    }

    @Override
    @Transactional
    public StudySession save(StudySession theSession) {
        return repository.save(theSession);
    }
}
