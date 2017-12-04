
public class Question2 
{
	public int computeTotal(String[] array)
	{
		String str;
		int sum = 0;
		for(int i = 0; i < array.length; i++)
		{
			str = array[i];
			for(int j = 0; j < str.length(); j++)
			{
				if(str.charAt(j) == 'a')
				{
					sum = sum + 1;
				}else if(str.charAt(j) == 'd')
				{
					sum = sum + 2;
				}else if(str.charAt(j) == 'm')
				{
					sum = sum + 4;
				}
			}
		}
		return sum;
	}
}
