package DataStructures1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DS3_Stacks {

    private static final List<Character> leftBrackets = Arrays.asList('(','<','{','[');
    private static final List<Character> rightBrackets = Arrays.asList(')','>','}',']');

    public static void main(String[] args) {
//        Stack<Character> stack = new Stack<>();
//
//        String str = "abcd";
//        StringBuffer revStr = new StringBuffer();
//
//        for(char ch : str.toCharArray())
//        {
//            stack.push(ch);
//        }
//
//        while(!stack.empty())
//        {
//            revStr.append(stack.pop());
//        }
//        System.out.println(revStr);
        Stack s = new Stack(5);
        s.push(11);
        s.push(12);
        System.out.println(s);
        String str = "([1+2))";
        var x = balanacedPairs(str);
        if(x)
            System.out.println("Equation balanced");
        else
            System.out.println("Not Balanced");
    }

    public static boolean balanacedPairs(String k){
        java.util.Stack<Character> s = new java.util.Stack<>();

        for(char ch : k.toCharArray())
        {
            if (checkLeftPairs(ch))
                s.push(ch);

            if(checkRightPairs(ch))
            {
                if(s.empty())
                    return false;
                var top = s.pop();
                if(bracketMatch(top,ch))
                    return false;
                s.pop();
            }

        }
        if(s.empty())
            return true;
        else
            return false;

    }

    private static boolean checkLeftPairs(char ch)
    {
        return leftBrackets.contains(ch);
    }

    private static boolean checkRightPairs(char ch)
    {
        return rightBrackets.contains(ch);
    }

    private static boolean bracketMatch(char left , char right){
        return leftBrackets.indexOf(left) == rightBrackets.indexOf(right);
    }


}
