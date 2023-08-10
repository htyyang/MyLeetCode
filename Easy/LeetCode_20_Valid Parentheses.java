import java.util.Stack;
//ASCII code
/*
( (Open parenthesis) - ASCII: 40
) (Close parenthesis) - ASCII: 41
[ (Open square bracket) - ASCII: 91
] (Close square bracket) - ASCII: 93
{ (Open curly brace) - ASCII: 123
} (Close curly brace) - ASCII: 125
 */
class Solution {
    public boolean isValid(String s) {
        Stack<Integer> stack = new Stack<>();
        int p;
        int compare;
        for(int index = 0;index < s.length(); index++)
        {   
            p = (int)s.charAt(index);
            if(p == 40 || p == 91 || p == 123 || stack.size() == 0)
            {
                stack.add(p);
            }
            else if(p == 41 || p == 93 || p == 125)
            {   
                compare = stack.peek();
                if(p != compare + 1 && p != compare + 2) 
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