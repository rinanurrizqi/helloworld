/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul_202357201037;

/**
 *
 * @author UsEr
 */
public class MODUL_202357201037 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int data[][] = {{4, 6, 4, 2, 8, 4, 2, 10}, {4, 6, 4, 2, 8, 4, 2, 10}};
        double total = 0;
        double jumlahelemen = 0;
        
        for (int baris = 0; baris < data.length; baris++) {
            for (int kolom = 0; kolom < data[0].length; kolom++) {
                System.out.print(data[baris][kolom] + " ");
                total += data[baris][kolom];
                jumlahelemen++;
            }
            System.out.print("\n");
        }
        double ratarata = total/jumlahelemen;
        System.out.println("Total = " + total);
        System.out.println("Rata rata = " + ratarata);
    }
    
}
