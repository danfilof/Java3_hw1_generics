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
        List <Integer> arrList = new ArrayList<>();
        List <Integer> taskTwo = task_two(array, arrList);
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
