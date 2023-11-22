
import java.util.Scanner;


public class matematik {
    private double PI=Math.PI;
    public class factorial{
        public void faktoriyel(){
                Scanner scanner=new Scanner(System.in);
                System.out.println("hangi sayinin faktoriyelini ogrenmek istersiniz?");
                int sayi=scanner.nextInt();
                int fakt=1;
                for(int i=1;i<=sayi;i++){
                    fakt*=i;
                }
                System.out.println(sayi+" sayisinin faktoriyeli: "+fakt);
            }
    }

   public class asal{
       public boolean asalmi(int sayi){
           int i=2;
           while(i<sayi){
               if(sayi%i==0){
                   return false;
               }
               i++;
           }
           return true;
       }
       
   }
   public class alan{
       public void daire_alani(int yaricap){
           System.out.println("dairenin alani: "+yaricap*yaricap*PI);
       }
   }



    
}


