package unionFind;

import java.util.Random;

public class Main {
    private static double testUf(UF uf,int m){
        int size =uf.getSize();
        Random random=new Random();
        long startTime = System.nanoTime();
        for (int i = 0; i < m; i++) {
            uf.unionElements(random.nextInt(size),random.nextInt(size));
        }
        for (int i = 0; i < m; i++) {
            uf.isConnected(random.nextInt(size),random.nextInt(size));
        }
        long endTime = System.nanoTime();
        return (endTime-startTime)/1000000000.0;
    }
    public static void main(String[] args) {
        int size =10000000;
        int m =10000000;
//        UnionFind1 uf1 =new UnionFind1(size);
//        System.out.println("UnionFind1 : "+ testUf(uf1,m)+" s");
//        UnionFind2 uf2 =new UnionFind2(size);
//        System.out.println("UnionFind2 : "+ testUf(uf2,m)+" s");
        UnionFind3 uf3 =new UnionFind3(size);
        System.out.println("UnionFind3 : "+ testUf(uf3,m)+" s");
        UnionFind4 uf4 =new UnionFind4(size);
        System.out.println("UnionFind4 : "+ testUf(uf4,m)+" s");
        UnionFind5 uf5 =new UnionFind5(size);
        System.out.println("UnionFind5 : "+ testUf(uf5,m)+" s");
        UnionFind6 uf6 =new UnionFind6(size);
        System.out.println("UnionFind6 : "+ testUf(uf6,m)+" s");
    }
}
