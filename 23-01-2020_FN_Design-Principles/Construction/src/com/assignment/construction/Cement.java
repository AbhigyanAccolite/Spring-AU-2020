package com.assignment.construction;

public class Cement implements RawMaterial {
    String name;

    Cement(String name){
        this.name = name;
    }

    public void blend() {
        System.out.println("Blending cement with building");
    }
}
