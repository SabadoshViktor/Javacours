package telran.musician.controller;

import telran.musician.dao.Orchestra;
import telran.musician.data.*;

public class MusicianApp {

	public static void main(String[] args) {
		
	Kind Wind = new Kind("Wind");
	Kind String = new Kind("String");
		
	MusicInstrument trumpet = new MusicInstrument("Trumpet", Wind);
	MusicInstrument clarinet = new MusicInstrument("Clarinet", Wind);
	MusicInstrument trombone = new MusicInstrument("Trombone", Wind);
	MusicInstrument tuba = new MusicInstrument("Tuba", Wind);
	
	
	MusicInstrument cello = new MusicInstrument("cello", String);
	MusicInstrument violin = new MusicInstrument("Violin", String);
	MusicInstrument doubleBass = new MusicInstrument("Double bass", String);
	MusicInstrument viola =new MusicInstrument("Alto", String);
	
	WindMusician wm1 = new WindMusician("Sasha", "Petrov", 25, trumpet, 5);
	WindMusician wm2 = new WindMusician("Villi", "Varga", 24, clarinet, 3);
	WindMusician wm3 = new WindMusician("Vitya", "Kovach", 23, trombone, 2);
	WindMusician wm4 = new WindMusician("Yura", "Bokotey", 28, tuba, 10);
	WindMusician wm5 = new WindMusician("Sab", "Vik", 24, trumpet, 20);
	
	StringMusician sm1 = new StringMusician("Lesya", "Petrivna", 35, viola, 5);
	StringMusician sm2 = new StringMusician("David", "Lokotosh", 26, doubleBass, 4);
	StringMusician sm3 = new StringMusician("Mary", "Yasinska", 23, cello, 5);
	StringMusician sm4 = new StringMusician("Vasya", "Donec", 29, violin, 12);
	
	Orchestra or1 = new Orchestra(8);
	or1.addMusician(wm1);
	or1.addMusician(wm2);
	or1.addMusician(wm3);
	or1.addMusician(wm4);
	or1.addMusician(sm1);
	or1.addMusician(sm2);
	or1.addMusician(sm3);
	or1.addMusician(sm4);
	
	or1.display();
	
	}

}
