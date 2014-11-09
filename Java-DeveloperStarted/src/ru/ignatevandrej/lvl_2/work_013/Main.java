package ru.ignatevandrej.lvl_2.work_013;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader
				(new InputStreamReader(System.in));
		String s = "hi";
		System.out.println(s.toUpperCase());
		System.out.println(s + "\n");
		
		String s1 = "hello";
		String s2 = reader.readLine();
		if(s1 == s2)
			System.out.println("равны");
		else
			System.out.println("не равны");
		if(s1.equals(s2))
			System.out.println("равны");
		else
			System.out.println("не равны");
	}
}
