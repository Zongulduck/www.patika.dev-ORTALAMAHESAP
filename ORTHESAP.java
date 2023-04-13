import java.util.Scanner;
public class ORTHESAP {
    public static void main(String[] args) {
        double ort, fizik, mat, turk, kim, muz;
        int sayac = 0;
        Scanner inp = new Scanner(System.in);
        System.out.println("Fizik notunuzu giriniz");
        fizik = inp.nextDouble();
        if (fizik == 0 || fizik == 100) {
            fizik = 0;
            sayac++;
        }
        System.out.println("Matematik notunuzu giriniz");
        mat = inp.nextDouble();
        if (mat == 0 || mat == 100) {
            mat = 0;
            sayac++;
        }
        System.out.println("Türkçe notunuzu giriniz");
        turk = inp.nextDouble();
        if (turk == 0 || turk == 100) {
            turk = 0;
            sayac++;
        }
        System.out.println("Kimya notunuzu giriniz");
        kim = inp.nextDouble();
        if (kim == 0 || kim == 100) {
            kim = 0;
            sayac++;
        }
        System.out.println("Müzik notunuzu giriniz");
        muz = inp.nextDouble();
        if (muz == 0 || muz == 100) {
            muz = 0;
            sayac++;
        }
        ort=(mat+fizik+kim+muz+turk)/(5-sayac);
        System.out.println("ortalamanız; "+ort);
        if(ort>55){
            System.out.println("Geçtiniz!!");
        }
        else{
            System.out.println("Sınıfta kaldınız.");
        }

    }
}
