public class CokluDiziler {
    public static void main(String[] args) {

        String[][] sehirler = new String[4][4];
        sehirler[0][0] = "İstanbul";
        sehirler[0][1] = "Bursa";
        sehirler[0][2] = "Bilecik";
        sehirler[1][0] = "Ankara";
        sehirler[1][1] = "Konya";
        sehirler[1][2] = "Kayseri";
        sehirler[2][0] = "Diyarbakir";
        sehirler[2][1] = "ŞanlıUrfa";
        sehirler[2][2] = "Gaziantep";
        System.out.println("Merhaba Dünya...");
        for (int j = 0; j < 3; j++) {
            System.out.println(sehirler[2][j]);
        }

    }
}
