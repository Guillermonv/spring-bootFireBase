package com.du.demo.model;

import java.util.Date;

public class Fight {

    Fighter fighter;
    Fighter openent;
    Date event;
    String location;
    String result;

    public Fighter getFighter() {
        return fighter;
    }

    public void setFighter(Fighter fighter) {
        this.fighter = fighter;
    }

    public Fighter getOpenent() {
        return openent;
    }

    public void setOpenent(Fighter openent) {
        this.openent = openent;
    }

    public Date getEvent() {
        return event;
    }

    public void setEvent(Date event) {
        this.event = event;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
