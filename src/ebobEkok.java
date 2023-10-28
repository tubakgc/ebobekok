import java.util.Scanner;
public class ebobEkok {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("n1 sayısını giriniz:");
        int n1= input.nextInt();

        System.out.print("n2 sayısını giriniz");
        int n2= input.nextInt();
        int ebob=1, ekok=1;
        int x=1, y=1;

        if (n2>n1) {


            while (n1 >= x) {
                if (n1%x==0 && n2%x==0) {
                    ebob=x;


                }
                x++;

            }System.out.print("ebob:"+ ebob);
        }else{
            while (n2 >= y) {
                if (n1%y==0 && n2%y==0) {
                    ebob=y;


                }
                y++;

            }System.out.println("ebob:"+ ebob);


        }

        ekok = (n1 * n2) / ebob;
        System.out.println(" ");
        System.out.println("EKOK: "+ekok);
//git için ekleme yapıldı
    }
}
