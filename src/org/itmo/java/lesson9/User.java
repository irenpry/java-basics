package org.itmo.java.lesson9;

public class User {
    private String name;
    static Integer userCount = 0;

    User() {
        this(generateUserName());
    }

    User(String name) {
        this.name = name;
        userCount++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private static String generateUserName() {
        return "User №" + userCount;
    }
}
