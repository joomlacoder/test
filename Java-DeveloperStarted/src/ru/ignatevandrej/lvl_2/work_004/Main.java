package ru.ignatevandrej.lvl_2.work_004;

import static java.lang.System.out;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader
				(new InputStreamReader(System.in));
		out.print("Введите число ворон: ");
		int n =	Integer.parseInt(reader.readLine());
		String v = "";
		int n1 = n%10;
		int n2 = n%100;
		
		if(n1 == 1)
			v = "ворона";
		if ((n1>=2)&&(n1<=4))
			v = "вороны";
		if(((n1 >=5)&&(n1<=9))||(n1 == 0)
				||(n2 >= 11)||(n2<=14))
			v = "ворон";
		out.printf("На ветке %d %s",n,v);
	}
}
