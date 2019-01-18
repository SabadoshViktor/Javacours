package telran.musician.dao;
import telran.musician.data.*;
public class Orchestra {
	
	private Musician[] musicians;
	private int OrchestraSize;
	
	public Orchestra(int capacity) {
		musicians = new Musician[capacity];
		OrchestraSize = 0;
	}

	public int getOrchestraSize() {
		return OrchestraSize;
	}
	
	public boolean addMusician(Musician musician) {
		if(OrchestraSize<musicians.length) {
			musicians[OrchestraSize]=musician;
			OrchestraSize++;
			return true;
		}
		return false;
	}
	
	public boolean removeMusician(Musician musician) {
		for (int i = 0; i < OrchestraSize; i++) {
			if(musicians[i].equals(musician)) {
				musicians[i]=musicians[OrchestraSize-1];
				OrchestraSize--;
				return true;
			}
		}
		return false;
	}
	
	public int searchMusician(Musician musician) {
		for (int i = 0; i < OrchestraSize; i++) {
			if(musicians[i].equals(musician)) {
				return i;
			}
		}
		return -1;
	}
	
	public void display() {
		for (int i = 0; i < musicians.length; i++) {
			System.out.println(musicians[i]);
		}
	}
	
/*	public void purposePartita() {									//назначение конкретной партии для исполнении по количеству алкоголя
		for (int i = 0; i < OrchestraSize; i++) {
			if(musicians.)
		}
	}
*/

}
