/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul_202357201037;

/**
 *
 * @author UsEr
 */
public class index_ganjil {
    public static void main(String[] args) {
        int data[][] = {{4, 6, 4, 2, 8, 4, 2, 10}, {4, 6, 4, 2, 8, 4, 2, 10}};
        int jumlahdata = 0;
        
        System.out.println("kolom ganjil ; ");
        for (int a = 0; a < data.length; a++) {
            for (int b = 1; b < data[a].length; b += 2) {
                if (b % 2 == 1){
                    System.out.print(data[a][b] + " ");
                    jumlahdata += data[a][b];
                }
                System.out.println("");
            }
            System.out.println("Total elemen kolom ganjil = " + jumlahdata);
        }
    }
}
