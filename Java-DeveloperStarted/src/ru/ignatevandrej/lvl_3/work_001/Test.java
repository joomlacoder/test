package ru.ignatevandrej.lvl_3.work_001;

public class Test {
	
	public void IncrementAge(Person p){
		p.Age++;
	}
	
	public double aberageOut(AverageParams p){
		p.a *= 10;
		p.b *= 10;
		System.out.printf("a = %d\nb = %d\n", p.a, p.b);
		return (p.a + p.b)/2D;
	}
	
	public double average(int a, int b){
		a++;
		b++;
		System.out.printf("a = %d\nb = %d\n", a, b);
		return (a + b)/2D;
	}
}
