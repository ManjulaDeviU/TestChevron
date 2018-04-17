import java.util.Scanner;

class SortInDescending
{
	
	public static void sortArray(int[] arr)
	{   System.out.println("Output :");
		int min=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=min;j<arr.length;j++)
			{
				if(arr[j]>arr[min])
				{
				int temp=0;
				temp=arr[min];
				arr[min]=arr[j];
				arr[j]=temp;
				}
			}
			System.out.print(arr[min]);
			System.out.print(" ");
			min++;
		}
	}
public static void main(String[] args)
{

Scanner scan= new Scanner(System.in);
System.out.println("Enter how many numbers have to be sorted");
int num = scan.nextInt();
int arr[]=new int[num];
System.out.println("Enter the numbers");
for(int i=0;i<arr.length;i++)
{
 arr[i]=scan.nextInt();
}
sortArray(arr);


}
}