// Write your code here

package com.example.player.repository;

import com.example.player.model.Player;
import java.util.*;

public interface PlayerRepository{
    List<Player> getPlayers();
    Player addPlayer(Player player);
    Player getPlayerById(int playerId);
}