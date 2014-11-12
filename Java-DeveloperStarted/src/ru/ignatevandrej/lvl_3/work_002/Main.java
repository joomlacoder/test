package ru.ignatevandrej.lvl_3.work_002;

import ru.ignatevandrej.lvl_3.work_001.*;
import static java.lang.System.out;

public class Main {
	public static void main(String[] args) {
		Person p = new Person("Name", 33);
		Person p2 = p;
		p2.Age = 4;
		p.show();
		Test t1 = new Test();
		t1.IncrementAge(p);
		p.show();
		int x = 10, y = 20;
		out.printf("a = %g\n", t1.average(x, y));
		out.printf("x = %d\ny = %d\n", x, y );
		
		AverageParams pp = new AverageParams(x, y);
		double r = t1.aberageOut(pp);
		x = pp.a;
		y = pp.b;
		out.printf("a = %g\n", r);
		out.printf("x = %d\ny = %d\n", x, y );
		Person p3 = new Person();
		p3.show();
		Person.showTotal();
	}
}
