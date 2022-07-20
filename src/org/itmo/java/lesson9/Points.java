package org.itmo.java.lesson9;

import java.util.HashMap;
import java.util.Map;

public class Points {
    public Map<User, Integer> pointsMap = new HashMap<>();

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

    public int getPointsByName(String name) {
        for (User user : pointsMap.keySet()) {
            if (user.getName().equals(name)) {
                return pointsMap.get(user);
            }
        }
        return -1;
    }

}
