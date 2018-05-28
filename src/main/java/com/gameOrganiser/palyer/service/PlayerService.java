package com.gameOrganiser.palyer.service;

import com.gameOrganiser.palyer.model.Player;
import com.gameOrganiser.palyer.playerfactory.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.springframework.data.cassandra.core.query.Query.query;

@Service
@Profile({"player", "default"})
public class PlayerService {

@Autowired

public PlayerService(PlayerRepository repository) {
    this.playerRepository = repository;
}

private final PlayerRepository playerRepository;

    public void savePlayer(Player player){
        playerRepository.save(player);
    }


    public List<Player> findPlayerByEmail(String email){
        return playerRepository.findByEmail(email);
    }


}
