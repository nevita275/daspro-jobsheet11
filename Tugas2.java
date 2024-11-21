import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        String[] menu = {"Kopi", "Teh", "Es Degan", "Roti", "Gorengan"};
        int[][] penjualan = {
            {20, 20, 25, 20, 10, 60, 10}, 
            {30, 80, 40, 10, 15, 20, 25}, 
            {5, 9, 20, 25, 10, 5, 45}, 
            {50, 8, 17, 18, 10, 30, 6}, 
            {15, 10, 16, 15, 10, 10, 55}  
        };

        tampilkanSemuaData(menu, penjualan);
        System.out.println();
        tampilkanPenjualanTertinggi(menu, penjualan);
        System.out.println();
        tampilkanRataRataPenjualan(menu, penjualan);

    }
    
    public static void tampilkanSemuaData(String[] menu, int[][] penjualan) {
        System.out.println("Data Penjualan:");
        System.out.print("Menu ");
        for (int i = 1; i <= 7; i++) {
            System.out.print("Hari ke- " + i + "");
        }
        for (int i = 0; i < menu.length; i++) {
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.print(penjualan[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void tampilkanPenjualanTertinggi(String[] menu,int[][] penjualan) {
        int maxPenjualan = 0;
        int indeksMenuTerlaris = 0;
        for (int i = 0; i < menu.length; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                totalPenjualan += penjualan[i][j];
            }
            if (totalPenjualan > maxPenjualan) {
                maxPenjualan = totalPenjualan;
                indeksMenuTerlaris = i;
            }
        }
        System.out.println("Menu terlaris adalah: " + menu[indeksMenuTerlaris]);
    }

    public static void tampilkanRataRataPenjualan(String[] menu,int[][] penjualan) {
        System.out.println("Rata-rata penjualan setiap menu:");
        for (int i = 0; i < menu.length; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                totalPenjualan += penjualan[i][j];
            }
            double rataRata = (double) totalPenjualan / penjualan[i].length;
            System.out.println(menu[i] + ": " + rataRata);
        }
    }
}
