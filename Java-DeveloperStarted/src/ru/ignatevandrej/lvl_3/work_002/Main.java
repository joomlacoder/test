package ru.ignatevandrej.lvl_3.work_002;

import ru.ignatevandrej.lvl_3.work_001.*;
import static java.lang.System.out;

public class Main {
	public static void main(String[] args) {
		Person p = new Person();
		p.Name = "Name";
		p.Age = 19;
		out.printf("%s - %d", p.Name, p.Age);
		
		
	}
}
