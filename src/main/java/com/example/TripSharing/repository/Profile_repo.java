package com.example.TripSharing.repository;

import com.example.TripSharing.model.ProfileSection;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Profile_repo extends JpaRepository<ProfileSection,Long> {
}
