package ru.ignatevandrej.lvl_2.work_01;

import static java.lang.System.out;

public class Main {
	public static void main(String[] args) {
		int a = 5;
		if (a > 0){
			out.print("a больше нуля");
			out.print(" true");
		}else{
			out.print("a меньше нуля");
			out.print(" false");
		}
		
		if  ((a >= 0) && (a <= 10))
			out.println("\na from [0;10]");
		else
			out.println("\na nofrom [0;10]");
		
		out.println(((a >= 0) && (a <= 10)?
				"Правильно":"Не правильно"));
	}
}
