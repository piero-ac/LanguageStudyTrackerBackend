package com.oreip.LanguageStudyTracker.repository;

import com.oreip.LanguageStudyTracker.entity.UserLanguage;
import com.oreip.LanguageStudyTracker.entity.UserLanguageId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserLanguageRepository  extends JpaRepository<UserLanguage, UserLanguageId> {
    List<UserLanguage> findAllByUserId(int theId);
}
