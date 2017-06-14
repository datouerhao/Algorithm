import java.util.Scanner;

public class ArrayTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayCreate1 arr = new ArrayCreate1(100);
		int Elems = 0;
		int j;
		arr.setElem(0, 33);
		arr.setElem(1, 11);
		arr.setElem(2, 66);
		arr.setElem(3, 22);
		arr.setElem(4, 55);
		arr.setElem(5, 34);
		Elems = 6;
		System.out.println("原始数据：");
		for (j = 0; j < Elems; j++) {
			System.out.print(arr.getElem(j) + " ");
		}
		System.out.println("");
		Scanner input = new Scanner(System.in);
		System.out.println("请输入你要删除的数：");
		// 存放控制台输入的语句
		int key = input.nextInt();
		// int key = 22;
		for (j = 0; j < Elems; j++) {
			if (arr.getElem(j) == key)
				break;
		}
		if (j == Elems) {
			System.out.println("can't find " + key);
		} else {
			System.out.println("Found " + key + "是第 " + (j + 1) + " 个");
		}
		for (j = 0; j < Elems; j++) {
			if (arr.getElem(j) == key) {
				break;

			}

		
		for (int k = j; k < Elems; k++) {
			arr.setElem(k, arr.getElem(k + 1));

		}
		}
		Elems--;
		System.out.println("最终数据：");
		for (j = 0; j < Elems; j++) {
			System.out.print(arr.getElem(j) + " ");
		}
	}

}
