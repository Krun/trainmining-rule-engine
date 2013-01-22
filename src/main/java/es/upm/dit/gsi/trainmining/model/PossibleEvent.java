/**
 * 
 */
package es.upm.dit.gsi.trainmining.model;

/**
 * @author �lvaro
 *
 */
public class PossibleEvent {
	
	private String alarmCode;
	private String alarmType;
	private int installationID;
	private double confidence; // 0 < confidence < 1
	
	public PossibleEvent(String alarmCode, String alarmType,
			int installationID, double confidence) {
		super();
		this.alarmCode = alarmCode;
		this.alarmType = alarmType;
		this.installationID = installationID;
		this.confidence = confidence;
	}

	/**
	 * @return the alarmCode
	 */
	public String getAlarmCode() {
		return alarmCode;
	}
	/**
	 * @param alarmCode the alarmCode to set
	 */
	public void setAlarmCode(String alarmCode) {
		this.alarmCode = alarmCode;
	}
	/**
	 * @return the alarmType
	 */
	public String getAlarmType() {
		return alarmType;
	}
	/**
	 * @param alarmType the alarmType to set
	 */
	public void setAlarmType(String alarmType) {
		this.alarmType = alarmType;
	}
	/**
	 * @return the installationID
	 */
	public int getInstallationID() {
		return installationID;
	}
	/**
	 * @param installationID the installationID to set
	 */
	public void setInstallationID(int installationID) {
		this.installationID = installationID;
	}
	/**
	 * @return the confidence
	 */
	public double getConfidence() {
		return confidence;
	}
	/**
	 * @param confidence the confidence to set
	 */
	public void setConfidence(double confidence) {
		this.confidence = confidence;
	}
	
	/**
	 * @param o Object to compare to
	 * @return true if objects refer to same event
	 */
	public boolean equals(Object o) {
		if (o instanceof PossibleEvent) {
			PossibleEvent a = (PossibleEvent) o;
			if (this.installationID != a.getInstallationID()) return false;
			if (!this.alarmCode.equals(a.getAlarmCode())) return false;
			if (!this.alarmType.equals(a.getAlarmType())) return false;
			//if (this.confidence != a.getConfidence()) return false; Two events are the same even with different confidences
			return true;
	    }
	    return false;
	}

}
