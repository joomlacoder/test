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
			
			long p = 200L;
			System.out.print("long" + p);
			int ����� = 67;
			int x2 = 0x1f; //15*16^0+1+16^1 = 31
			short g = 32000;
			float y = 2.7f;
			double z = 1.5;
			byte b = 100;
			char l = 'a';  
			System.out.printf("\nint %d int %d float %f"
					+ " double %g byte %d char %c"
					+ " short %d \n",�����, x2, y, z, b, l, g);
			����� = 78;
			int �������� = 2;
			System.out.println("�����: " + �����);

			����� = (1+2)*3-7/2%2;
			System.out.println("\n���������: " + �����);
			����� = �����*2;
			System.out.println("x2 " + x2 + " ����� " + �����);
			System.out.println("i *= 2 " + (����� *= 2));
			System.out.println("i -= 3 " + (����� -= 3));
			System.out.println(�����++ + " i++ " + �����);
			System.out.println(�����-- + " i-- " + �����);
			System.out.println(++����� + " ++i " + �����);
			System.out.println(--����� + " --i " + �����);
			
			����� = �������� = 7;
			System.out.println("\n" + ����� + " " + ��������);
	
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
			System.out.println("����: " + ee);
			System.out.println("�����������: " + (ee^ww));
			
			System.out.println("\n" + qq + " ����� " + ww);
			qq = qq^ww;
			ww = ww^qq;
			qq = qq^ww;
			System.out.println(qq + " ����� " + ww);
			
			b3 = 5 == 3;
			b3 = 5 != 3;
			b3 = 5 > 3;
			b3 = 5 >= 3;
			b3 = 5 < 3;
			b3 = 5 <= 3;
			
			String s1 = "C:\\\\WINDOWS ";
			String s2 = "\"������\u0021\"";
			System.out.println("\n" + s1 + s2);
			System.out.println(String.format("%s%s",s1,s2));
			StringBuilder sb = new StringBuilder();
			sb.append("hello");
			sb.append(" ");
			sb.append("user");
			System.out.println(sb.toString());
	}
}
