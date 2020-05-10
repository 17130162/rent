package com.group.rent;

/**
 * Импортирование класса, содержащего набор методов сравнения
 */
import static org.junit.Assert.*;

public class STest5 {

	@org.junit.Test
	public void test() {
		/**
		 * Входными данными является метод, производящий создание лейбла на панели,
		 * а также данные лейбла
		 */
		Authorization_Panel frame = new Authorization_Panel();
		String a[] =  { "Название" };
		int b[] =  { 10, 10, 10, 10 };
		frame.auth_labels_add( 1, a, b, frame.getPanel());
		/**
		 * Сравнение результата и ожидаемого значения
		 */
		assertEquals(frame.auth_labels[0].getText(), "Название");
	}
}
