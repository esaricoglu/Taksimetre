package TemelKavramlarveDegiskenler;

import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Kaç kilometre yolculuk ettiğinizi giriniz : ");
        int km = input.nextInt();
        //System.out.println(km);

        double tutar = 10.0 + 2.20*km;
        double borc = tutar>20 ? tutar : 20 ;

        System.out.println("Borcunuz = " + borc);

    }
}
