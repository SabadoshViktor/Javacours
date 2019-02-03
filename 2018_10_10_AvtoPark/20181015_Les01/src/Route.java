
public class Route {
	private int number;
	private String startPoint;
	private String endPoint;
	private int distance;

	public Route(int number, String startPoint, String endPoint, int distance) {
		super();
		this.number = number;
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
		return "Route [Number=" + number + ", startPoint=" + startPoint + ", endPoint=" + endPoint
				+ ", distance="
				+ distance + "]";
	}

}
