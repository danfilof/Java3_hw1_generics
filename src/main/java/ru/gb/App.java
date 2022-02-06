package ru.gb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class App {

    public static void main(String[] args) {
        // первое задание
        final int[] array = {1, 5, 6, 7};
        int[] firstTask = task_one_SWAP(array);

        // Второе задание
        ArrayList <Integer> arrList = new ArrayList<>();
        ArrayList <Integer> taskTwo = task_two(array, arrList);

        // Третье задание
        Apple a1 = new Apple();
        Apple a2 = new Apple();
        Apple a3 = new Apple();

        Orange o1 = new Orange();
        Orange o2 = new Orange();
        Orange o3 = new Orange();
        Orange o4 = new Orange();
        Orange o5 = new Orange();


        final Box<Orange> boxOfOranges= new Box<Orange>(o1, o2, o3);
        final Box<Orange> boxOfOranges1= new Box<Orange>(o4, o5);
        final Box<Apple> boxOfApples = new Box<Apple>(a1, a2, a3);

        boxOfOranges1.compare(boxOfApples);
    }

 // 1. Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
    public static int[] task_one_SWAP(int[] x) {
        System.out.println("T1. Initial array: " + Arrays.toString(x));
        int zeroValue = x[0];
        int firstValue = x[1];
        x[0] = firstValue;
        x[1] = zeroValue;
        System.out.println("T1. Final array: " + Arrays.toString(x));
        return x;
    }

    // 2. Написать метод, который преобразует массив в ArrayList;
    public static ArrayList<Integer> task_two(int[] firstTask, List<Integer> arrList) {
        System.out.println("T2. Initial arrayList: " + arrList);
        for (int x : firstTask) {
            arrList.add(x);
        }
        System.out.println("T2. Final arrayList: " + arrList);
        return (ArrayList<Integer>) arrList;
    }
}
