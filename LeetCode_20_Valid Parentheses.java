import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int index = 0;index < s.length(); index++)
        {   
            char p = s.charAt(index);
            if(p == '(' || p == '[' || p == '{' || stack.size() == 0)
            {
                stack.add(p);
            }
            else if(p == ')' || p == ']' || p == '}')
            {   
                int compare = (int)stack.peek();
                if((int)p != compare + 1 && (int)p != compare + 2) //ASCII code
                {
                    return false;
                }
                stack.pop();
            }
        }
        if(stack.size() > 0) return false;   
        return true;
    }
}