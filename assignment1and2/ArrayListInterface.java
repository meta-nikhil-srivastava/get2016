package assignment1and2;

public interface ArrayListInterface {
	/**
	 * Methods required for Implementations of the ArrayList using Array
	 */

	public boolean isEmpty();
	public void increaseCapacity();
	public Object[] copyAll(Object[] oldArray);
	public int indexOf(Object o);
	public Object getElement(int position);
	public void remove(int position);
	public void remove(Object value);
	public void clear();
	public void reverse();
	public void sort();


}
