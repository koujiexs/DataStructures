package redBlackTree;

import AVLTree.AVLTree;

import java.util.ArrayList;
import java.util.Random;

public class Main2 {
    public static void main(String[] args) {
        int n = 20000000;
        Random random=new Random();
        ArrayList<Integer> testData = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            testData.add(random.nextInt(Integer.MAX_VALUE));
        }
        //Test BST
        long startTime =System.nanoTime();
        BST<Integer,Integer> bst =new BST<Integer,Integer>();
        testData.forEach(i -> bst.add(i,null));
        long endTime =System.nanoTime();
        double time =(endTime-startTime)/1000000000.0;
        System.out.println("BST: "+time+" s");
        //Test AVL
        startTime =System.nanoTime();
        AVLTree<Integer,Integer> avl =new AVLTree<Integer,Integer>();
        testData.forEach(i -> avl.add(i,null));
        endTime =System.nanoTime();
        time =(endTime-startTime)/1000000000.0;
        System.out.println("AVL: "+time+" s");
        //Test AVL
        startTime =System.nanoTime();
        RBTree<Integer,Integer> rbt =new RBTree<Integer,Integer>();
        testData.forEach(i -> rbt.add(i,null));
        endTime =System.nanoTime();
        time =(endTime-startTime)/1000000000.0;
        System.out.println("RBTree: "+time+" s");
    }
}
