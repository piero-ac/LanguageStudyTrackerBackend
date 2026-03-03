package com.oreip.LanguageStudyTracker.service;

import com.oreip.LanguageStudyTracker.entity.User;
import com.oreip.LanguageStudyTracker.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    private UserRepository repository;

    @Autowired
    public UserServiceImpl(UserRepository theRepository) {
        repository = theRepository;
    }

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }

    @Override
    public User findByInt(int id) {
       Optional<User> result = repository.findById(id);
        if(result.isPresent()) {
            return result.get();
        } else {
            throw  new RuntimeException("User not found with id: " + id);
        }
    }

    @Override
    @Transactional
    public User save(User user) {
        return repository.save(user);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        repository.deleteById(id);
    }
}
