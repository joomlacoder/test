/**
 * YouTube / DeveloperStarted / ���������������� �� 
 * Java #1 - ��������  � java � java-����������
 * ������ 001
 */
package ru.ignatevandrej.lvl_1.work_001.sours;

import java.io.*;
/**
 * @author �������� ������
 * 08.11.2014 23:00
 */
public class Main {
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
			System.out.println("Hello World");
			System.out.printf("������ %s \n", "����");
			BufferedReader reader = new BufferedReader
					(new InputStreamReader(System.in));
			System.out.print("������� ����� ");
			int x = Integer.parseInt(reader.readLine());
			System.out.printf("�� ����� ����� %d: \n", x);
			System.out.println("�� �����: " + reader.readLine());
			
			int ����� = 67;
			int x2 = 0x1f; //15*16^0+1+16^1 = 31
			short g = 32000;
			float y = 2.7f;
			double z = 1.5;
			byte b = 100;
			char l = 'a';  
			System.out.printf("int %d int %d float %f"
					+ " double %.10f byte %d char %c"
					+ " short %d \n",�����, x2, y, z, b, l, g);
			����� = 78;
			int �������� = 2;
			System.out.println("�����: " + �����);

			����� = (1+2)*3-7/2%2;
			System.out.println("���������: " + �����);
			����� = �����*2;
			System.out.println("x2 " + x2 + " ����� " + �����);
			System.out.println(����� *= 2);
			System.out.println(����� -= 3);
			System.out.println(�����++ + " " + �����);
			System.out.println(�����-- + " " + �����);
			System.out.println(++����� + " " + �����);
			System.out.println(--����� + " " + �����);
			
			����� = �������� = 7;
	}
}
