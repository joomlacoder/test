package ru.ignatevandrej.lvl_2.work_002;

import static java.lang.System.out;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader
				(new InputStreamReader(System.in));
		out.print("Введи свое имя: ");
		String name = reader.readLine();
		if(name.isEmpty())
			name = "незнакомец";
		out.print("Привет " + name + "!");
	}
}
