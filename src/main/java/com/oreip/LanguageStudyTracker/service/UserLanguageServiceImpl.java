package com.oreip.LanguageStudyTracker.service;

import com.oreip.LanguageStudyTracker.entity.UserLanguage;
import com.oreip.LanguageStudyTracker.repository.UserLanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserLanguageServiceImpl implements UserLanguageService {

    private UserLanguageRepository repository;

    @Autowired
    public UserLanguageServiceImpl(UserLanguageRepository theRepository) {
        repository = theRepository;
    }

    @Override
    public List<UserLanguage> findAllByUserId(int theId) {
        return repository.findAllByUserId(theId);
    }

    @Override
    @Transactional
    public UserLanguage save(UserLanguage theUserLanguage) {
        return repository.save(theUserLanguage);
    }
}
