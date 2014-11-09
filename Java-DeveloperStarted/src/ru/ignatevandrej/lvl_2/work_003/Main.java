package ru.ignatevandrej.lvl_2.work_003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.out;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader
				(new InputStreamReader(System.in));
		out.print("Введите а, б , с: ");
		double a = Double.parseDouble(reader.readLine());
		double b = Double.parseDouble(reader.readLine());
		double c = Double.parseDouble(reader.readLine());
		
		double d = Math.pow(b, 2) - 4*a*c;
		
		if(d < 0)
			out.println("Нет корней");
		else
			if (d == 0){
				double x = -b/2*a;
				out.printf("Единственный корень х = %п", x);
			}else{
				double ds = Math.sqrt(d);
				double x1 = (-b+ds)/(2*a);
				double x2 = (-b+ds)/(2*a);
				out.printf("x1 = %g\nx2 = %g\n", x1,x2);
			}
				
	}
}
