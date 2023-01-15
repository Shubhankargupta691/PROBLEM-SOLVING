package com.Shubhankar;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>(10);

        list.add(4560);
        list.add(78);
        list.add(741);
        list.add(85);
        list.add(655);
        System.out.println(list);
        list.set(2,8);
       System.out.println(list);


        System.out.println("Enter the element");
        for(int i =0 ; i< 3; i++){
            list.add(sc.nextInt());
        }
        for(int i =0 ; i< 3; i++){
            System.out.println("output: "+list.get(i));
        }

    }
}
