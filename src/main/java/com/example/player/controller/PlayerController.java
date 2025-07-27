/*
 * 
 * You can use the following import statemets
 * 
 * import org.springframework.web.bind.annotation.*;
 * import java.util.*;
 * import org.springframework.beans.factory.annotation.Autowired;
 * 
 */

// Write your code here
package com.example.player.controller;

import com.example.player.model.Player;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.player.service.PlayerJpaService;

@RestController
public class PlayerController{

    @Autowired
    public PlayerJpaService service;

    @GetMapping("/players")
    public List<Player> getPlayers(){
        return service.getPlayers();
    }

    @PostMapping("/players")
    public Player addPlayer(@RequestBody Player player){
        return service.addPlayer(player);
    }

    @GetMapping("/players/{playerId}")
    public Player getPlayerById(@PathVariable("playerId") int playerId){
        return service.getPlayerById(playerId);
    }

    @PutMapping("/players/{playerId}")
    public Player updatePlayer(@RequestBody Player player,@PathVariable("playerId") int playerId){
        return service.updatePlayer(playerId,player);
    }

    @DeleteMapping("/players/{playerId}")
    public void deletePlayer(@PathVariable("playerId") int playerId){
        service.deletePlayer(playerId);
    }
}