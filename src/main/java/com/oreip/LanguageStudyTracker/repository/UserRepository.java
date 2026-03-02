package com.oreip.LanguageStudyTracker.repository;

import com.oreip.LanguageStudyTracker.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
