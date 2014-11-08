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
		
			System.out.println("Hello World");
			System.out.printf("Привет %s \n", "всем");
			BufferedReader reader = new BufferedReader
					(new InputStreamReader(System.in));
			System.out.print("Введите число ");
			int x = Integer.parseInt(reader.readLine());
			System.out.printf("Вы ввели число %d: \n", x);
			System.out.println("Вы ввели: " + reader.readLine());
			
			int число = 67;
			int x2 = 0x1f; //15*16^0+1+16^1 = 31
			short g = 32000;
			float y = 2.7f;
			double z = 1.5;
			byte b = 100;
			char l = 'a';  
			System.out.printf("int %d int %d float %f"
					+ " double %.10f byte %d char %c"
					+ " short %d \n",число, x2, y, z, b, l, g);
			число = 78;
			int числоДва = 2;
			System.out.println("Число: " + число);

			число = (1+2)*3-7/2%2;
			System.out.println("Результат: " + число);
			число = число*2;
			System.out.println("x2 " + x2 + " число " + число);
			System.out.println(число *= 2);
			System.out.println(число -= 3);
			System.out.println(число++ + " " + число);
			System.out.println(число-- + " " + число);
			System.out.println(++число + " " + число);
			System.out.println(--число + " " + число);
			
			число = числоДва = 7;
	}
}
