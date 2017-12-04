import static org.junit.Assert.*;

import org.junit.Test;

public class TestQuestion3 {

	
	@Test
	public void testQuestion3()
	{
		char[] array = {'*','h','o','r','n'};
		Question3 q3 = new Question3(array);
		q3.feedHorse(4);
		char[] expected = {'n','h','o','r','+'};
		for(int i=0;i<expected.length;i++)
		{
			assertEquals(expected[i],q3.getStalls()[i]);
		}
		
		char[] array2 = {'h','*','o','r','n','p'};
		Question3 q32 = new Question3(array2);
		q32.feedHorse(3);
		char[] expected2 = {'h','r','o','+','n', 'p'};
		for(int i=0;i<expected2.length;i++)
		{
			assertEquals(expected2[i],q32.getStalls()[i]);
		}
		
		char[] array3 = {'h','o','r','s','e','y','*'};
		Question3 q33 = new Question3(array3);
		q33.feedHorse(0);
		char[] expected3 = {'+','o','r','s','e','y','h'};
		for(int i=0;i<expected3.length;i++)
		{
			assertEquals(expected3[i],q33.getStalls()[i]);
		}
		
	}

}
