package ru.ignatevandrej.lvl_2.work_008;

public class Main {
	public static void main(String[] args) {
		for(int строка = 1; строка <= 10; строка++ ){
			for(int столбец = 1; столбец <= 10; столбец++)
				System.out.printf("%4d", столбец*строка);
			System.out.println();
		}
	}
}
