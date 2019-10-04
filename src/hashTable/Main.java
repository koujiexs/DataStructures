package hashTable;

import AVLTree.AVLTree;
import redBlackTree.BST;
import redBlackTree.RBTree;
import set.FileOperation;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        System.out.println("Pride and Prejudice");

        ArrayList<String> words = new ArrayList<>();
        if (FileOperation.readFile("pride-and-prejudice.txt", words)) {

            Collections.sort(words);


            //Test AVL
            long startTime = System.nanoTime();
            AVLTree<String, Integer> avl = new AVLTree<String, Integer>();
            for (String word : words) {
                if (avl.contains(word))
                    avl.set(word, avl.get(word) + 1);
                else
                    avl.add(word, 1);
            }
            for (String word : words) {
                avl.contains(word);
            }
            long endTime = System.nanoTime();
            double time = (endTime - startTime) / 1000000000.0;
            System.out.println("AVL: " + time + " s");
            //Test RBTree
            startTime = System.nanoTime();
            RBTree<String, Integer> rbt = new RBTree<String, Integer>();
            for (String word : words) {
                if (rbt.contains(word))
                    rbt.set(word, avl.get(word) + 1);
                else
                    rbt.add(word, 1);
            }
            for (String word : words) {
                rbt.contains(word);
            }
            endTime = System.nanoTime();
            time = (endTime - startTime) / 1000000000.0;
            System.out.println("RBTree: " + time + " s");

            //Test HashTable
            startTime = System.nanoTime();
            HashTable<String, Integer> ht = new HashTable<String, Integer>(132071);
            for (String word : words) {
                if (ht.contains(word))
                    ht.set(word, avl.get(word) + 1);
                else
                    ht.add(word, 1);
            }
            for (String word : words) {
                ht.contains(word);
            }
            endTime = System.nanoTime();
            time = (endTime - startTime) / 1000000000.0;
            System.out.println("hashTable: " + time + " s");
        }
    }
}
