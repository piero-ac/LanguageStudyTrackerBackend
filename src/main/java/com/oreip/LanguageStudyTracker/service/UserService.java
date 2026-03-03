package com.oreip.LanguageStudyTracker.service;

import com.oreip.LanguageStudyTracker.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User findByInt(int id);
    User save(User user);
    void deleteById(int id);
}
