//HashMap
import java.util.*;
public class Ex04<K, V> {

	private static final int TABLE_SIZE = 128;
	private HashEntry <K, V>[] table;

	public Ex04() {
		table = new HashEntry[TABLE_SIZE];
	}

	public void put(K key, V value) {
		final int hashIndex = Math.abs(key.hashCode()) % TABLE_SIZE;
		final HashEntry<K, V> entry = new HashEntry<>(key, value);
		table[hashIndex] = entry;
	}

	public V get(K key) {
		final int hashIndex = Math.abs(key.hashCode()) % TABLE_SIZE;
		 final HashEntry<K, V> entry = table[hashIndex];
		return entry.getValue();
	}

	private static class HashEntry<K, V> {
		private final K key;
		private final V value;

		public HashEntry(K key, V value) {
			this.key = key;
			this.value = value;
		}

		public K getKey() {
			return key;
		}

		public V getValue() {
			return value;
		}

	}

}
