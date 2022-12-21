package Lab1;

public class Cycle {
    public static void main(String[] args) {
        int[] mass = {1, 4, 2, 5};
        int sum = 0;
        int x = 0;
        do {
            sum += mass[x];
            x++;
        }while (x < mass.length);
        System.out.println(sum);
    }
}


/*public class Cycle {
    public static void main(String[] args) {
        int [] mass = {1,4,2,5};
        int sum=0;
        int x = 0;
        while (x < mass.length){
            sum += mass[x];
            x++;
        }
        System.out.println(sum);
    }
}*/

/*public class Cycle {
    public static void main(String[] args) {
        int [] mass = {1,4,2,5};
        int sum=0;
        for (int x = 0; x < mass.length; x++){
            sum += mass[x];
        }
        System.out.println(sum);
    }
}*/




