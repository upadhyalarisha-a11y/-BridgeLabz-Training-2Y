package Stack;

import java.util.Stack;

public class ReverseStackRecursion {

    static void insertAtBottom(Stack<Integer> st, int x)
    {
        if(st.isEmpty())
        {
            st.push(x);
            return;
        }

        int temp = st.pop();
        insertAtBottom(st, x);
        st.push(temp);
    }

    static void reverse(Stack<Integer> st)
    {
        if(st.isEmpty())
            return;

        int temp = st.pop();

        reverse(st);

        insertAtBottom(st, temp);
    }

    public static void main(String[] args)
    {
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        System.out.println("Original Stack: " + st);

        reverse(st);

        System.out.println("Reversed Stack: " + st);
    }
}