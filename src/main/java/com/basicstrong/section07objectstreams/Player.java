package com.basicstrong.section07objectstreams;

import java.io.Serial;
import java.io.Serializable;

public class Player implements Serializable {

    @Serial
    private static final long serialVersionUID = -7210520413567360533L;

    private Integer level;
    private Integer points;
    private String userName;

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "Player{" +
                "level=" + level +
                ", points=" + points +
                ", userName='" + userName + '\'' +
                '}';
    }
}