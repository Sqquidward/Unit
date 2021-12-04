package com.company;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        String[] nameBicycle = {"одноколесный", "двухколесный", "трехколесный"};
        int [] digit = new int[3];
        for(int j = 0; j<3; j++){
            digit[j] = (int) Math.round(Math.random()*10+1);
            for(int i = 0;  i<digit[j]; i++){
                list.add(nameBicycle[j]);
            }
        }
        PrintInfo(list);
        Refit.Repair(list, digit);
        Diameter.diameterWheels(list, digit);
    }
    public static void PrintInfo(ArrayList<String> list){
        System.out.println("В магазине предствлены:");
        System.out.println(list);
        System.out.println();
    }
    public static void PrintInfo(String Name) {
        System.out.println("Ремонт " + Name + " велосипедa");
    }
}

class Refit{
    static void Repair(ArrayList<String> list, int[] digit){
        int i=0;
        while(i<digit[0]){
            Main.PrintInfo(list.get(i)); i++;}
    }
}

class Diameter{
    static void diameterWheels(ArrayList<String> list, int[] digit){
        System.out.println();
        for(int i = 0; i<digit[0]; i++){
            list.set(i, list.get(i)+" "+Math.round(Math.random()*14+9));
        }
        for(int i = digit[0]; i<digit[1]+digit[0]; i++){
            list.set(i, list.get(i)+" "+(Math.round(Math.random()*14+9))*2);
        }
        for(int i = digit[1]+digit[0]; i<digit[1]+digit[0]+digit[2]; i++){
            list.set(i, list.get(i)+" "+(Math.round(Math.random()*14+9))*3);
        }

        System.out.println(list);
    }
}

