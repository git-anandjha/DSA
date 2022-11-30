import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("balanced brackets");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        Stack<Character> st=new Stack<Character>();
        for (int i = 0; i < str.length(); i++) {
            Character ch=str.charAt(i);
            if(ch=='(' || ch =='{' ||ch=='['){
                st.push(ch);
            }else if(ch==')' || ch =='}' ||ch==']'){
                if(st.isEmpty()){
                    System.out.println(false);
                    return;
                }else{
                    if(st.peek()=='(' && ch==')'){
                        st.pop();
                    }else if(st.peek()=='{' && ch=='}'){
                       st.pop();
                    } else if (st.peek()=='[' && ch==']') {
                        st.pop();
                    }else{
                        System.out.println(false);
                        return;
                    }
                }
            }
        }
        if(st.isEmpty()){
            System.out.println(true);
        }
    }
}