
public class Question1 
{
	public double[] computeDistance(int[] array)
	{
		double[] distance = new double[array.length];
		int sum = 0;
		for(int i = 0; i < array.length; i++)
		{
			sum = sum + array[i];
		}
		double average = (double)sum/array.length;
		for(int i = 0; i < array.length; i++)
		{
			distance[i] = array[i] - average;
		}
		
		
		
		return distance;
	}
}
