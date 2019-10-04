package redBlackTree;


import AVLTree.AVLTree;
import set.FileOperation;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        System.out.println("Pride and Prejudice");

        ArrayList<String> words = new ArrayList<>();
        if(FileOperation.readFile("pride-and-prejudice.txt", words)) {

            Collections.sort(words);
            //Test BST
            long startTime=System.nanoTime();
            BST<String,Integer> bst =new BST<String, Integer>();
            for (String word : words) {
                if (bst.contains(word))
                    bst.set(word, bst.get(word) + 1);
                else
                    bst.add(word, 1);
            }
            for (String word: words) {
                bst.contains(word);
            }
            long endTime =System.nanoTime();
            double time=(endTime-startTime)/1000000000.0;
            System.out.println("BST: "+time+" s");

            //Test AVL
            startTime=System.nanoTime();
            AVLTree<String, Integer> avl = new AVLTree<String, Integer>();
            for (String word : words) {
                if (avl.contains(word))
                    avl.set(word, avl.get(word) + 1);
                else
                    avl.add(word, 1);
            }
            for (String word:words) {
                avl.contains(word);
            }
            endTime =System.nanoTime();
            time=(endTime-startTime)/1000000000.0;
            System.out.println("AVL: "+time+" s");
            //Test RBTree
            startTime=System.nanoTime();
            RBTree<String, Integer> rbt = new RBTree<String, Integer>();
            for (String word : words) {
                if (rbt.contains(word))
                    rbt.set(word, avl.get(word) + 1);
                else
                    rbt.add(word, 1);
            }
            for (String word:words) {
                rbt.contains(word);
            }
            endTime =System.nanoTime();
            time=(endTime-startTime)/1000000000.0;
            System.out.println("RBTree: "+time+" s");
        }
    }
}