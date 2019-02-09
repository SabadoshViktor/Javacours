import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class )
public class ParameterizedTest {
	TrackingService service = new TrackingService();
	int input;
	int expected;
	
	
	public ParameterizedTest(int input, int expected) {
		super();
		this.input = input;
		this.expected = expected;
	}
	
	@Parameters
	public static List<Object[]> data(){
		return Arrays.asList(new Object[][] {
			{5, 5}, {5,5} , {-12, 0}, {50,50},{1,1}
		});
	}
	@org.junit.Test
	public void testAddCalories() {
		if(input>=0) service.addCalories(input);
		else service.removeCalories(-input);
		 
		assertEquals(expected, service.getTotal());
	}

	
	
}
