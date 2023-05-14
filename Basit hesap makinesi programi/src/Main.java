import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n1,n2,select;
        Scanner input = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz: ");
        n1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        n2 = input.nextInt();
        System.out.println("Yapmak istediginiz işlemi giriniz");
        System.out.println("Toplama : 1");
        System.out.println("Çıkarma : 2");
        System.out.println("Çarpma : 3");
        System.out.println("Bölme : 4");
        select = input.nextInt();

        switch (select){

            case 1:
                System.out.println("Toplama:" + (n1+n2) );
                break;
            case 2:
                System.out.println("Çıkarma:" + (n1-n2));
                break;
            case 3:
                System .out.println("Çarpma:" + (n1*n2));
                break;
            case 4:
                    if (n2==0){
                    System.out.println("Bir sayı 0'a bölünemez.");
                    }
                    else if (n2!=0){
                    System.out.println("Bölme:" + (n1/n2));
                    }
                break;
            default:
                System.out.println("Yanlış seçim yaptınız.");
                break;
        }

    }
}