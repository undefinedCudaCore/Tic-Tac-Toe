/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tic.tac.toe;

import java.util.Scanner;

/**
 *
 * @author TK's Thermaltake
 */
public class TicTacToe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("0 - pabaiga");
            System.out.println("1 - akmuo");
            System.out.println("2 - popierius");
            System.out.println("3 - zirkles");
            int choose = sc.nextInt();

        double dp = (Math.random() * 3) + 1;
        double kp = Math.floor(dp);
                if(choose == 0){
                    kp = 0;
                    break;
                }
                if(choose > 3){
                    System.out.println("Blogas skaicius, tikrinkite skaiciu "+choose+".");
                }
            System.out.println(choose);
            System.out.println(kp);

                if(choose == kp & choose != 0 && kp != 0){
                    System.out.println("Lygiosios");
                    System.out.println("----------------------------");
                }
                if(choose == 1 & kp == 2){
                    System.out.println("Laimejo popierius");
                    System.out.println("----------------------------");
                }
                if(choose == 1 & kp == 3){
                    System.out.println("Laimejo akmuo");
                    System.out.println("----------------------------");
                }
                if(choose == 2 & kp == 1){
                    System.out.println("Laimejo popierius");
                    System.out.println("----------------------------");
                }
                if(choose == 2 & kp == 3){
                    System.out.println("Laimejo zirkles");
                    System.out.println("----------------------------");
                }
                if(choose == 3 & kp == 1){
                    System.out.println("Laimejo akmuo");
                    System.out.println("----------------------------");
                }
                if(choose == 3 & kp == 2){
                    System.out.println("Laimejo zirkles");
                    System.out.println("----------------------------");
                }
            }
    }
}