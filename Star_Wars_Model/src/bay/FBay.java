package bay;

public class FBay extends FighterBay {
	
	private int Capacity = 96;

	public FBay(String BayName, String BayID) {
		super(BayName, BayID);
		this.setBayType("Tie Fighter S");
		this.setBayID("BS-1");
	}

	public int getCapacity() {
		return Capacity;
	}

	public void setCapacity(int capacity) {
		Capacity = capacity;
	}

}
