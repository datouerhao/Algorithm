package WordReverse;
import java.io.IOException;
import java.util.Scanner;

public class WordReverseTest2 {

	public static void main(String[] args) throws IOException {
		String input, output;
		while (true) {

			Scanner sc = new Scanner(System.in);

			// ��ȡ�û�������ַ���

			System.out.print("�����������ַ�:");
			input = sc.nextLine();
			if (input.equals("")) {
				break;
			}
			WordReverseTest wr = new WordReverseTest(input);
			output = wr.doRev();
			System.out.println("��ת֮��" + output);
		}

	}

}
