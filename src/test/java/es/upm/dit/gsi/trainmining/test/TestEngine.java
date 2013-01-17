package es.upm.dit.gsi.trainmining.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import es.upm.dit.gsi.trainmining.engine.Engine;
import es.upm.dit.gsi.trainmining.model.Alarm;
import es.upm.dit.gsi.trainmining.model.PossibleEvent;
import es.upm.dit.gsi.trainmining.model.Prediction;

public class TestEngine {

	@Test
	public void test() {
		Engine e = new Engine();
		ArrayList<Alarm> alarms = new ArrayList<Alarm>();
		alarms.add(new Alarm(3,"eventA"));
		alarms.add(new Alarm(3,"eventB"));
		Prediction pred = e.predict("simple_test.drl", alarms);
		List<PossibleEvent> possibev = pred.getPrediction();
		PossibleEvent vp = new PossibleEvent("eventC", "alarmtype", 3, 0.5);
		PossibleEvent nvp = new PossibleEvent("eventF", "alarmtype", 3, 0.5);
		assertTrue(possibev.contains(vp));
		assertFalse(possibev.contains(nvp));
	}
	
	@Test
	public void testAlarmCompare() {
		Alarm a = new Alarm(1,"eventA");
		Alarm b = new Alarm(1,"eventA");
		assertEquals(a,b);
	}

}
