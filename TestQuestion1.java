import static org.junit.Assert.*;

import org.junit.Test;

public class TestQuestion1 {

	@Test
	public void testQuestion1() 
	{
		Question1 q1 = new Question1();
		int[] array = {1,2,3};
		double[] expRes = {-1.0,0.0,1.0};
		double[] actual = q1.computeDistance(array);
		for(int i=0;i<expRes.length;i++)
		{
			assertEquals(expRes[i], actual[i], 0.001);
		}
		
		int[] array2 = {1,2,3,4};
		double[] expRes2 = {-1.5,-0.5,0.5,1.5};
		double[] actual2 = q1.computeDistance(array2);
		for(int i=0;i<expRes2.length;i++)
		{
			assertEquals(expRes2[i], actual2[i], 0.001);
		}
	}

}
