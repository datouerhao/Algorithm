
public class ArrayCreate2 {
	private long[] a;
	private int Elems;

	public ArrayCreate2(int max) {
		a = new long[max];
		Elems = 0;
	}

	public boolean find(long key) {
		int j;
		for (j = 0; j < Elems; j++) {
			if (a[j] == key)
				break;
		}
		if (j == Elems) {
			return false;
		} else {
			return true;
		}
	}

	public void insert(long value) {
		a[Elems] = value;
		Elems++;
	}

	public boolean delete(long value) {
		int j;
		for (j = 0; j < Elems; j++) {
			if (a[j] == value)

				break;
		}
		if (j == Elems) {

			return false;
		}

		else {
			for (int k = j; k < Elems; k++)
				a[k] = a[k + 1];

			Elems--;
			return true;
		}
	}

	public void display() {
		for (int j = 0; j < Elems; j++) {
			System.out.print(a[j] + " ");
		}
	}
}
