import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("UCAK BİLET FİYATİ HESAPLAMA");
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen yasinizi girin:");
        int yas=input.nextInt();
        if (yas<0){
            while (yas<0){ System.out.println( "Hatalı Veri Girdiniz ! tekrar deneyiniz" );
            yas=input.nextInt();
            }}

        System.out.println("lütfen km cinsinden mesafe girin:");
        int mesafe=input.nextInt();
        if (mesafe<0){while (mesafe<0){
            System.out.println( "Hatalı Veri Girdiniz ! tekrar deneyiniz" );}
            mesafe=input.nextInt();
        }

        System.out.println("lütfen yolculuk tipini girin:tek yon:1 cift yon:2 için");
        Scanner k=new Scanner(System.in);
        int tip=k.nextInt();
        if (tip>2){while (tip>2){
            System.out.println("Hatalı Veri Girdiniz ! tekrar deneyiniz****");
            tip=k.nextInt();
        }}
        if (tip<1)
        {while (tip<1){
            System.out.println("Hatalı Veri Girdiniz ! tekrar deneyiniz****");
            tip=k.nextInt();
        }}
        double normaltutar=mesafe * 0.10;
        double a=0.10; //indirim oranı
        double toplamtutar=(normaltutar-normaltutar*a);
               if (yas<12){
                   a=0.50;
                   System.out.println( "tek yon yas indirimli bilet fiyatı:"+toplamtutar);}
                if(12<=yas&&yas<=24){
                   a=0.10;
                   System.out.println( "tek yon yas indirimli bilet fiyatı:"+toplamtutar);}
                if (yas>65){
                   a=0.30;
                   System.out.println( "tek yon yas indirimli bilet fiyatı:"+toplamtutar);}
               if (tip==2){
                   System.out.println( "yas indirimli cift yön bilet fiyatı:"+(toplamtutar*2-toplamtutar*2*0.20));}}
    }

