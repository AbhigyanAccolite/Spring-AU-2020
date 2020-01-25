package com.assignment.construction;

public class RawMaterialFactory {
    public static RawMaterial getInstance(String name) {
        if(name == "cement")
            return new Cement(name);
        else if(name == "brick")
            return new Brick(name);
        else if(name == "wood")
            return new Wood(name);

        return null;
    }
}
