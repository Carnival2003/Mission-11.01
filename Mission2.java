//Написать класс, который умеет хранить в себе массив любых типов данных (int, long etc.).

/* Выводит:
Номера машины:[Ljava.lang.String;@3b192d32
Номера машины:[Ljava.lang.String;@3b192d32
Номера машины:[Ljava.lang.String;@3b192d32
Номера модели:[Ljava.lang.Integer;@16f65612
Номера модели:[Ljava.lang.Integer;@16f65612
Номера модели:[Ljava.lang.Integer;@16f65612

Не могу понять в чем проблема
*/




package Mission;

import java.util.ArrayList;

public class Mission {

	ArrayList<Object> man = new ArrayList<Object>();

	Mission(Object[] tgx) {
		for (int i = 0; i < tgx.length; i++) {
			man.add(tgx);
		}
	}

	public Object getMan(int j) {
		return man.get(j);
	}
}


package Mission;

public class MissionRun {

	public static void main(String[] args) {
		String[] car = { "BMW 1", "BMW 3", "BMW 5" };
		Integer[] model = { 116, 320, 530 };

		Mission masString = new Mission(car);
		Mission masInt = new Mission(model);

		for (int i = 0; i < car.length; i++) {
			System.out.println("Номера машины:" + masString.getMan(i));
		}

		for (int i = 0; i < model.length; i++) {
			System.out.println("Номера модели:" + masInt.getMan(i));
		}
	}

}
