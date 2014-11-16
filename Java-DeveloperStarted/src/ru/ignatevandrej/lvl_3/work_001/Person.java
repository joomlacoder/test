package ru.ignatevandrej.lvl_3.work_001;

import static java.lang.System.out;

import java.io.*; 

public class Person {
	
		private String Name;
		public int Age;
		private static long Totals; 
		
		public static long getTotas(){
			return Totals;
		}
		public String getName(){
			return Name;
		}
		
		protected void setName(String name){
			this.Name = name.toUpperCase();
		}
		
		public void show(){
			this.show(System.out);
		}
		
		public void show(PrintStream s){
			s.println(this.toString());
		}
		
		@Override
		public String toString() {
			return String.format("%s - %d", this.Name, Age);
		}
		
		public Person(){
			System.out.println("Person ()");
			Totals++;
		}

		public Person(String Name, int Age){
			this();
			System.out.println("Person(name, age)");
			this.Name = Name;
			this.Age = Age;
		}
		
		public static void showTotal(){
			out.println("Totals person: " + Totals);
		}
}	