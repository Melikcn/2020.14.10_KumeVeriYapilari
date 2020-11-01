import java.util.Scanner;

public class KumeVeriApp {

    public static void main(String[] args) {
        KumeVeri kv = new KumeVeri();
        Scanner input = new Scanner(System.in);

        boolean devam = true;
        while (devam) {

            System.out.println("1.Ekle \n2.Sil\n3.Yazdır\n4.Çıkış");
            int islem = input.nextInt();

            if (islem == 1) {
                System.out.print("İsim Giriniz : ");
                String ad = input.next();
                kv.add(ad);

            }
            if (islem == 2){
                System.out.print("Silinecek ismi giriniz : ");
                String ad = input.next();
                kv.delete(ad);
            }

            if (islem == 3) {
                kv.print();
            }
        }
    }
}
