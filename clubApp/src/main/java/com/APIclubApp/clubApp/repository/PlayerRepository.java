package com.APIclubApp.clubApp.repository;

import com.APIclubApp.clubApp.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long> {

    Player findByUserDni(String dni);
}
