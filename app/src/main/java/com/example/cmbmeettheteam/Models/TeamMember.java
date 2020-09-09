package com.example.cmbmeettheteam.Models;

public class TeamMember {

    private final String TAG = this.getClass().getSimpleName();

    private String id;
    private String name;
    private String position;
    private String imageLink;
    private String personality;
    private String interests;
    private String datingPrefs;

    public TeamMember() {
    }

    public TeamMember(String id, String name, String position, String imageLink, String personality, String interests, String datingPrefs) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.imageLink = imageLink;
        this.personality = personality;
        this.interests = interests;
        this.datingPrefs = datingPrefs;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    public String getPersonality() {
        return personality;
    }

    public void setPersonality(String personality) {
        this.personality = personality;
    }

    public String getInterests() {
        return interests;
    }

    public void setInterests(String interests) {
        this.interests = interests;
    }

    public String getDatingPrefs() {
        return datingPrefs;
    }

    public void setDatingPrefs(String datingPrefs) {
        this.datingPrefs = datingPrefs;
    }
}
