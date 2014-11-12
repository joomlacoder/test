package ru.ignatevandrej.lvl_3.work_001;

import static java.lang.System.out;

import java.io.*; 

public class Person {
	
		public String Name;
		public int Age;
		public static long Totals; 
		
		public void show(){
			this.show(System.out);
		}
		
		public void show(PrintStream s){
			s.printf("%s - %d\n", this.Name, Age);
		}
		
		public Person(){
			this("Dedoalt", 0);
		}

		public Person(String Name, int Age){
			this.Name = Name;
			this.Age = Age;
			Totals++;
		}
		
		public static void showTotal(){
			out.println("Totals person: " + Totals);
		}
}	