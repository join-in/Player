package com.gameOrganiser.palyer.playerfactory;


import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;


@Configuration
@EnableCassandraRepositories
public class PlayerConfig extends AbstractCassandraConfiguration {


    @Override
    public String getContactPoints() {
        return "localhost";
    }

    @Override
    protected String getKeyspaceName() {
        return "game_player_ks";
    }


}
