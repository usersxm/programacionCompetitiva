/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacioncompetitiva;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author carlospiasentini
 */
public class ProgramacionCompetitiva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String b = "";
        try (Scanner scan = new Scanner(System.in)) {
            do {
                int cant = scan.nextInt();
                int[][] arr = new int[cant][cant];
                for (int i = 0; i < cant; i++) {
                    for (int j = 0; j < cant; j++) {
                        if (i == j) { arr[i][j] = 1; } else { arr[i][j] = 3; }
                        if (i+j == cant-1) { arr[i][j] = 2; }
                    }
                }
                for (int i = 0; i < cant; i++) {
                    System.out.println(Arrays.toString(arr[i]));
                }
            } while (scan.next() == null);
        }
    }   
}
