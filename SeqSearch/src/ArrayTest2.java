import java.util.Scanner;

public class ArrayTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayCreate2 arr = new ArrayCreate2(100);
		arr.insert(33);
		arr.insert(44);
		arr.insert(55);
		arr.insert(22);
		arr.insert(11);
		arr.display();
		System.out.println("");
		int Elems = 5;
		Scanner input = new Scanner(System.in);

		System.out.println("请输入你要查找的数：");
		// 存放控制台输入的语句
		int key1 = input.nextInt();
		if (arr.find(key1)) {
			System.out.println("Found " + key1);

		} else {
			System.out.println("can't find " + key1);
		}
		Scanner input2 = new Scanner(System.in);
		System.out.println("请输入你要删除的数：");
		// 存放控制台输入的语句
		int key2 = input.nextInt();
		arr.delete(key2);
		arr.display();
	}

}
