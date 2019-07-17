package com.exit.wsk.entity;

import java.io.Serializable;

public class Clazz implements Serializable {
    private int cid;
    private String cname;

    public Clazz(int cid, String cname) {
        this.cid = cid;
        this.cname = cname;
    }

    public Clazz() {

    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                '}';
    }
}
