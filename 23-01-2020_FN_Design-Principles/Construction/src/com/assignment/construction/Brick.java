package com.assignment.construction;

public class Brick  implements RawMaterial {
    String name;
    Brick(String name) {
        this.name = name;
    }

    public void blend() {
        System.out.println("blending brick with building");
    }
}
