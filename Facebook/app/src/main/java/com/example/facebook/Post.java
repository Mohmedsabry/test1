package com.example.facebook;

import java.io.Serializable;

public class Post  implements Serializable {
    private String name,body,date;
    private  int followers,following,post;

    public Post(String name, String body, String date, int followers, int following, int post) {
        this.name = name;
        this.body = body;
        this.date = date;
        this.followers = followers;
        this.following = following;
        this.post = post;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getFollowers() {
        return followers;
    }

    public void setFollowers(int followers) {
        this.followers = followers;
    }

    public int getFollowing() {
        return following;
    }

    public void setFollowing(int following) {
        this.following = following;
    }

    public int getPost() {
        return post;
    }

    public void setPost(int post) {
        this.post = post;
    }
}
