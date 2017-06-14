
public class ArrayCreate1 {

	private long[] a;

	public ArrayCreate1(int size) {
		a = new long[size];
	}

	public void setElem(int index, long value) {
		a[index] = value;
	}

	public long getElem(int index) {
		return a[index];
	}

}
