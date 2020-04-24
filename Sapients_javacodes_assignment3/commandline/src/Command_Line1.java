
public class Command_Line1 {
	int[] numbers=new int[10000];;
	int sum;
	double avg;
	int biggest;
	int smallest;
	
	// setData() method to store command line arguments in array
	
	public void setData(int num,int index)
	{
	 	this.numbers[index]=num;
	}
	
	//calData() to perform operations like sum,avg,max,min
	
	public void calData(int length)
	{
		int sum1=0;
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		
		// calculating the sum of numbers
		
		for (int i = 0; i < length; i++) 
	            sum1+=  numbers[i];
		this.sum=sum1;
		
		//calculating the average of numbers
		
		this.avg=(sum/length);
		
		//calculating the maximum among the numbers
		
		for(int i=0;i<length;i++)
		{
			if(max<numbers[i])
				max=numbers[i];
		}
		this.biggest=max;
		
		//calculating the minimum among the numbers
		
		for(int i=0;i<length;i++)
		{
			if(min>numbers[i])
				min=numbers[i];
		}
		this.smallest=min;
	}
	
	// displayData() method to display values of sum,avg,max,min 
	
	public void displayData()
	{
		
		System.out.println("sum="+sum);
		System.out.println("avg="+avg);
		System.out.println("biggest="+biggest);
		System.out.println("smallest="+smallest);

	}
}
