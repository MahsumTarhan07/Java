import java.util.Scanner;

public class LinearSearch {
    public static int ara(int a[], int y) {

        int n = a.length;
        // for döngümüzdde koşullarımızı belirledik
        for (int i = 0; i < n; i++) {
            // klavyeden girilen sayı dizi içerisindeki sayıya eşitse sayı indisini döndür.
            if (a[i] == y) {
                return i;
            }
        }
        // değilse -1 olarak döndür
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // dizi içerisine sayılarımızı tanımladık.
        int a[] = { 55, 34, 11, 3, 44, 41, 91 };

        System.out.println("Sayı giriniz");
        int y = scanner.nextInt();

        int sonuc = ara(a, y);
        // koşullarımızı belirttik ve ekran çıktımızı verdik.
        if (sonuc == -1) {
            System.out.println("Dizide sayı bulunamadı");
        } else
            System.out.println("Dizi içerisinde sayı " + sonuc + ". indiste bulunmaktadır.");
    }

}