import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        System.out.println("Lütfen A , B , C , D , E notlarından birisini giriniz. ");
        Scanner sc = new Scanner(System.in);

        char notgiris = sc.next().charAt(0);

        switch (notgiris) {
            case 'A':
                System.out.println("Tebrikler Mükemmel : Geçtiniz :)");
                break;
            case 'B':
                System.out.println("Tebrikler Başarılı : Geçtiniz :)");
                break;
            case 'C':
                System.out.println("Tebrikler iyi : Geçtiniz :)");
                break;
            case 'D':
                System.out.println("Orta : Geçtiniz :)");
                break;
            case 'E':
                System.out.println("Üzgünüm kötü : Geçtiniz :)");
                break;
            default:
                System.out.println("Geçersiz not girdiniz.");

        }
    }
}
