package com.codegym.animals;

import com.codegym.edibles.Edibles;

public class Tiger extends Animals implements Edibles {
    @Override
    public String makeSound() {
        return "Tiger: roarrr";
    }

    @Override
    public String howToEat() {
        return "flesh-eating";
    }
}

