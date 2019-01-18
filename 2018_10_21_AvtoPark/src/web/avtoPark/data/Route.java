package web.avtoPark.data;

public class Route {
	
	private int number;
	private String startPoint;
	private String endPoint;
	private int distance;
	public Route(int mumber, String startPoint, String endPoint, int distance) {
		super();
		this.number = mumber;
		this.startPoint = startPoint;
		this.endPoint = endPoint;
		this.distance = distance;
	}
	public int getNumber() {
		return number;
	}

	public String getStartPoint() {
		return startPoint;
	}

	public String getEndPoint() {
		return endPoint;
	}

	public int getDistance() {
		return distance;
	}

	@Override
	public String toString() {
		return "route  number -  " + number + ", startPoint -  " + startPoint + ", endPoint -  " + endPoint + ", distance -  "
				+ distance + "km.";
	}
	
	

}
