//��������
public class SelectionSort {

	public static void main(String[] args) {
		int a[]={1,3,6,4,2,22};
		System.out.println("����֮ǰ��");
		for(int num:a)
		{
			System.out.print(num+" ");
		}
		for(int i=0;i<a.length-1;i++)
		{
			int min=i;//��СԪ������
			for(int j=min+1;j<a.length;j++)//�ҳ���Сֵ������
			{
				if(a[j]<a[min])
				{
					min=j;
					
				}
				
			}
			
			System.out.println(min);
			int temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		System.out.println();
		System.out.println("����֮��:");
		for(int num:a)
		{
			System.out.print(num+" ");
		}

	}

}
