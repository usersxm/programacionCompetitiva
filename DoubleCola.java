/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacioncompetitiva;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author carlospiasentini
 */
public class DoubleCola {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        List<String> queue = new ArrayList<>();
        queue.add("Sheldon");
        queue.add("Leonard");
        queue.add("Penny");
        queue.add("Rajesh");
        queue.add("Howard");
        for (int i = 0; i < n-1; i++) {
            queue.add(queue.get(i));
            queue.add(queue.get(i));
        }
        System.out.println(queue.get(n-1));
    }
}
