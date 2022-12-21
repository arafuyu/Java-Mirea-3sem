package Pract7.n3;

import java.util.ArrayDeque;
import java.util.Deque;

public class Game {
    Deque<Integer> fp, sp;

    public Game(String fp, String sp) {
        this.fp = new ArrayDeque<>();
        this.sp = new ArrayDeque<>();
        for(int i = 0; i < 5; i ++){
            this.fp.add(Integer.parseInt(fp.substring(i, i+1)));
            this.sp.add(Integer.parseInt(sp.substring(i, i+1)));
        }
    }

    public String play(){
        int count = 0;
        while(!fp.isEmpty() && !sp.isEmpty() && count < 106){
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
        else if (sp.isEmpty()) res += "Победил первый игрок! Кол-во ходов: ";
        res += count;
        if(count >= 106) res = "botva. Количество ходов: " + res;
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new Game("85296", "04721").play());
        System.out.println(new Game("12345", "67890").play());
        System.out.println(new Game("13029", "42685").play());
    }

}