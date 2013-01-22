package es.upm.dit.gsi.trainmining.test;


import java.util.ArrayList;

import org.junit.Test;

import es.upm.dit.gsi.trainmining.engine.Engine;
import es.upm.dit.gsi.trainmining.model.Alarm;
import es.upm.dit.gsi.trainmining.model.Prediction;

public class TestInvalidAlarms {

	@Test
	public void testAntequeraInvalidAlarms() throws Exception {
		Engine e = new Engine();
		ArrayList<Alarm> alarms = new ArrayList<Alarm>();
		alarms.add(new Alarm(3,"NonExistingAlarm"));
		Prediction p = e.predict("antequera1d.drl", alarms);
		System.out.println("Prediction time: "+(p.getFinalTimestamp()-p.getInitialTimestamp()));
	}
	@Test
	public void testAlbaceteInvalidAlarms() throws Exception {
		Engine e = new Engine();
		ArrayList<Alarm> alarms = new ArrayList<Alarm>();
		alarms.add(new Alarm(3,"NonExistingAlarm"));
		Prediction p = e.predict("albacete1d.drl", alarms);
		System.out.println("Prediction time: "+(p.getFinalTimestamp()-p.getInitialTimestamp()));
		p = e.predict("albacete7d.drl", alarms);
		System.out.println("Prediction time: "+(p.getFinalTimestamp()-p.getInitialTimestamp()));
	}
	@Test
	public void testSegoviaInvalidAlarms() throws Exception {
		Engine e = new Engine();
		ArrayList<Alarm> alarms = new ArrayList<Alarm>();
		alarms.add(new Alarm(3,"NonExistingAlarm"));
		Prediction p = e.predict("segovia1d.drl", alarms);
		System.out.println("Prediction time: "+(p.getFinalTimestamp()-p.getInitialTimestamp()));
		p = e.predict("segovia7d.drl", alarms);
		System.out.println("Prediction time: "+(p.getFinalTimestamp()-p.getInitialTimestamp()));
	}

}
