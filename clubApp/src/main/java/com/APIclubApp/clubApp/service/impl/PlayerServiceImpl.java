package com.APIclubApp.clubApp.service.impl;

import com.APIclubApp.clubApp.model.Player;
import com.APIclubApp.clubApp.repository.PlayerRepository;
import com.APIclubApp.clubApp.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerServiceImpl implements PlayerService {

    @Autowired
    public PlayerRepository playerRepository;

    @Override
    public List<Player> listAllPlayers() {
        return playerRepository.findAll();
    }

    @Override
    public Player addPlayer(Player player) {
        return playerRepository.save(player);
    }

    @Override
    public Player getPlayerById(Long id) {
        return playerRepository.findById(id).get();
    }

    @Override
    public Player updatePlayer(Player player) {
        return playerRepository.save(player);
    }

    @Override
    public void deleteClub(Long id) {
        playerRepository.deleteById(id);
    }

    @Override
    public Player getPlayerByDNI(String dni) {
        return playerRepository.findByUserDni(dni);
    }
}
