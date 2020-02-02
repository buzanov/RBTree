public class RBTreeMapImplementation<K extends Comparable<K>, V> implements Map<K, V> {

    RedBlackTree<Entry<K, V>> rbTree;

    public RBTreeMapImplementation() {
        rbTree = new RedBlackTree<>();
    }

    @Override
    public void put(K key, V elem) {
        rbTree.add(new Entry<>(key, elem));
    }

    @Override
    public V get(K key) {
        Entry<K, V> entry = rbTree.findNode(new Entry<>(key, null)).getValue();
        return entry == null ? null : entry.getValue();
    }
}
