import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T> {
	public NoNullArrayList() {}
	public NoNullArrayList(int capacity) {
		super(capacity);
	}
	public T set (int index, T item) {
		if (item == null) {
			throw new IllegalArgumentException("Can't be null!");
		}
		return super.set(index, item);
	}
	public void add (int index, T item) {
		if (item == null) {
			throw new IllegalArgumentException("Can't be null!");
		}
		super.add(index,item);
	}
	public boolean add(T item) {
		if (item == null) {
			throw new IllegalArgumentException("Can't be null!");
		}
		return super.add(item);
	}
}