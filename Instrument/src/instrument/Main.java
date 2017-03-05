//+Створити клас Main в якому створити два об"єкта гравців Bob i Steve,
//Об"єкт Bob зможе грати на будь-якому інструменті,
//а об"єкт Stevе буде грати на всіх оголошених інструментах одразу,
//тобто організувати метод perfomance для кожного гравця таким чином, щоб виконувалась дана умова
package instrument;

public class Main {

	public static void main(String[] args) {

		Bob bob =  new Bob(new Sax());
		bob.performance();
		System.out.println();
		Steve steve = new Steve(new Sax(), new Guitar(), new Drums());
		steve.performance();
	}
}
