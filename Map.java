public interface Map<K extends Comparable, V> {
    void put(K key,V elem);
    V get(K key);
}
