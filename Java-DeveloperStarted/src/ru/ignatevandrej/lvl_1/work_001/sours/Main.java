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
			
			long p = 200L;
			System.out.print("long" + p);
			int число = 67;
			int x2 = 0x1f; //15*16^0+1+16^1 = 31
			short g = 32000;
			float y = 2.7f;
			double z = 1.5;
			byte b = 100;
			char l = 'a';  
			System.out.printf("\nint %d int %d float %f"
					+ " double %g byte %d char %c"
					+ " short %d \n",число, x2, y, z, b, l, g);
			число = 78;
			int числоДва = 2;
			System.out.println("Число: " + число);

			число = (1+2)*3-7/2%2;
			System.out.println("\nРезультат: " + число);
			число = число*2;
			System.out.println("x2 " + x2 + " число " + число);
			System.out.println("i *= 2 " + (число *= 2));
			System.out.println("i -= 3 " + (число -= 3));
			System.out.println(число++ + " i++ " + число);
			System.out.println(число-- + " i-- " + число);
			System.out.println(++число + " ++i " + число);
			System.out.println(--число + " --i " + число);
			
			число = числоДва = 7;
			System.out.println("\n" + число + " " + числоДва);
	
			boolean b1 = true;
			boolean b2 = false;
			boolean b3;
			//and
			b3 = b1 && b2;
			System.out.println("\nand " + b3);
			//or
			b3 = b1 || b2;
			System.out.println("\nor " + b3);
			//no
			b3 = !b1;
			System.out.println("\nno " + b3);
			//xor
			b3 = b1^b2;
			System.out.println("\nxor " + b3);
			
			int qq = 5;
			int ww = 7;
			int ee = qq ^ ww;
			System.out.println("Шифр: " + ee);
			System.out.println("Расшифровка: " + (ee^ww));
			
			System.out.println("\n" + qq + " старт " + ww);
			qq = qq^ww;
			ww = ww^qq;
			qq = qq^ww;
			System.out.println(qq + " обмен " + ww);
			
			b3 = 5 == 3;
			b3 = 5 != 3;
			b3 = 5 > 3;
			b3 = 5 >= 3;
			b3 = 5 < 3;
			b3 = 5 <= 3;
			
			String s1 = "C:\\\\WINDOWS ";
			String s2 = "\"Привет\u0021\"";
			System.out.println("\n" + s1 + s2);
			System.out.println(String.format("%s%s",s1,s2));
			StringBuilder sb = new StringBuilder();
			sb.append("hello");
			sb.append(" ");
			sb.append("user");
			System.out.println(sb.toString());
	}
}
