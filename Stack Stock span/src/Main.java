import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("Stock span");
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st=new Stack<Integer>();
        int n=sc.nextInt();
        int[] arr=new int[n];
        int[] rs=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if(st.isEmpty()){
                rs[i]=i+1;
                st.push(i);
            }else{
                while( st.size()> 0 && arr[st.peek()] < arr[i]  ){
                    st.pop();
                }
                if(st.isEmpty()){
                    rs[i]=i+1;
                    st.push(i);
                }else{
                    rs[i]= i-st.peek();
                    st.push(i);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(rs[i]+" ");
        }

    }
}