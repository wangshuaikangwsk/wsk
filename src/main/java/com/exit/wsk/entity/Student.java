package com.exit.wsk.entity;

import java.io.Serializable;

public class Student implements Serializable {
    private int id;
    private String name;
    private int age;
    private int cid;
    private String address;

    public Student(int id, String name, int age, int cid, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.cid = cid;
        this.address = address;
    }

    public Student() {
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

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", cid=" + cid +
                ", address='" + address + '\'' +
                '}';
    }
}
