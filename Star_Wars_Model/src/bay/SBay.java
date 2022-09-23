package bay;

public class SBay extends FighterBay {

	private int Capacity = 36;

	public SBay(String BayName, String BayID) {
		super(BayName, BayID);
		this.setBayType("Tie Fighter I");
		this.setBayID("BF-1");	
	}
	
	public int getCapacity() {
		return Capacity;
	}


	public void setCapacity(int capacity) {
		Capacity = capacity;
	}

}
