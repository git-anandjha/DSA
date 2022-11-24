import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scn=new Scanner(System.in);
        int n1= scn.nextInt();
        int[] arr1=new int[n1];
        int[] resAr=new int[];
        for (int i = 0; i < n1; i++) {
            arr1[i]= scn.nextInt();
        }
        int n2= scn.nextInt();
        int[] arr2=new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i]= scn.nextInt();
        }
        int subCarry=0;
        for (int i = n2; i > 0 ; i--) {
            int f=0;
             if((arr2[i]+subCarry) - arr1[i] >= 0){
                 f=arr2[i]+subCarry) - arr1[i];
                 System.out.println();
                 f=(arr2[i]+subCarry) - arr1[i];
                 subCarry=0;
             }else{
                 System.out.println();
                 f=(arr2[i]+subCarry) - arr1[i];
                 subCarry=0;
             }
        }
    }
}