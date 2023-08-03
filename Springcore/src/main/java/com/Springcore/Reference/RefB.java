package com.Springcore.Reference;

public class RefB {
    private int y;

    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

    public RefB() {
        super();
    }

    @Override
    public String toString() {
        return "RefB{" +
                "y=" + y +
                '}';
    }
}
