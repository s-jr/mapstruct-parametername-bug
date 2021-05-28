package de.example;

public class TargetParent {

    private int a;
    private TargetChild child;

    public int getA() {
        return a;
    }

    public void setA(final int a) {
        this.a = a;
    }

    public TargetChild getChild() {
        return child;
    }

    public void setChild(final TargetChild child) {
        this.child = child;
    }
}
