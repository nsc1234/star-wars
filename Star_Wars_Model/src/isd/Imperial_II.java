package isd;

public class Imperial_II extends StarDestroyer {

	public Imperial_II(String ShpNumber, String ShpName) {
		super(ShpNumber, ShpName, "Imperial_II");
		setShpCrew(12000);
	}

	@Override
	public void navigatesToPosition(String p) {
		System.out.println("Navigating to Position " + p);
	}

}
