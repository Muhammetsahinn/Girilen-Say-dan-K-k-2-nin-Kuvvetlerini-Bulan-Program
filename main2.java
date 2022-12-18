import java.util.Scanner;

public class main2{
    public static void main(String[] args){

        int a,k=1,i=1;
        Scanner grs = new Scanner(System.in);
        System.out.print("Sayi giriniz : ");
        a = grs.nextInt();

        /*for(int i=1; i<=a && k <a;){
                i=i*4;
                System.out.println(i);

                k=k*5;
                System.out.println(k);

        }*/
        while (i<a && k < a){
            i=i*4;
            if (i>a){
                break;
            }
            System.out.println(i);
            k=k*5;
            if(k>a){
                break;
            }
            System.out.println(k);
        }

    }

    }
