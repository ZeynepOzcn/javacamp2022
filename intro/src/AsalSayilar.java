public class AsalSayilar {
    public static void main(String[] args) {
        boolean asalMi = true;
        int sayi = 15;
        if (sayi == 1) {
            System.out.println("1 SAYİSİ ASAL DEĞİLDİR.");
            return;
        }
        if (sayi < 1) {
            System.out.println("Hatalı sayi");
            return;
        }
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                asalMi = false;
                break;
            }
        }
        if (asalMi == true) {
            System.out.println("Asal sayidir");
        } else {
            System.out.println("Asal sayi değildir.");
        }
    }
}

