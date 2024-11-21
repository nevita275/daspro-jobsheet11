import java.util.Scanner;
public class hitungTotalHarga21 {

    public static double hitungTotalHarga21 (int[] pilihanMenu, int[] banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000,10000, 18000};
        double hargaTotal = 0;

        for (int i = 0; i < pilihanMenu.length; i++) {
            int indexMenu = pilihanMenu[i] - 1;
            hargaTotal += hargaItems[indexMenu] * banyakItem[i];
        }
        
        double diskon = 0;
        if (kodePromo.equals("DISKON50")) {
            System.out.println("Anda mendapatkan diskon 50%"); 
            diskon = 0.50;
        }else if (kodePromo.equals("DISKON30")) {   
            System.out.println("Anda mendapatkan diskon 30%");
            diskon = 0.30;            
        }else {
            System.out.println("Maaf, kode invalid");
        }
        double hargaDiskon = hargaTotal - (hargaTotal * diskon);
        return hargaTotal;
    }
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah menu yg ingin dipesan: ");
        int jmlhMenu = sc.nextInt();

        int[] pilihanMenu = new int[jmlhMenu];
        int[] banyakItem = new int[jmlhMenu];

        for (int i = 0; i < jmlhMenu; i++) {
            System.out.print("menu ke-" + (i+1));
            System.out.print("\nMasukkan menu yg ingin dipesan: ");
            pilihanMenu[i] = sc.nextInt();
            System.out.print("Masukkan jumlah item yg ingin dipesan: ");
            banyakItem[i] = sc.nextInt();
        }

        sc.nextLine();
        System.out.print("Masukkan kode promo: ");
        String kodePromo = sc.nextLine();

        double hargaTotal = hitungTotalHarga21(pilihanMenu, banyakItem, kodePromo);

        System.out.println("Total harga untuk pesanan Anda: Rp" + hargaTotal);
      
    }

}
