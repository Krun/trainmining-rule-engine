/**
 * 
 */
package es.upm.dit.gsi.trainmining.model;

import java.util.List;

/**
 * @author �lvaro
 *
 */
public class Prediction {

	private List<PossibleEvent> predictionList;
	private List<Alarm> currentEventsList;
	
	private long initialTimestamp;
	private long finalTimestamp;

	/**
	 * @return the prediction
	 */
	public List<PossibleEvent> getPrediction() {
		return predictionList;
	}

	/**
	 * @param prediction the prediction to set
	 */
	public void setPrediction(List<PossibleEvent> prediction) {
		this.predictionList = prediction;
	}

	/**
	 * @return the initialTimestamp
	 */
	public long getInitialTimestamp() {
		return initialTimestamp;
	}

	/**
	 * @param initialTimestamp the initialTimestamp to set
	 */
	public void setInitialTimestamp(long initialTimestamp) {
		this.initialTimestamp = initialTimestamp;
	}

	/**
	 * @return the finalTimestamp
	 */
	public long getFinalTimestamp() {
		return finalTimestamp;
	}

	/**
	 * @param finalTimestamp the finalTimestamp to set
	 */
	public void setFinalTimestamp(long finalTimestamp) {
		this.finalTimestamp = finalTimestamp;
	}

	/**
	 * @return the currentEventsList
	 */
	public List<Alarm> getCurrentEventsList() {
		return currentEventsList;
	}

	/**
	 * @param currentEventsList the currentEventsList to set
	 */
	public void setCurrentEventsList(List<Alarm> currentEventsList) {
		this.currentEventsList = currentEventsList;
	}
	

	

	
	
}
