//+�������� ���� Main � ����� �������� ��� ��"���� ������� Bob i Steve,
//��"��� Bob ����� ����� �� ����-����� ����������,
//� ��"��� Stev� ���� ����� �� ��� ���������� ������������ ������,
//����� ����������� ����� perfomance ��� ������� ������ ����� �����, ��� ������������ ���� �����
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
