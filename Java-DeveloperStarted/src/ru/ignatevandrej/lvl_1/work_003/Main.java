package ru.ignatevandrej.lvl_1.work_003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.out;
public class Main {

	public static void main(String[] args)
			throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader
				(new InputStreamReader(System.in));
		out.print("T(f) = ");
		out.print("T(c) " + ((Double.parseDouble
				(reader.readLine())-32.0)*5.0/9.0));
	}
}
