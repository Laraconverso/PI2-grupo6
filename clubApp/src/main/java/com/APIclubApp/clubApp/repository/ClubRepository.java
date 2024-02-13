package com.APIclubApp.clubApp.repository;

import com.APIclubApp.clubApp.model.Club;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClubRepository extends JpaRepository<Club, Long> {
}
