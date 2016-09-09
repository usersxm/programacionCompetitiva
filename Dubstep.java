/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacioncompetitiva;

import java.util.Scanner;

/**
 *
 * @author carlospiasentini
 */
public class Dubstep {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String dub = scan.nextLine();
        String original = dub.replaceAll("WUB", " ");
        System.out.println(original.trim());
                
                
                
//        int i = 0;
//        boolean band;
//        while (i<dub.length()) {
//            band = false;
//            if (dub.charAt(i) == 'W') {
//                if (dub.charAt(i+1) == 'U') {
//                    if (dub.charAt(i+2) == 'B') {
//                        i = i+3;
//                        band = true;
//                    }
//                }
//            }
//            System.out.print(dub.charAt(i));
//            if (!band) { 
//                i++;
//            }
//        }
    }
}
