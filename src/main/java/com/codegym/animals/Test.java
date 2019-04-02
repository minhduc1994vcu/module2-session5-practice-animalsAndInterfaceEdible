package com.codegym.animals;

import com.codegym.edibles.Edibles;
import com.codegym.fruits.Apple;
import com.codegym.fruits.Fruit;
import com.codegym.fruits.Orange;

public class Test {
    public static void main(String[] args) {
        Animals[] animals = new Animals[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();

        for (Animals animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edibles edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
            } else if (animal instanceof Tiger) {
                Edibles edibler = (Tiger) animal;
                System.out.println(edibler.howToEat());

            }
        }

        Fruit[] fruit = new Fruit[2];
        fruit[0] = new Apple();
        fruit[1] = new Orange();
        for (Fruit aFruit : fruit) {
            System.out.println(aFruit.howToEat());
        }
    }
}
