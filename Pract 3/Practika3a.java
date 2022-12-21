package Pract3N;

import java.util.Arrays;
import java.util.Random;

public class Practika3a {
    public static void main(String[] args) {
        // Создаем экземпляр класса Random
        Random r = new Random(System.currentTimeMillis());
        int[] arr = new int[10];
        System.out.println("Изначальный массив:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt()%100;
            System.out.println("Arr["+i+"] = " + arr[i]);
        }
        Arrays.sort(arr);
        System.out.println("Отсортированный массив: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Arr["+i+"] = "+arr[i]);
        }

    }
}