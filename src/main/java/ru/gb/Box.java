package ru.gb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T extends Fruit> {
      ArrayList<T> fruits;

      public Box(T... fruits) {
        this.fruits = new ArrayList<T>(Arrays.asList(fruits));
    }
    // Добавление фруктов в ящик
     public void add(T... fruits){
        System.out.printf("Fruit %s has been added to %s. \n", fruits, this);
       this.fruits.addAll(List.of(fruits));
    }

    // Получение веса ящика. В задании сказано назвать метод getWeight(), но во избежании какой-либо путаницы с геттером float weight из Fruit назвал его иначе
     public float getBoxWeight() {
         if (fruits.size() == 0) return 0;
            float boxWeight = 0.0f;
         for (T fruit : fruits) {
             boxWeight += fruit.getWeight();
         }
        System.out.println("Weight of the box " + this + ": " + boxWeight);
        return boxWeight;
    }

    // Сравнение весов двух разных ящиков
    public boolean compare(Box b2) {
        double b1Weight = this.getBoxWeight();
        double b2Weight = b2.getBoxWeight();

        if (b1Weight == b2Weight) {
            System.out.printf("Weights of boxes %s and %s are equal. \n", this, b2);
            return true;
        } else {
            System.out.printf("Weights of boxes %s and %s are not equal. \n", this, b2);
            return false;
        }
    }

    // Метод пересыпки из одной коробки в другую. Использую <? super T>, так как неизвестно, какой тип объектов будет использован. После пересыпки очищаем лист
     public void moveTo(Box <? super T> toBox) {
        System.out.printf("Fruits are moved from %s to %s. \n", this, toBox);
        toBox.fruits.addAll(this.fruits);
            fruits.clear();
    }
}
