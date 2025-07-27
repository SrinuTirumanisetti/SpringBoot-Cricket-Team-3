/*
 * You can use the following import statements
 * 
 * import org.springframework.beans.factory.annotation.Autowired;
 * import org.springframework.http.HttpStatus;
 * import org.springframework.stereotype.Service;
 * import org.springframework.web.server.ResponseStatusException;
 * import java.util.*;
 * 
 */

// Write your code here

package com.example.player.service;

import com.example.player.model.Player;
import com.example.player.repository.PlayerRepository;
import com.example.player.repository.PlayerJpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class PlayerJpaService implements PlayerRepository {

    private final PlayerJpaRepository playerJpaRepository;

    @Autowired
    public PlayerJpaService(PlayerJpaRepository playerJpaRepository) {
        this.playerJpaRepository = playerJpaRepository;
    }

    @Override
    public List<Player> getPlayers() {
        return playerJpaRepository.findAll();
    }
}
