package banka;

import java.util.Scanner;

public class Banka {

    public static void main(String[] args) {

        System.out.println("----BANKA----");

        double bakiye = 150000;
        int secim = 0;
        double paraCek = 0;
        double paraYatir = 0;
        String kontrol = "";
        double faiz = 1.79;
        double krediTutari = 0;
        double geriOdeme = 0;
        double aylikOdeme = 0;
        double faizTutari = 0;
        double vade = 0;
        double euro = 18;
        double dolar = 17.28;
        double euroAl = 0;
        double dolarAl = 0;
        int dovizİslem = 0;
        String sorgu = "";
        double dbakiyeE = 0;
        double dbakiyeD = 0;

        do {

            System.out.println("[1] BAKİYE ");
            System.out.println("[2] PARA ÇEKME ");
            System.out.println("[3] PARA YATIRMA ");
            System.out.println("[4] KREDİ İŞLEMLERİ ");
            System.out.println("[5] DÖVİZ İŞLEMLERİ ");

            Scanner scan = new Scanner(System.in);
            secim = scan.nextInt();

            switch (secim) {

                case 1:
                    System.out.println("---Bakiye---");
                    System.out.println("Bakiye: " + bakiye);
                    System.out.println("Başka bir işlem yapmak ister misiniz?");
                    kontrol = scan.next();
                    break;

                case 2:
                    System.out.println("---Para Çekme--- ");
                    System.out.print("Çekmek istediğiniz tutarı giriniz: ");
                    paraCek = scan.nextDouble();
                    if (bakiye < paraCek) {
                        System.out.println("Yetersiz Bakiye");
                    } else {
                        bakiye -= paraCek;
                        System.out.println("Çekilen Tutar: " + paraCek);
                        System.out.println("Bakiye: " + bakiye);
                        System.out.println("Başka bir işlem yapmak ister misiniz?");
                        kontrol = scan.next();
                    }
                    break;

                case 3:
                    System.out.println("---Para Yatırma---");
                    System.out.print("Yatırmak istediğiniz tutarı giriniz: ");
                    paraYatir = scan.nextDouble();
                    System.out.println("Yatırılan tutar: " + paraYatir);
                    bakiye += paraYatir;
                    System.out.println("Bakiye: " + bakiye);
                    System.out.println("Başka bir işlem yapmak ister misiniz?");
                    kontrol = scan.next();
                    break;

                case 4:
                    System.out.println("---Kredi İşlemleri---");
                    System.out.print("Çekmek istediğiniz kredi tutarını giriniz: ");
                    krediTutari = scan.nextDouble();
                    System.out.println("Vade seçiniz: ");
                    vade = scan.nextDouble();
                    faizTutari = (krediTutari) * (1.79 / 100) * vade;
                    geriOdeme = (faizTutari + krediTutari);
                    aylikOdeme = geriOdeme / vade;
                    System.out.println("Faiz yüzdesi: " + faiz);
                    System.out.println("Faiz ödemesi: " + faizTutari);
                    System.out.println("Aylık ödeme: " + aylikOdeme);
                    System.out.println("Geri ödeme: " + geriOdeme);
                    System.out.println("Başka bir işlem yapmak ister misiniz?");
                    kontrol = scan.next();
                    break;

                case 5:
                    System.out.println("---Döviz işlemleri---");
                    System.out.println("[6] Euro alım");
                    System.out.println("[7] Dolar alım");

                    sorgu = scan.next();
                    if (sorgu.equals("6")) {

                        System.out.print("Almak istediğiniz döviz tutarını giriniz: ");
                        euroAl = scan.nextDouble();
                        if (euroAl > 8333) {
                            System.out.println("Yetersiz bakiye!");
                        } else {
                            System.out.println("Döviz tutarı: " + euroAl);
                            bakiye = bakiye - (euroAl * 18);
                            System.out.println("TL Bakiye: " + bakiye);
                            dbakiyeE = euroAl;
                            System.out.println("Döviz Bakiye: " + dbakiyeE);
                            break;
                        }
                    }
                    if (sorgu.equals("7")) {
                        System.out.println("Almak istediğiniz döviz tutarını giriniz: ");
                        dolarAl = scan.nextDouble();
                        if (dolarAl > 8680.55555) {
                            System.out.println("Yetersiz bakiye!");
                        } else {
                            System.out.println("Döviz tutarı: " + dolarAl);
                            bakiye = bakiye - (dolarAl * 17.28);
                            System.out.println("TL Bakiye: " + bakiye);
                            dbakiyeD = dolarAl;
                            System.out.println("Döviz Bakiye: " + dbakiyeD);
                            break;
                        }
                    }

                    break;
            }

        } while (kontrol.equals("E") || kontrol.equals("e"));
    }
}
