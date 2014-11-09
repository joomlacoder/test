package ru.ignatevandrej.lvl_1.work_002;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.out;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader
				(new InputStreamReader(System.in));
		out.print("Введите число а ");
		int x = Integer.parseInt(reader.readLine());
		out.print("Введите число b ");
		int y = Integer.parseInt(reader.readLine());
		out.print("Резултат: " + (x+y)/2.0);
	}
}
