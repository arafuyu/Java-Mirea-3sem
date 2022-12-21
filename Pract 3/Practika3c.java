package Pract3N;

public class Practika3c {
        public static void main(String[] args) {
            int arr[] = new int[4];

            for (int i = 0; i < arr.length; i++) {
                int a = (int) (Math.random() * 89) + 10;
                arr[i] = a;
                System.out.print(arr[i] + " ");
            }
            System.out.println();

            if (arr[0] < arr[1] && arr[1] < arr[2] && arr[2] < arr[3]) {
                System.out.println("Массив со строго возрастающей последовательностью");
            } else {
                System.out.println("Массив c НЕ строго возрастающей последовательностью");
            }
        }
}