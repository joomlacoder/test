package ru.ignatevandrej.lvl_2.work_005;

import static java.lang.System.out;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader
				(new InputStreamReader(System.in));
		
		switch(Integer.parseInt((reader.readLine()))){
			case 1: 
				out.println("Один");
				break;
			case 2:
				out.println("Два");
				break;
			default:
				out.println("Не один и не два");
		}
	}
}
