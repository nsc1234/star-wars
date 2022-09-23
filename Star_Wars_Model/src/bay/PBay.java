package bay;

public class PBay extends FighterBay {
	
	private int Capacity = 48;

	public PBay(String BayName, String BayID) {
		super(BayName, BayID);
		this.setBayType("Tie Fighter H");
		
	}
	

	public int getCapacity() {
		return Capacity;
	}

	public void setCapacity(int capacity) {
		Capacity = capacity;
	}

}
