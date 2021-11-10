package CLASS_JAVA.Step2.Class_2;

import CLASS_JAVA.Step2.Class_2.Bird.*;
import CLASS_JAVA.Step2.Class_2.Factory.*;
import CLASS_JAVA.Step2.Class_2.behavior.Swim.*;
import CLASS_JAVA.Step2.Class_2.behavior.fly.*;

import java.util.Scanner;

public class client {
    public static void main(String[] args) {
        System.out.println("请输入你需要测试的鸟儿: 1代表鸽子,2代表老鹰,3代表企鹅,0退出");
        Bird bird;
        BirdFactory dove = new doveFactory();
        BirdFactory hawk = new hawkFactory();
        BirdFactory penguim = new penguimFactory();

        int a=1;
        while (a != 0) {
            Scanner scan = new Scanner(System.in);
            if (scan.hasNextInt()) {
                a= scan.nextInt();
                switch (a) {
                    case 1 -> {
                        bird = dove.createBird();
                        bird.show();
                        bird.setBehavior(new NoSwim());
                        bird.setBehavior(new CanFly());
                    }
                    case 2 -> {
                        bird = hawk.createBird();
                        bird.show();
                        bird.setBehavior(new NoSwim());
                        bird.setBehavior(new CanFly());
                    }
                    case 3 -> {
                        bird = penguim.createBird();
                        bird.show();
                        bird.setBehavior(new CanSwim());
                        bird.setBehavior(new NoFly());
                    }
                }
            }
        }
    }
}
