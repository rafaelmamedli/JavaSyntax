package com.example.javaudemy;

import java.util.ArrayList;

public class Arrays {
    public static void main(String[] args) {

        String[] myArray = new String[3];
        myArray[0] = "James";
        myArray[1] = "Kirk";

        System.out.println(myArray[1]);

        int[] myIntegerArray = new int[3];
        myIntegerArray[0] = 50;
        myIntegerArray[1] = 60;

        System.out.println(myIntegerArray[1]);

        int[] myNumberArray = {01,2,3,4,5,6,7,8};
        System.out.println(myNumberArray[2]);

        ArrayList<String> myMusicans = new ArrayList<String>();
        myMusicans.add("Rick");
        System.out.println(myMusicans.get(0));
    }
}
