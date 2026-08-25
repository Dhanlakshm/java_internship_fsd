package com.myapp.model;

public class User {
    int id;
    String name;
    int age;
    String branch;

    public User(int id, String name, int age, String branch) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.branch = branch;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
