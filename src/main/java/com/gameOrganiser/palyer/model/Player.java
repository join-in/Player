package com.gameOrganiser.palyer.model;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.io.Serializable;

@Table("player")
public class Player implements Serializable {

    @PrimaryKey
    private Long userid;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Player)) return false;

        Player player = (Player) o;

        if (getUserid() != null ? !getUserid().equals(player.getUserid()) : player.getUserid() != null) return false;
        if (getFirst_name() != null ? !getFirst_name().equals(player.getFirst_name()) : player.getFirst_name() != null)
            return false;
        if (getLast_name() != null ? !getLast_name().equals(player.getLast_name()) : player.getLast_name() != null)
            return false;
        if (getEmail() != null ? !getEmail().equals(player.getEmail()) : player.getEmail() != null) return false;
        return getTop_score() != null ? getTop_score().equals(player.getTop_score()) : player.getTop_score() == null;
    }

    @Override
    public int hashCode() {
        int result = getUserid() != null ? getUserid().hashCode() : 0;
        result = 31 * result + (getFirst_name() != null ? getFirst_name().hashCode() : 0);
        result = 31 * result + (getLast_name() != null ? getLast_name().hashCode() : 0);
        result = 31 * result + (getEmail() != null ? getEmail().hashCode() : 0);
        result = 31 * result + (getTop_score() != null ? getTop_score().hashCode() : 0);
        return result;
    }

    private String first_name;
    private String last_name;
    private String email;
    private Integer top_score;


    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getTop_score() {
        return top_score;
    }

    public void setTop_score(Integer top_score) {
        this.top_score = top_score;
    }


    public Player() {

    }
    public Player(Long userid, String first_name, String last_name, String email, Integer top_score) {
        super();
        this.userid = userid;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.top_score = top_score;
    }


}
