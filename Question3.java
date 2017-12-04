
public class Question3 
{
	private char[] stalls;
	
	public Question3(char[] array)
	{
		stalls = array;
	}
	
	public void feedHorse(int stallNum)
	{
		char horseName = stalls[stallNum];
		int foodLoc = -1;
		for(int i = 0; i < stalls.length; i++)
		{
			if(stalls[i] == '*')
			{
				foodLoc = i;
			}
		}
		stalls[foodLoc] = horseName;
		stalls[stallNum] = '+';
	}
	
	public char[] getStalls()
	{
		return stalls;
	}
}
