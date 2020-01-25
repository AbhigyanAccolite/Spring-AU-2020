package com.assignment.construction;

public class Wood implements RawMaterial {
    String name;
    Wood(String name) {
        this.name = name;
    }

    public void blend() {
        System.out.println("Blending wood in the building");
    }
}
