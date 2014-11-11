package ru.ignatevandrej.lvl_2.work_015;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader
				(new InputStreamReader(System.in));
		ArrayList<String> list = new ArrayList<String>();
		String name;
		do{
			name = reader.readLine();
			if(!name.isEmpty())
				list.add(name);
		}while(!name.isEmpty());

		for(int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));
		Object[] m = list.toArray();
		Arrays.sort(m);
		
		List listSorted = Arrays.asList(m);
		for(Object nm: listSorted)
			System.out.println(nm);
	}
}
