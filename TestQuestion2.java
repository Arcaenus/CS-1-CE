import static org.junit.Assert.*;

import org.junit.Test;

public class TestQuestion2 {

	@Test
	public void testQuestion2()
	{
		Question2 q2 = new Question2();
		String[] input = {"hap", "dap", "mob"};
		assertEquals(8, q2.computeTotal(input));
		String[] input2 = {"dad", "mom", "sheep", "go", "baa"};
		assertEquals(5+8+0+0+2, q2.computeTotal(input2));
	}

}
