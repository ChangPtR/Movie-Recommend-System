package com.neu.model;

public class Occupation {
    private int oid;
    private String occupation;

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    @Override
    public String toString() {
        return "Occupation{" +
                "oid=" + oid +
                ", occupation='" + occupation + '\'' +
                '}';
    }
}
