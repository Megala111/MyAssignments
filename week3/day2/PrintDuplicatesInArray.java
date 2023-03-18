package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		List list = new ArrayList<Integer>();
		list.add(14);
		list.add(12);
		list.add(13);
		list.add(11);
		list.add(15);
		list.add(14);
		list.add(18);
		list.add(16);
		list.add(17);
		list.add(19);
		list.add(18);
		list.add(17);
		list.add(20);
		Collections.sort(list);
		System.out.println(list);
		for (int i = 0;i<list.size();i++) {
			for (int j = 0;j <i;j++) {
				if(list.get(i).equals(list.get(j)))
				{
					System.out.println(list.get(j));
				}
				
				
			}
			
			
			
			
			
		}
	}

}
