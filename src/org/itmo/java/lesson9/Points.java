package org.itmo.java.lesson9;

import java.util.HashMap;

public class Points {
    public HashMap<User, Integer> pointsMap = new HashMap<>();

    public Integer getPoints(User user) {
        return pointsMap.get(user);
    }

    public void addPoints(User user, int points) {
        pointsMap.put(user, points);
    }

    public void addRandomPoints(User user) {
        int points = (int) (Math.random() * 1000);
        addPoints(user, points);
    }

}
