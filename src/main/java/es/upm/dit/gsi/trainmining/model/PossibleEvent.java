/**
 * 
 */
package es.upm.dit.gsi.trainmining.model;

/**
 * @author Álvaro
 *
 */
public class PossibleEvent {
	
	private String alarmCode;
	private String alarmType;
	private int instalationID;
	
	// 0 < confidence < 1
	private double confidence;
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
	 * @return the instalation
	 */
	public int getInstalation() {
		return instalationID;
	}
	/**
	 * @param instalation the instalation to set
	 */
	public void setInstalation(int instalation) {
		this.instalationID = instalation;
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

}
