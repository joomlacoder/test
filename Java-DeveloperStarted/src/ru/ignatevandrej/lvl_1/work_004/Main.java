package ru.ignatevandrej.lvl_1.work_004;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader
				(new InputStreamReader(System.in));
		System.out.println("Введите ваше имя");
		String name = reader.readLine();
		StringBuffer sb = new StringBuffer();
		sb.append("Привет, ");
		sb.append(name);
		sb.append('!');
		System.out.println(sb.toString());
	}
}
