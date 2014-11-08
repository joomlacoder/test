/**
 * YouTube / DeveloperStarted / Программирование на 
 * Java #1 - введение  в java и java-техгологии
 * Пример 001
 */
package ru.ignatevandrej.lvl_1.work_001.sours;

import java.io.*;
/**
 * @author Игнатьев Андрей
 * 08.11.2014 23:00
 */
public class Main {
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			System.out.println("Hello World");
			System.out.printf("Привет %s \n", "всем");
			BufferedReader Reader = new BufferedReader
					(new InputStreamReader(System.in));
			System.out.println("Вы ввели: " + Reader.readLine());
	}
}
