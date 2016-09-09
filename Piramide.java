/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacioncompetitiva;

import static java.lang.Math.abs;
import java.util.Scanner;
/**
 *
 * @author carlospiasentini
 */
public class Piramide {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int bloques = scan.nextInt();
        int[][] disponibles = new int[2][bloques];
        int apilados = 1;
        int total = bloques - 1;
        int x1 = 0;
        int x2 = 0;
        for (int i = 0; i < bloques; i++) {
            disponibles[0][i] = scan.nextInt();
            disponibles[1][i] = scan.nextInt();
        }
        System.out.println("iniciando calc");
        while (total != 0) {
            int max = 0;
            for (int i = 0; i < bloques; i++) {
                if ((disponibles[0][i] * disponibles[1][i]) >= max) {
                    max = disponibles[0][i] * disponibles[1][i];
                    int pos = i;
                    int dist = abs(disponibles[0][i] - disponibles[1][i]);
                    if ((x1 <= disponibles[0][i]) && (x2 <= disponibles[1][i])) {
                        x1 = disponibles[0][i];
                        x2 = disponibles[1][i];
                        apilados++;
                        disponibles[0][i] = 0;
                        disponibles[1][i] = 0;
                        total--;
                    }
                }
            }
        }
        System.out.println(apilados);
        scan.close();
    }
}