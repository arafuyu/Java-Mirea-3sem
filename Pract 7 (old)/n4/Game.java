package Pract7.n4;

import java.util.LinkedList;

public class Game {
    LinkedList<Integer> fp, sp;

    public Game(String fp, String sp) {
        this.fp = new LinkedList<>();
        this.sp = new LinkedList<>();
        for(int i = 0; i < 5; i ++){
            this.fp.add(Integer.parseInt(fp.substring(i, i+1)));
            this.sp.add(Integer.parseInt(sp.substring(i, i+1)));
        }
    }


    public String play(){
        int count = 0;
        while(!fp.isEmpty() && !sp.isEmpty() && count <= 106){
            if(fp.peek() > sp.peek()
                    && sp.peek() != 0){
                fp.add(fp.remove());
                fp.add(sp.remove());

            }else{
                sp.add(fp.remove());
                sp.add(sp.remove());
            }
            count++;
        }
        String res = "";
        if(fp.isEmpty()) res += "Победил второй игрок! Кол-во ходов: ";
        else res += "Победил первый игрок! Кол-во ходов: ";
        res += count;
        if(count >= 106) res = "botva. Количество ходов: 106";
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new Game("85296", "04721").play());
        System.out.println(new Game("12345", "67890").play());
        System.out.println(new Game("13029", "42685").play());
    }

}