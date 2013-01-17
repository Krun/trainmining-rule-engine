package es.upm.dit.gsi.trainmining;

import java.util.ArrayList;

import es.upm.dit.gsi.trainmining.engine.Engine;
import es.upm.dit.gsi.trainmining.model.Alarm;

public class TrainminingMain {
	public static void main(String[] args) {
		Engine e = new Engine();
		ArrayList<Alarm> alarms = new ArrayList<Alarm>();
		alarms.add(new Alarm(3,"eventA"));
		alarms.add(new Alarm(3,"eventB"));
		alarms.add(new Alarm(4,"eventA"));
		alarms.add(new Alarm(4,"eventB"));
		alarms.add(new Alarm(5,"eventB"));
		alarms.add(new Alarm(1,"eventD"));
		alarms.add(new Alarm(2,"eventE"));
		alarms.add(new Alarm(5,"eventD"));
		alarms.add(new Alarm(5,"eventE"));
		alarms.add(new Alarm(20,"eventE"));
		alarms.add(new Alarm(20,"eventD"));
		e.predict("Antequera1d.drl", alarms);
		
	}
}