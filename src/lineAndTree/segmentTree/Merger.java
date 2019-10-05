package lineAndTree.segmentTree;

/**
 * @author liyang on 2019/9/22
 */
public interface Merger<E> {
    E merge(E a,E b);
}
