
//[1][3][55][99][][]  == 6 curEllement=4
//[1][55][99][99][][] == 6 curEllement=3


public class AutoPark {
	private Bus[] busArray = null;
	private int curEllement;

	public AutoPark(int capacity) {
		this.busArray = new Bus[capacity];
		curEllement = 0;
	}

	public void add(Bus bus) {
		if (curEllement < busArray.length) {
			busArray[curEllement] = bus;
			curEllement++;
		}
	}

	public void print() {
		for (int i = 0; i < curEllement; i++) {
			System.out.println(busArray[i]);
		}
	}
	
	public void remove() {
		if(curEllement>0) curEllement--;
	}
	
	
	// public int find(Bus b) {
		/// if(b.equals(busArray[i])) { }
	//public void remove2(Bus b) {
		
	// }

}
