package ru.ignatevandrej.lvl_2.work_012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Game {
	public static void main(String[] args)throws NumberFormatException, IOException{
		Random r = new Random();
		int x = r.nextInt(100)+1;
		BufferedReader reader = new BufferedReader
				(new InputStreamReader(System.in));
		int y, counter = 0;
		
		do{
			System.out.printf("������ �����(1-100 �� %d �������): "
					, 7-counter);
			counter++;
			y = Integer.parseInt
					(reader.readLine());
			if(y<x)
				System.out.println("����� ������");
			if(y>x)
				System.out.println("������ ������");
			if((y == 0) || (counter > 6))
				break;
		}while(y != x);
		
		if(y == x)
			System.out.printf("�� ��������. ����� ������� %d"
					, counter);
		else
			System.out.println("�� ���������. �����: " + x);
	}
}
	
