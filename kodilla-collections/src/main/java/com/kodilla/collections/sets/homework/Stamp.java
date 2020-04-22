package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String stampName;
    private int stampWidth;
    private int stampHigth;
    private boolean isStampled;

    public Stamp(String stampName, int stampWidth, int stampHigth, boolean isStampled) {
        this.stampName = stampName;
        this.stampWidth = stampWidth;
        this.stampHigth = stampHigth;
        this.isStampled = isStampled;
    }

    public String getStampName() {
        return stampName;
    }

    public int getStampWidth() {
        return stampWidth;
    }

    public int getStampHigth() {
        return stampHigth;
    }

    public boolean isStampled() {
        return isStampled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return stampWidth == stamp.stampWidth &&
                stampHigth == stamp.stampHigth &&
                isStampled == stamp.isStampled &&
                Objects.equals(stampName, stamp.stampName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stampName, stampWidth, stampHigth, isStampled);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampName='" + stampName + '\'' +
                ", stampWidth=" + stampWidth +
                ", stampHigth=" + stampHigth +
                ", isStampled=" + isStampled +
                '}';
    }
}
