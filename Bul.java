import java.util.Arrays;
import java.util.Scanner;

/**
 * @author fath-git
 * */

public class Bul {

    public static void main(String[] args) {

        int[] dizi = {15, 12, 788, 1, -1, -778, 2, 0};
        Scanner input = new Scanner(System.in);
        int deger;
        int temp=0;

        System.out.println("Dizi: "+Arrays.toString(dizi));

        System.out.print("Bir değer giriniz: ");
        deger=input.nextInt();

        Arrays.sort(dizi);
        for (int i=1; i<dizi.length; i++){
            if (Math.abs(dizi[i]-deger)<Math.abs(dizi[temp]-deger))
                temp=i;
        }

        if (deger==dizi[temp]){

            if (temp!=dizi.length-1)
                System.out.println("Girdiğiniz değerden büyük en küçük sayı: "+dizi[temp+1]);
            else
                System.out.println("Dizide girdiğiniz değerden büyük bir sayı yoktur.");

            if (temp!=0)
                System.out.println("Girdiğiniz değerden küçük en büyük sayı: "+dizi[temp-1]);
            else
                System.out.println("Dizide girdiğiniz değerden küçük bir sayı yoktur.");

        }
        else if (deger<dizi[temp]){

            System.out.println("Girdiğiniz sayıdan büyük en küçük sayı: "+dizi[temp]);

            if (temp!=0)
                System.out.println("Girdiğiniz değerden küçük en büyük sayı: "+dizi[temp-1]);
            else
                System.out.println("Girdiğiniz değerden küçük bir sayı yoktur.");

        }
        else{

            System.out.println("Girdiğniz sayıdan küçük en büyük sayı: "+dizi[temp]);

            if (temp!=dizi.length-1)
                System.out.println("Girdiğiniz sayıdan büyük en küçük sayı: "+dizi[temp+1]);
            else
                System.out.println("Girdiğiniz değerden büyük bir sayı yoktur.\n");

        }

        System.out.println("Sıralı dizi: "+Arrays.toString(dizi));

    }

}
