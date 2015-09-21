package com.credit.model;

/**
 * Created by leo on 15/8/3.
 */
public class User {
    private int id;
    private int state;
    private String nickname;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getState() {
        return state;
    }
    public void setState(int state) {
        this.state = state;
    }
    public String getNickname() {
        return nickname;
    }

    public User(int id, int state, String nickname) {
        this.id = id;
        this.state = state;
        this.nickname = nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", state=" + state +
                ", nickname='" + nickname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (id != user.id) return false;
        if (state != user.state) return false;
        return nickname.equals(user.nickname);

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + state;
        result = 31 * result + nickname.hashCode();
        return result;
    }
}
