package WordReverse;
//��Ҫ���ṩ��ת�ַ�������
public class WordReverseTest {
	private String input;
	private String output;

	public WordReverseTest(String in) {
		input = in;
	}

	public String doRev() {
		int stackSize = input.length();
		WordReverse wr = new WordReverse(stackSize);
		for (int j = 0; j < input.length(); j++) {
			char ch = input.charAt(j);// �������еõ�һ���ַ���
			wr.push(ch);
		}
		output = "";
		while (!wr.isEmpty()) {
			char ch = wr.pop();
			output = output + ch;
		}
		return output;
	}
}
