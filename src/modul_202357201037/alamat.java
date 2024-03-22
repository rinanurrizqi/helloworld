/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul_202357201037;

/**
 *
 * @author UsEr
 */
public class alamat {
    public static void main(String[] args) {
        String data[][] = {{"ABDUL", "085646668991", "Kediri"}, {"KUSNO", "085646668992", "Trenggalek"}, {"PONIRAN", 
            "085646668999", "Bojonegoro"}};
        System.out.println("NAMA\tTELEPON\t\tALAMAT");
        for (String[] i : data) {
            System.out.print(i[0] + "\t");
            System.out.print(i[1] + "\t");
            System.out.print(i[2] + "\n");
        }
    }
}
