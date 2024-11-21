import java.util.Scanner;
public class Kubus21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int p,l,t,L,Vol;
        
        System.out.print("Masukkan panjang: ");
        p=input.nextInt();
        System.out.print("Masukkan lebar: ");
        l=input.nextInt();
        System.out.print("Masukkan tinggi: ");
        t=input.nextInt();

        L= 2*(p*l+p*t+l*t);
        System.out.println("Luas permukaan kubus adalah: " + L);

        Vol= p*l*t;
        System.out.println("Volume kubus adalah: " + Vol);
    }
    public static int hitungLuas(int p, int l, int t) {
        int Luas =2*(p*l+p*t+l*t);
        return Luas;    
    }
    public static int hitungVolume(int tinggi, int pj, int lb) {
        int volume = pj* lb* tinggi;
        return volume;
    }
}
