package com.APIclubApp.clubApp.service;
import com.APIclubApp.clubApp.model.Player;

import java.util.List;

public interface PlayerService {

    List<Player> listAllPlayers();

    Player addPlayer(Player player);

    Player getPlayerById(Long id);

    Player updatePlayer(Player player);

    void deleteClub(Long id);

    Player getPlayerByDNI(String dni);
}
