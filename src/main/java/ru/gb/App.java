package ru.gb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) {
        // Первое задание

        // 1. Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
        final int[] array = {1, 5, 6, 7};
        int[] firstTask = task_one_SWAP(array);

        // Второе задание

        // 2. Написать метод, который преобразует массив в ArrayList;
        ArrayList<Integer> arrList = new ArrayList<>();
        ArrayList<Integer> taskTwo = task_two(array, arrList);

        // Третье задание

//        Задача:
//       a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
//       b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
//       c. Для хранения фруктов внутри коробки можно использовать ArrayList;
//       d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество: вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
//       e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае. Можно сравнивать коробки с яблоками и апельсинами;
//       f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую. Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами. Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
//       g. Не забываем про метод добавления фрукта в коробку.

        Apple a1 = new Apple();
        Apple a2 = new Apple();
        Apple a3 = new Apple();

        Orange o1 = new Orange();
        Orange o2 = new Orange();
        Orange o3 = new Orange();
        Orange o4 = new Orange();
        Orange o5 = new Orange();
        Orange o6 = new Orange();

        final Box<Orange> boxOfOranges = new Box<Orange>(o1, o2, o3);
        final Box<Orange> boxOfOranges1 = new Box<Orange>(o4, o5);
        final Box<Apple> boxOfApples = new Box<Apple>(a1, a2, a3);
        final Box<Fruit> boxOfFruits = new Box<Fruit>();

        boxOfOranges1.compare(boxOfApples);
        // Можно сложить в коробку Fruits и Orange и Apple, так как они оба наследуются от Fruit
        boxOfOranges1.moveTo(boxOfFruits);
        boxOfApples.moveTo(boxOfFruits);

        // Но в ящик с Orange могут попасть исключительно Orange
        boxOfOranges.moveTo(boxOfOranges1);
        // Можно добавить фрукт в соответствующую корзину
        boxOfOranges.add(o6);
    }

    // Метод для первого задания
    public static int[] task_one_SWAP(int[] x) {
        System.out.println("T1. Initial array: " + Arrays.toString(x));
        int zeroValue = x[0];
        int firstValue = x[1];
        x[0] = firstValue;
        x[1] = zeroValue;
        System.out.println("T1. Final array: " + Arrays.toString(x));
        return x;
    }

    // Метод для второго задания
    public static ArrayList<Integer> task_two(int[] y, List<Integer> list_arr) {
        System.out.println("T2. Initial arrayList: " + list_arr);
        for (int i : y) {
            list_arr.add(i);
        }
        System.out.println("T2. Final arrayList: " + list_arr);
        return (ArrayList<Integer>) list_arr;
    }
}
