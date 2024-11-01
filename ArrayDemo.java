public class ArrayDemo
{
	public static void main(String[] args)
	{
		int[] numbers = new int[20];
		
		initializeArray(numbers);
		
		System.out.println("The random numbers are: ");
		displayArray(numbers);
		
		System.out.println("\nThe smallest number in the list: " + getSmallest(numbers));
		
		System.out.println("The average of the array elements is: " + getAverage(numbers));
		
		reverseArray(numbers);
		
		System.out.println("The random numbers in reverse are: ");
		displayArray(numbers);
	}
	
	public static void initializeArray(int[] array)
	{
		for(int i = 0; i < array.length; i++)
		{
			array[i] = (int) (Math.random() * 101);
		}
	}
	
	public static void displayArray(int[] array)
	{
		for(int i = 0; i < array.length; i++)
		{
			System.out.print(array[i] + " ");
		}
	}
	
	public static int getSmallest(int[] array)
	{
		int small = array[0];
		for(int i = 1; i < array.length; i++)
		{
			if(array[i] < small)
				small = array[i];
		}
		return small;
	}
	
	public static double getAverage(int[] array)
	{
		double sum = 0;
		for(int i = 0; i < array.length; i++)
		{
			sum += array[i];
		}
		return sum/array.length;
	}
	
	public static void reverseArray(int[] array)
	{
		int temp;
		for(int i = 0,  j = array.length - 1; i < j; i++, j--)
		{
			temp = array[i];
			array[i] = array[j];
			array[j] = temp;
		}
	}
}
