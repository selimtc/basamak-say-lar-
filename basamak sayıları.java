import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, basamak, total=0;

        System.out.print(" Sayı Giriniz: ");
        number = input.nextInt();

        while (number != 0 ){
            basamak = number % 10;
            total += basamak;
            number /= 10;
        }
        System.out.print("Basamak Sayıları Toplamı: " + total);
    }
}