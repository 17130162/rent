package com.group.rent;

/**
 * Импортирование класса, содержащего набор методов сравнения
 */
import static org.junit.Assert.*;
import com.group.rent.Authorization_Panel;
public class STest2 {

	@org.junit.Test
	public void test() {
		/**
		 * Входными данными является метод, производящий аутентификацию пользователя,
		 * а также данные пользователя
		 */
		Authorization_Panel panel = new Authorization_Panel();
		/**
		 * Сравнение результата и ожидаемого значения
		 */
		assertEquals(panel.auth("Эльвина", "123"), 1);
	}
}
