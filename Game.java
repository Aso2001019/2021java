package pkg37;

import java.util.*;
public class Game {

    static int count = 1;

    public static void disTitle(){
        System.out.println("***********************");
        System.out.println("       戦艦ゲーム       ");
        System.out.println("***********************");
    }
    
    public static void disTurn() {
        System.out.printf("-----ターン%d-----",count);
        count++;
    }

    public static void init(){
        Random random = new Random();
        int shipcount = 0;
    }

    public static void in(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("爆弾のX座標を入力してください");
        int x = sc.nextInt();
        System.out.printf("爆弾のY座標を入力してください");
        int y = sc.nextInt();
    }
    public static void disEnd(){
        System.out.println("***********************");
        System.out.println("      ゲームクリア       ");
        System.out.println("***********************");
    }
}
