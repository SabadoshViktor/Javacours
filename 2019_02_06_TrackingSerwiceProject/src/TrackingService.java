import java.util.ArrayList;

public class TrackingService {

	private int goal;
	private int total;
	private ArrayList<HistoryItem> history = new ArrayList<>();
	private int historyId=0;
	
	
	public int getGoal() {
		return goal;
	}
	
	
	public void setGoal(int goal) throws InvalidGoalException{
		if(goal<0) {
			throw new InvalidGoalException();
		}
		this.goal = goal;
	}
	
	
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public ArrayList<HistoryItem> getHistory() {
		return history;
	}
	public void setHistory(ArrayList<HistoryItem> history) {
		this.history = history;
	}
	public int getHistoryId() {
		return historyId;
	}
	public void setHistoryId(int historyId) {
		this.historyId = historyId;
	}
	
	public void addCalories(int amount) {
		total = total + amount;
		history.add(new HistoryItem(historyId, amount, "add", total));
		historyId++;
	}
	
	public void removeCalories(int amount) {
		total = total - amount;
		if(total < 0) {
			total=0;
		}
		history.add(new HistoryItem(historyId++, amount, "remove", total));
	}
	
	public boolean isGoalMet() {
		boolean res =  total>=goal?true:false;
		return res;
		
		// or
		
//		if(total>=goal) {
//		return true;
//	}
//	else {
//		return false;
//	}
	}
	
	
}
