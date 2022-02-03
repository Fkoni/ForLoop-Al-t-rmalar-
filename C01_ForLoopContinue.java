package _Team7_ForLoop.yedek;

import java.util.Scanner;

public class C01_ForLoopContinue {

    public static void main(String[] args) {
        // Kullanıcıdan 5 adet sayı isteyiniz
        // Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
        // bu soruyu continue kullanarak çözünüz.

    	 Scanner scan =new Scanner (System.in);
         
         int sToplami = 0;
         
         for (int i = 1; i<=5 ; i++) {
        	  System.out.print("sayi " + i + " giriniz : ");
        
     	 int sayi = scan.nextInt();
         if (sayi > 5 && sayi <10 ) {
        	 System.out.println("Girilen sayi 5 ile 10 arasi oldugundan isleme alinmadi");
        	 continue;//yok saymak pas geç
         }
         sToplami += sayi;
         }
         System.out.println("Girilen sayilarin toplami : " + sToplami);
         scan.close();
    }
    
   

}
    


