import static org.junit.Assert.*;

import org.junit.experimental.categories.Category;


public class Test {

	@Category(GoodTestCategory.class)
	@org.junit.Test
	public void addCaloriesTest() {
		TrackingService service = new TrackingService();
		service.addCalories(100);
		assertEquals(100,service.getTotal());
		
	}
	
	@Category(GoodTestCategory.class)
	@org.junit.Test
	public void removeCaloriesTest() {
		TrackingService service = new TrackingService();
		service.addCalories(100);
		service.removeCalories(40);
		assertEquals(60,service.getTotal());
	}
	
	@Category(BadTestCategory.class)
	@org.junit.Test
	public void negative() {
		TrackingService service = new TrackingService();
		service.removeCalories(40);
		assertEquals(20,service.getTotal());
		
	}
	
	@Category(GoodTestCategory.class)
	@org.junit.Test
	public void testArraySize() {
		TrackingService service = new TrackingService();
		service.addCalories(100);
		assertEquals(1,service.getHistory().size());
	}
	
	@Category(GoodTestCategory.class)
	@org.junit.Test
	public void checkList() {
		TrackingService service = new TrackingService();
		service.addCalories(100);
		service.addCalories(100);
		service.addCalories(100);
		service.addCalories(100);

		assertEquals(4,service.getHistoryId());
	}
	
	@org.junit.Test
	public void checkGoalStatus() {
		TrackingService service = new TrackingService();
		service.addCalories(1005);
		assertEquals(true,service.isGoalMet());
	}
	

}
