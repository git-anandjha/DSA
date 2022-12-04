import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("Stock span");
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st=new Stack<Integer>();
        int n=sc.nextInt();
        int[] spn=new int[n];
        for (int i = 0; i < n; i++) {
            spn[i]=sc.nextInt();
        }

        int s=1;
        for(int i = n-1; i >= 0; i--) {
            int e=spn[i];
            if(st.isEmpty()){
                spn[i]=s;
            }else{
                while(st.size() > 0 && e <= st.peek()  ){
                    spn[i]=1;
                }
                if(st.isEmpty()){
                    spn[i]=s;
                }else{
                    
                }

            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(spn[i]+" ");
        }
    }
}