package com.gameOrganiser.palyer.playerfactory;

import com.gameOrganiser.palyer.model.Player;
import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PlayerRepository extends CrudRepository<Player,Long>{

    @AllowFiltering
    List<Player> findByEmail(String email);
}
