
public class InsertSort {
	public static void main(String[] args)
	{
		int a[]={1,3,6,4,19,2};
		System.out.println("����֮ǰ��");
		for(int num:a)
		{
			System.out.print(num+" ");
		}
		 
		//��Ϊ��һ���Ѿ��ó�����Ҫ�ӵڶ�����ʼ�Ƚϣ�����ֱ�Ӵ�i=1��ʼ��
		//�������̿��Կ����Ǵ�����������������������Ĺ���
		
		//�������
		for(int i=1;i<a.length;i++)
		{
			int j;
			int temp=a[i];
			//�������
			for(j=i-1;j>=0&&temp<a[j];j--)
			{
				//�����������¼����������������������һ����С�������һ���������ƶ�һ��
				//����¼�����������һ�������󣬾Ͳ��ú�ǰ������Ƚ���
				a[j+1]=a[j];
			}
			//�����������¼����������������������һ���������¼������ֱ�����������
			a[j+1]=temp;
		}
		
		System.out.println();
		System.out.println("����֮��:");
		for(int num:a)
		{
			System.out.print(num+" ");
		}
	}
}
