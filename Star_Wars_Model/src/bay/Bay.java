package bay;

public abstract class Bay {
	
	private String BayName;
	private String BayID;
	private String BayType;
	
	
	protected Bay () {
		
	}
	
	public Bay(String BayName, String BayID, String BayType) {
		this.BayName = BayName;
		this.BayID = BayID;
		this.BayType = BayType;
	}
	
	public String getBayName() {
		return BayName;
	}

	public void setBayName(String bayName) {
		BayName = bayName;
	}

	public String getBayID() {
		return BayID;
	}

	public void setBayID(String bayID) {
		BayID = bayID;
	}

	public String getBayType() {
		return BayType;
	}

	public void setBayType(String bayType) {
		BayType = bayType;
	}

	public Bay(String BayName, String BayID) {
		this.BayName = BayName;
		this.BayID = BayID;
	}
	

}
