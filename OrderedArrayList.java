import java.util.ArrayList;
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
	public OrderedArrayList() {}
	public OrderedArrayList(int capacity) {
		super(capacity);
	}
	public int getIndex(T item) {
		for (int i = 0; i < this.size(); i++) {
			if (this.get(i).compareTo(item) > 0) {
				return i;
			}
		}
		return 0;
	}
	public void add(int index, T item) {
		add(item);
	}
	public boolean add(T item) {
		if (item == null) {
			throw new IllegalArgumentException("Can't be null!");
		}
		int i = this.getIndex(item);
		super.add(i, item);
		return true;
	}
	public T set(int i, T item) {
		if (item == null) {
			throw new IllegalArgumentException("Can't be null!");
		}
		T oldItem = remove(i);
		add(item);
		return oldItem;
	}
}
