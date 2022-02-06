package ru.gb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T> {

    private List<T> fruits;

    public Box(T... fruits) {
       this.fruits = new ArrayList<T>(Arrays.asList(fruits));
    }

    // Добавил метод add, хоть его не было в условии задания
    public boolean add(T... fruit){
        System.out.printf("Fruit %s has been added. \n", fruit);
        return fruits.add((T) fruit);
    }

    public float getWeight() {
        if (fruits.size() == 0) return 0;
            float boxWeight = 0;
        boxWeight = fruits.size() * Fruit.getWeight();
        System.out.println("Weight of the box " + this + ": " + boxWeight);
        return boxWeight;
    }

    public boolean compare(Box b2) {
        double b1Weight = this.getWeight();
        double b2Weight = b2.getWeight();

        if (b1Weight == b2Weight) {
            System.out.printf("Weights of boxes %s and %s are equal", this, b2);
            return true;
        } else {
            System.out.printf("Weights of boxes %s and %s are not equal", this, b2);
            return false;
        }
    }
}
