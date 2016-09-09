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
public class VasyaSocks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int div = n/m;
        int res = div + n;
        while (div >= m) {
            res = res + (div/m);
            div = (div/m) + (div%m);
        }
        System.out.println(res);
    }
}