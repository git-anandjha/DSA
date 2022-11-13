import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Benjamin bulbs");
        Scanner scn=new Scanner(System.in);
        int bulbs=scn.nextInt();
        for(int i=1;i*i<=bulbs;i++){
            System.out.println(i*i);
        }
    }
}