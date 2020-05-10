package com.group.rent;

/**
 * Импортирование класса, содержащего набор методов сравнения
 */
import static org.junit.Assert.*;

public class STest3 {

	@org.junit.Test
	public void test() {
		/**
		 * Входными данными является метод, производящий закрытия окна
		 */
		Authorization_Panel panel = new Authorization_Panel();
		panel.start();
		panel.killFrame();
		/**
		 * Сравнение результата и ожидаемого значения
		 */
		assertEquals(panel.isVisible(), false);
	}
}
