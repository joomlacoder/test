package ru.ignatevandrej.lvl_3.work_003;

public class Dot extends Figur {
	int x,y;
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public Dot(Dot dot){
		this(dot.x, dot.y);
	}
	
	public Dot(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public Dot(){}
	
	@Override
	public void Drow() {
		System.out.println(this.toString());
	}
	
	@Override
	public String toString() {
		return "Dot: ("+x+","+y+")";
	}
}
