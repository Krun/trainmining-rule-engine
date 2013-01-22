package es.upm.dit.gsi.trainmining.test;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import es.upm.dit.gsi.trainmining.engine.Engine;
import es.upm.dit.gsi.trainmining.model.Alarm;
import es.upm.dit.gsi.trainmining.model.PossibleEvent;
import es.upm.dit.gsi.trainmining.model.Prediction;

public class TestExpectations {
	@Test
	public void testValidPrediction() throws Exception {
		Engine e = new Engine();
		ArrayList<Alarm> alarms = new ArrayList<Alarm>();
		alarms.add(new Alarm(3,"saml.status.energy_net1_not_present"));
		alarms.add(new Alarm(3,"saml.status.energy_net2_not_present"));
		alarms.add(new Alarm(3,"saml.status.energy_48V_battery_nok"));
		alarms.add(new Alarm(3,"saml.status.energy_SAI_PT_nok"));
		Prediction pred = e.predict("antequera1d.drl", alarms);
		
		PossibleEvent vp = new PossibleEvent("saml.status.energy_SAI_ST_nok", "fieldElementFailure", 3, 0.83833333);
		
		List<PossibleEvent> possibev = pred.getPrediction();
		assertTrue(possibev.contains(vp));
		
		System.out.println("Prediction time: " + (pred.getFinalTimestamp()-pred.getInitialTimestamp()));
	}
}
