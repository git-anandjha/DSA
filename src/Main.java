import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(;t>0;t--){
            int val=sc.nextInt();
            int halfVal=val/2;
            while(halfVal>1){
                if(val % halfVal==0){
                    System.out.println("prime");
                    halfVal-=1;
                    break;
                }else{
                    System.out.println("not prime");
                    halfVal-=1;
                    break;
                }

            }
        }
    }
}