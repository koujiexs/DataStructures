package lineAndTree.unionFind;

public interface UF {
    int getSize();
    boolean isConnected(int p,int q);
    void unionElements(int p, int q);
}
