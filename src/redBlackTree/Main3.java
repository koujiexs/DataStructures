package redBlackTree;

import AVLTree.AVLTree;

import java.util.ArrayList;
import java.util.Random;

public class Main3 {
    public static void main(String[] args) {
        int n = 20000000;
        Random random=new Random();
        ArrayList<Integer> testData = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            testData.add(i);
        }
        //Test AVL
        long startTime =System.nanoTime();
        AVLTree<Integer,Integer> avl =new AVLTree<Integer,Integer>();
        testData.forEach(i -> avl.add(i,null));
        long endTime =System.nanoTime();
        double time =(endTime-startTime)/1000000000.0;
        System.out.println("AVL: "+time+" s");
        //Test RBTree
        startTime =System.nanoTime();
        RBTree<Integer,Integer> rbt =new RBTree<Integer,Integer>();
        testData.forEach(i -> rbt.add(i,null));
        endTime =System.nanoTime();
        time =(endTime-startTime)/1000000000.0;
        System.out.println("RBTree: "+time+" s");
    }
}
