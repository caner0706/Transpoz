/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package transpoz;

/**
 *
 * @author caner
 */
public class Transpoz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[][] matris = {
            {2, 3, 4},
            {5, 6, 4}
        };

        int satirSayisi = matris.length;
        int sutunSayisi = matris[0].length;

        int[][] transpoze = new int[sutunSayisi][satirSayisi];

        for (int i = 0; i < satirSayisi; i++) {
            for (int j = 0; j < sutunSayisi; j++) {
                transpoze[j][i] = matris[i][j];
            }
        }

        System.out.println("Matris:");
        printMatris(matris);

        System.out.println("Transpoze:");
        printMatris(transpoze);
    }

    public static void printMatris(int[][] matris) {
        int satirSayisi = matris.length;
        int sutunSayisi = matris[0].length;

        for (int i = 0; i < satirSayisi; i++) {
            for (int j = 0; j < sutunSayisi; j++) {
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}


