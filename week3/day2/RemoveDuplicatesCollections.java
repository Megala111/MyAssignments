package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesCollections {

	public static void main(String[] args) {
		 String text="We learn java basics as part of java sessions in java week1 ";
		 String string=null;
		 String[] split=text.split(" ");
		 List<String> list1=new ArrayList<String>(Arrays.asList(split));
		 Set<String> set1=new LinkedHashSet<String>(list1);
		 System.out.println(set1);
	}

}
