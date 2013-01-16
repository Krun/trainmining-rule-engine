/**
 * 
 */
package es.upm.dit.gsi.trainmining.engine;

import java.util.List;

import es.upm.dit.gsi.trainmining.model.Alarm;
import es.upm.dit.gsi.trainmining.model.Prediction;

/**
 * @author Álvaro
 *
 */
public interface EngineInterface {
	
	public Prediction predict(String RuleBasePath,
			List<Alarm> alarms);

}
