import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("tutar giriniz: ");
        double price =input.nextDouble();
        System.out.println("kart no giriniz: ");
        String cardNumber= input.next();
        System.out.println("son kullanım tarihini giriniz: ");
        String date= input.next();
        System.out.println("cvc giriniz: ");
        String cvc= input.next();
        System.out.println("1- A Bankası");
        System.out.println("2- B Bankası");
        System.out.println("3- C Bankası");
        System.out.println("banka seçiniz: ");
        int selectBank= input.nextInt();
        switch (selectBank){
            case 1:
                ABankasi aPos= new ABankasi("A bankası","9745165","cano123");
                aPos.connect("127.0.0.4");
                aPos.payment( 123456,"45645156","22.10.2025","564");
                break;
            default:
            case 2:
                BBankasi bPos= new BBankasi("B bankası","9745165","cano123");
                bPos.connect("127.0.0.4");
                bPos.payment( 123456,"45645156","22.10.2025","564");

        }




    }
}