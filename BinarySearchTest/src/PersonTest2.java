//PersonTest2����PersonTest1
public class PersonTest2 {
	public static void main(String[] args) {
		int maxSize = 100;
		PersonTest arr = new PersonTest(maxSize);
		arr.insert("��", "��", 11);
		arr.insert("��", "��", 22);
		arr.insert("��", "��", 4);
		arr.display();
		String searchKey = "��";
		Person person = arr.find(searchKey);
		if (person != null) {
			System.out.println("");
			System.out.println("Found");
			person.display();
		} else {
			System.out.println("can't find " + searchKey);
		}
		System.out.println("");
		System.out.println("delete����");
		arr.delete("��");
		arr.display();
	}
}
