package com.oreip.LanguageStudyTracker.service;

import com.oreip.LanguageStudyTracker.entity.Language;
import com.oreip.LanguageStudyTracker.repository.LanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LanguageServiceImpl implements LanguageService {

    private LanguageRepository repository;

    @Autowired
    public LanguageServiceImpl(LanguageRepository theRepository) {
        repository = theRepository;
    }
    @Override
    public List<Language> findAll() {
        return repository.findAll();
    }

    @Override
    public Language findById(int id) {
        Optional<Language> result = repository.findById(id);

        if(result.isPresent()) {
            return result.get();
        } else {
            throw  new RuntimeException("Language not found with id: " + id);
        }
    }
}
