package ru.ignatevandrej.lvl_3.work_001;

public class Person {
		public String Name;
		public int Age;
		
		public void show(){
			System.out.printf("%s - %d\n", Name, Age);
		}
		
		public Person(String Name, int Age){
			this.Name = Name;
			this.Age = Age;
		}
}
