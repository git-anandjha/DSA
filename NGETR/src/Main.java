import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("Next greater element to the right.");
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st=new Stack<Integer>();
        int n=sc.nextInt();
        int[] spn=new int[n];
        int[] rs=new int[n];
        for (int i = 0; i < n; i++) {
            spn[i]=sc.nextInt();
        }

        for (int i = n-1; i >= 0; i--) {
            if(st.isEmpty()){
                rs[i]=-1;
                st.push(spn[i]);
            }else if(st.peek() > spn[i] ){
                    rs[i]=st.peek();
                    st.push(spn[i]);
            }else{
                while(st.size() !=0 && st.peek()< spn[i]){
                    st.pop();
                }
                if(st.isEmpty()){
                    rs[i]=-1;
                }else{
                    rs[i]=st.peek();
                }
                st.push(spn[i]);
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(rs[i]+"  ");
        }
    }
}