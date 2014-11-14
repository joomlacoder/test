package ru.ignatevandrej.lvl_3.work_001;

public class Staff extends Person {
	public int Number;
	public double Salary;
	
	public Staff(String name, int age, int Number, double Salary){
		super(name, age);
		System.out.println("Staff");
		this.Number = Number;
		this.Salary = Salary;
	}
	
	@Override
	public String toString() {
		return String.format("%d - %g %s", this.Number, this.Salary, super.toString());
	}
	
	/*@Override
	public void show() {
		System.out.println(this.toString());
	} */
}
