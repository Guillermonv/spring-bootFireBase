package com.du.demo.model;

public class Fighter {

    String name;
    String record;
    Integer height;
    Integer weight;

    public String getMartialArt() {
        return martialArt;
    }

    public void setMartialArt(String martialArt) {
        this.martialArt = martialArt;
    }

    String martialArt;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRecord() {
        return record;
    }

    public void setRecord(String record) {
        this.record = record;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}
