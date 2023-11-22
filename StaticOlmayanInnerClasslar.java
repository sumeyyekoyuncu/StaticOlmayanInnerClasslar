
import java.util.Scanner;


public class StaticOlmayanInnerClasslar {

    public static void main(String[] args) {
        matematik.factorial faktoriyel1=new matematik().new factorial();
        matematik.asal asal1=new matematik().new asal();
        matematik.alan alan1=new matematik().new alan();
        Scanner scanner=new Scanner(System.in);
        System.out.println("sayi giriniz");
        int sayi=scanner.nextInt();
        if(asal1.asalmi(sayi)==true){
            System.out.println("sayi asaldir");
        }
        else{
            System.out.println("sayi asal degildir");
        }
        faktoriyel1.faktoriyel();
        alan1.daire_alani(5);
    }
}
