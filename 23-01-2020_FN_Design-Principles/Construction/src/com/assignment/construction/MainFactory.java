package com.assignment.construction;

public class MainFactory {
    public static void main(String[] args) {
        RawMaterial brick = RawMaterialFactory.getInstance("brick");
        RawMaterial cement = RawMaterialFactory.getInstance("cement");
        RawMaterial wood = RawMaterialFactory.getInstance("wood");

        wood.blend();
        brick.blend();
        cement.blend();
    }
}
