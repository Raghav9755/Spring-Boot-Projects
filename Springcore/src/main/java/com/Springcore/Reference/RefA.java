package com.Springcore.Reference;
public class RefA {
    private int x;
    private RefB ob;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public RefB getOb() {
        return ob;
    }

    public void setOb(RefB ob) {
        this.ob = ob;
    }

    public RefA() {
        super();
    }

    @Override
    public String toString() {
        return "RefA{" +
                "x=" + x +
                ", ob=" + ob +
                '}';
    }
}
