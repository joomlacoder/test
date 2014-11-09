package ru.ignatevandrej.lvl_2.work_011;

public class Main {

	public static void main(String[] args) {
		int n1 = 0, n2 = 1, n = n1+n2;
		while (n < 1000){
			System.out.printf("%d ", n);
			n1 = n2;
			n2 = n;
			n = n1+n2;
		}
	}
}
