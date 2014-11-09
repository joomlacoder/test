package ru.ignatevandrej.lvl_2.work_010;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader
				(new InputStreamReader(System.in));
		String name = "";
		do{
			System.out.print("Введите ваше имя: ");
			name = reader.readLine();
		}while(name.isEmpty());
		
		System.out.println(String.format("Привет, %s!", name));
	}
}
