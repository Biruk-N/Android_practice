package com.example.listview;

public class Customer {
    private String name;
    private String birthday;
    private String age;

    public Customer(String name, String birthday, String age) {
        this.name = name;
        this.birthday = birthday;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
