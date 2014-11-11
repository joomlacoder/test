package ru.ignatevandrej.lvl_2.work_014;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	public static void main(String[] args){
		//int[] m = new int[3];
		//m[0] = 7;
		//m[1] = 8;
		//m[2] = 3;
		int[] m = {5, 10, 3, 6};
		String[] names = {"Сергей", "Константин", "Алексаедр",
				"Володя"};
		int[][] matrix = {
				{1, 2, 3, 4},
				{5, 6, 7},
				{8, 9},
				{10},
			};	
		
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[i].length; j++)
				System.out.printf("%3d", matrix[i][j]);
			System.out.println();
		}
		for(int i = 0; i < m.length; i++){
			m[i] *= 2;
			System.out.println(m[i]);
		}
		Arrays.sort(names);
		for(int i = 0; i < m.length; i++){
			System.out.println(names[i]);
		}
		System.out.println();
		String[] names2 = Arrays.copyOfRange(names, 1, names.length);
		for(String s: names2)
			System.out.println(s);
		System.out.println();
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		for(Integer o: list)
			System.out.println(o);
	}
}
