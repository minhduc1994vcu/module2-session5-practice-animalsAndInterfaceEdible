package com.codegym.animals;

import com.codegym.edibles.Edibles;

public class Chicken extends Animals implements Edibles {
    @Override
    public String makeSound() {
        return "chicken: cloack";
    }

    @Override
    public String howToEat() {
        return "could be fried" ;
    }
}
