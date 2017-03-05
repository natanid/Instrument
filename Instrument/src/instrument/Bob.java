//Створити 2 класи Bob i Steve, вони будуть грати на інструментах. 
//Зв"язати їх з (інтерфейс або клас або абстрактний клас(вибір за вами)) Instrumentalist.
package instrument;

public class Bob implements Instrumentalist {

	private Instrument instrument;

	public Bob(Instrument instrument) {
		super();
		this.instrument = instrument;
	}

	public Instrument getInstrument() {
		return instrument;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

	@Override
	public void performance() {
		System.out.println("Bob perform: ");
		instrument.play();
	}

}
