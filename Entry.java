public class Entry<K extends Comparable<K>, V> implements Comparable<Entry<K, V>> {
    private K key;
    private V value;

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public Entry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public int compareTo(Entry o) {
        if (this.key.compareTo((K) o.key) > 0) {
            return 1;
        } else if (this.key.compareTo((K) o.key) < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
