package com.group.rent;

/**
 * Импортирование класса, содержащего набор методов сравнения
 */
import static org.junit.Assert.*;
import com.group.rent.Accountant_Panel;
public class STest4 {

	@org.junit.Test
	public void test() {
		/**
		 * Входными данными является метод, производящий очистку текстовых полей,
		 * а также поле, заполненное данными
		 */
		Accountant_Panel panel = new Accountant_Panel();
		panel.accountant_textfields[5].setText("текст");
		panel.clearTextfields();
		/**
		 * Сравнение результата и ожидаемого значения
		 */
		System.out.println(panel.accountant_textfields[5].getText());
		assertEquals(panel.accountant_textfields[5].getText(), "");
	}
}
