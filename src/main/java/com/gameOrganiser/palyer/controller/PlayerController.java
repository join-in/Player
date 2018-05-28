package com.gameOrganiser.palyer.controller;

import com.gameOrganiser.palyer.model.Player;
import com.gameOrganiser.palyer.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.concurrent.ThreadLocalRandom;


@CrossOrigin
@RestController
public class PlayerController {

    @Autowired
    public PlayerService playerService;
    @RequestMapping("/player/{email}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getPlayer(@PathVariable("email") String email) {
        return Response.status(201).entity(playerService.findPlayerByEmail(email)).header("Access-Control-Allow-Origin","*").build();

    }


    @RequestMapping(value = "/player/", method = RequestMethod.POST)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response savePlayer(@RequestBody Player player){

        Long random = ThreadLocalRandom.current().nextLong(10, 10000000);
        if (null==player) {
            return Response.status(400).entity("Invalid Player Details").build();
       }
        player.setUserid(random);
        playerService.savePlayer(player);
        return Response.status(201).entity("Player Profile saved").header("Access-Control-Allow-Origin","*").build();

    }


}
