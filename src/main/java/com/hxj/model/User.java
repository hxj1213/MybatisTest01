package com.hxj.model;

public class User {

    private String name;
    private String id;

    public User(){
        System.out.println("user的空构造方法被调用");
    }

    public User(String name) {
        this.name = name;
    }

    public User(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


}
