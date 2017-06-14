
public class OrderArray1 {
	private long[] a;
	private int Elems;

	public OrderArray1(int max) {
		a = new long[max];
		Elems = 0;
	}

	public int size() {
		return Elems;
	}

	public int find(long searchKey) {
		int lowerBound = 0;
		int upperBound = Elems - 1;
		int curIn;
		while (true) {
			curIn = (lowerBound + upperBound) / 2;
			if (a[curIn] == searchKey)
				return curIn;
			else if (lowerBound > upperBound) {
				return Elems;
			} else {
				if (a[curIn] < searchKey)
					lowerBound = curIn + 1;
				else {
					upperBound = curIn - 1;
				}
			}
		}
	}

	public void insert(long value) {
		int j;
		// �������һ��ʼ���бȽϣ���������ĳ��ֵ����Ҫ�����ֵbreak
		for (j = 0; j < Elems; j++) {
			if (a[j] > value)
				break;
		}
		// �Ӻ��濪ʼ��ǰ�������������ǰ����Ǹ�����ֱ������λ��
		for (int k = Elems; k > j; k--) {
			a[k] = a[k - 1];
		}
		// ����ɹ������鳤�ȼ�1
		a[j] = value;
		Elems++;
	}

	public boolean delete(long value) {
		int j = find(value);
		if (j == Elems)
			return false;
		else {
			for (int k = j; k < Elems; k++)
				a[k] = a[k + 1];
		}
		Elems--;
		return true;
	}

	public void display() {
		for (int j = 0; j < Elems; j++)
			System.out.print(a[j] + " ");
		System.out.println("");
	}
}
