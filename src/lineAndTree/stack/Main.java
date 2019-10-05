package lineAndTree.stack;

import lineAndTree.stack.impl.ArrayStack;



public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack=new ArrayStack<>();
        for (int i = 0; i < 5; i++) {
            stack.push(i);
            System.out.println(stack);
        }
        stack.pop();
        System.out.println(stack);
    }
//    public boolean isValid(String s){
//        Stack<Character> lineAndTree.stack=new Stack<>();
//        for (int i=0;i<s.length();i++){
//            char c=s.charAt(i);
//            if (c=='c'||c=='['||c=='{'){
//                lineAndTree.stack.push(c);
//            }else {
//                if (lineAndTree.stack.isEmpty()){
//                    return false;
//                }
//                char topChar =lineAndTree.stack.pop();
//                if (c==')'&&topChar!='('){
//                    return false;
//                }
//                if (c==']'&&topChar!='['){
//                    return false;
//                }
//                if (c=='}'&&topChar!='{'){
//                    return false;
//                }
//
//            }
//        }
//        return lineAndTree.stack.isEmpty();
//    }
}
