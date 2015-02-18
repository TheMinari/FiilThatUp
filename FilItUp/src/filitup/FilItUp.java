/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filitup;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Aaro
 */
public class FilItUp {

    public static ArrayList wordList() {
        ArrayList<String> words = new ArrayList<>();

        String verb = "Failed to get user input";
        double ku = 0;
        int n = 0;
        double kuu = 0;
        int nu = 0;
        int kohta = 0;
        while (true) {
            ku = Math.random();
            n = (int) (ku * 10);
            kuu = Math.random();
            nu = (int) (ku * 10);
            if(kohta == 0)  {
                if(ku >= 7) {
                    words.add("You wake up and go eat ");
                    words.add(verb);
                    words.add("");
                }
            }else if(kohta == 1) {
                
                
            }
        }

    }

    public static ArrayList random() {
        ArrayList<String> random = new ArrayList<>();
        ArrayList<String> words = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("THIS IS VERY ERLY IN DEVELOPMENT");
        System.out.println("How many user inputtable words?");
        int i = Integer.parseInt(scan.nextLine());

        return random;
    }

    public static void main(String[] args) {
        System.out.println("VIP");
        System.out.println("Game about filing in empty spaces \n ------------------");
        System.out.println("Wich kind of text? [RANDOM][PRESET][OWN]");
    }

}
