/**
 * 
 */
package es.upm.dit.gsi.trainmining.model;

/**
 * @author 
 *
 */
public class Alarm {
 
	public Alarm(int installationID, String alarmCode) {
		super();
		this.installationID = installationID;
		this.alarmCode = alarmCode;
	}
	private int installationID;
	private String alarmCode;
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
	
	public boolean equals(Object o) {
		if (o instanceof Alarm) {
			Alarm a = (Alarm) o;
			if (this.installationID != a.getInstallationID()) return false;
			if (!this.alarmCode.equals(a.getAlarmCode())) return false;
			return true;
	    }
	    return false;
	}
	
}
