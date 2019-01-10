//Написать метод для конвертации массива строк/чисел в список.

package Mission;

import java.util.ArrayList;

public class MissionRun {

	static Integer[] optim = new Integer[11];
	static ArrayList crane = new ArrayList();

	public static void main(String[] args) {

		for (int i = 0; i < optim.length; i++) {
			optim[i] = i;
			crane.add(optim[i]);
		}

		for (int j = 0; j < crane.size(); j++) {
			System.out.println("Результат конвертации: " + crane.get(j) + " ;");
		}
	}

}