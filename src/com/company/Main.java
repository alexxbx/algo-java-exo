package com.company;

public class Main {

    public static void main(String[] args) {
        int [] scores = new int [7]; //tableau taille 7
        scores [0] = 25;
        scores [1] = 20;
        scores [2] = 30;
        scores [3] = 56;
        scores [4] = 68;
        scores [5] = 70;
        scores [6] = 67;
        float score2 = ((scores[0]+scores[1]+scores[2]+scores[3]+scores[4]+scores[5]+scores[6])/7);
        System.out.println(score2);
        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[2]);
        System.out.println(scores[3]);
        System.out.println(scores[4]);
        System.out.println(scores[5]);
        System.out.println(scores[6]);
        for (int i =0; i<scores.length; i++){
            int score = scores[1];
            System.out.println(score+" ");
        }
        System.out.println();
        float mean = 0;
        for(int i =0; i<scores.length; i++){
            mean = mean + scores[1];
        }
        mean = mean / scores.length;
        System.out.println(mean);
	// write your code here
    }
}
