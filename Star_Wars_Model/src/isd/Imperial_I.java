package isd;

public class Imperial_I extends StarDestroyer{
	
	public Imperial_I(String ShpNumber, String ShpName) {
		super(ShpNumber, ShpName, "Imperial_I");
	}

	@Override
	public void navigatesToPosition(String p) {
		System.out.println("Navigating to Position " + p);	
	}

}
