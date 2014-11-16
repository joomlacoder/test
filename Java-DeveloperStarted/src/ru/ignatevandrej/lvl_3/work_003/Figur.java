package ru.ignatevandrej.lvl_3.work_003;

import java.util.ArrayList;

public class Figur {
	private static ArrayList<Figur> listAll = new ArrayList<Figur>();
	
	public void Drow(){
		System.out.println("Фигура нарисована");
	}
	
	public Figur(){
		listAll.add(this);
	}
	
	public static void drawScene(){
		for (Figur f : listAll)
			f.Drow();
	}
}
