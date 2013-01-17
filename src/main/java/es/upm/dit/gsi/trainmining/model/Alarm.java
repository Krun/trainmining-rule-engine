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
	
}
