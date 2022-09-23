package hull;

public class Hull {

	private String IDNumber;
	private FwdHullSection SectionFwd ;
	private AftHullSection SectionAft;
	
	public Hull(String IDNumber, String StarDestroyerType) {
		this.IDNumber = IDNumber;
		this.SectionFwd = new FwdHullSection(StarDestroyerType);
		this.SectionAft = new AftHullSection(StarDestroyerType);
	}

	public String getIDNumber() {
		return IDNumber;
	}

	public void setIDNumber(String iDNumber) {
		IDNumber = iDNumber;
	}

	public FwdHullSection getSectionFwd() {
		return SectionFwd;
	}

	public void setSectionFwd(FwdHullSection sectionFwd) {
		SectionFwd = sectionFwd;
	}

	public AftHullSection getSectionAft() {
		return SectionAft;
	}

	public void setSectionAft(AftHullSection sectionAft) {
		SectionAft = sectionAft;
	}

}
