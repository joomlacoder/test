package ru.ignatevandrej.lvl_1.work_005DZ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		int a, b, c;
		double d;
		BufferedReader reader = new BufferedReader
				(new InputStreamReader(System.in));
		a = Integer.parseInt(reader.readLine());
		b = Integer.parseInt(reader.readLine());
		c = Integer.parseInt(reader.readLine());
		d = Math.sqrt(b*b-4*a*c);
		System.out.println((-b+d)/(2*a));
		System.out.println((-b-d)/(2*a));
	}
}
