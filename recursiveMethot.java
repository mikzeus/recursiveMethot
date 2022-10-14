import java.util.Scanner;

public class recursiveMethot {
    static int recursive (int base, int power) {

        if (power == 0) {
            return 1;}
        return base * recursive(base, power - 1);
    }
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println("lutfen Taban sayisisini giriniz : ");
        int base = inp.nextInt();

        System.out.println("lutfen us sayisini giriniz : ");
        int power = inp.nextInt();

        System.out.println("sonuc : " + recursive(base,power));
    }

}








