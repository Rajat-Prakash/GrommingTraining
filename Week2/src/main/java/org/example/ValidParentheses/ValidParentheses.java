package org.example.ValidParentheses;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='[' || ch=='{' || ch=='('){
                stack.push(ch);
            }
            else{
                if(ch==']'){
                    if(stack.size()==0) return false;
                    char temp=stack.pop();
                    if(temp!='[') return false;
                }
                else if(ch=='}'){
                    if(stack.size()==0) return false;
                    char temp=stack.pop();
                    if(temp!='{') return false;
                }
                else{
                    if(stack.size()==0) return false;
                    char temp=stack.pop();
                    if(temp!='(') return false;
                }
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        ValidParentheses validParentheses = new ValidParentheses();
        System.out.println(validParentheses.isValid("()[]{}}"));
        System.out.println(validParentheses.isValid("()[]{}"));
    }
}

