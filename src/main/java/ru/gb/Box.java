package ru.gb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T> {

    private List<T> fruits;

    public Box(T... fruits) {
       this.fruits = new ArrayList<T>(Arrays.asList(fruits));
    }

    // Добавление фруктов в ящик
    public boolean add(T... fruit){
        System.out.printf("Fruit %s has been added. \n", fruit);
        return fruits.add((T) fruit);
    }

    // Получение веса ящика
    public float getWeight() {
        if (fruits.size() == 0) return 0;
            float boxWeight = 0;
        boxWeight = fruits.size() * Fruit.getWeight();
        System.out.println("Weight of the box " + this + ": " + boxWeight);
        return boxWeight;
    }
    // Сравнение весов двух разных ящиков
    public boolean compare(Box b2) {
        double b1Weight = this.getWeight();
        double b2Weight = b2.getWeight();

        if (b1Weight == b2Weight) {
            System.out.printf("Weights of boxes %s and %s are equal. \n", this, b2);
            return true;
        } else {
            System.out.printf("Weights of boxes %s and %s are not equal. \n", this, b2);
            return false;
        }
    }

    // Метод пересыпки из одной коробки в другую. Использую <? super T>, так как будет присутствовать неизвестный тип. После пересыпки очищаем лист
    public void moveTo(Box <? super T> toBox) {
        System.out.printf("Fruits are moved from %s to %s. \n", this, toBox);
        toBox.fruits.addAll(this.fruits);
            fruits.clear();
    }
}
