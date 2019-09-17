package LinkedList;


import stack.Stack;
import stack.impl.ArrayStack;

import java.util.Random;

public class Main {
    private static double testStack(Stack<Integer> stack,int opCount){
        long startTime= System.nanoTime();
        Random random=new Random();
        for (int i = 0; i < opCount; i++) {
            stack.push(random.nextInt(Integer.MAX_VALUE));
        }
        for (int i = 0; i < opCount; i++) {
            stack.pop();
        }
        long endTime= System.nanoTime();
        return (endTime-startTime)/1000000000.0;
    }
    //    public static void main(String[] args) {
//        LinkedList<Integer> linkedList = new LinkedList<Integer>();
//        for (int i = 0; i < 5; i++) {
//            linkedList.addFirst(i);
//            System.out.println(linkedList);
//        }
//        linkedList.add(2,666);
//        System.out.println(linkedList);
//        linkedList.remove(2);
//        System.out.println(linkedList);
//        linkedList.removeFirst();
//        System.out.println(linkedList);
//        linkedList.removeLast();
//        System.out.println(linkedList);
//    }
    public static void main(String[] args) {
        int opCount =10000000;
        ArrayStack<Integer> arrayStack =new ArrayStack<>();
        double time1=testStack(arrayStack, opCount);
        System.out.println("ArrayStack, time: "+ time1+" s");
        LinkedListStack<Integer> linkedListStack =new LinkedListStack<Integer>();
        double time2=testStack(linkedListStack, opCount);
        System.out.println("LinkedListStack, time: "+ time2+" s");
    }
}
