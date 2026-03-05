package com.oreip.LanguageStudyTracker.service;

import com.oreip.LanguageStudyTracker.entity.SessionActivity;
import com.oreip.LanguageStudyTracker.repository.SessionActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SessionActivityServiceImpl implements SessionActivityService{

    private SessionActivityRepository repository;

    @Autowired
    public SessionActivityServiceImpl(SessionActivityRepository theRepository) {
        repository = theRepository;
    }


    @Override
    public List<SessionActivity> findByStudySessionId(int theId) {
        return repository.findByStudySessionId(theId);
    }

    @Override
    @Transactional
    public SessionActivity save(SessionActivity theActivity) {
        return repository.save(theActivity);
    }
}
