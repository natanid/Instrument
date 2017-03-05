//+Створити 3 класи Sax, Guitar, Drums, які будуть реалізовувати інтерфейс Instrument, а отже перевизначати метод play(). 
package instrument;

public class Sax implements Instrument{

	@Override
	public void play() {
		System.out.println("Sax play");
		
	}

}
