package week3.day1;

public class Students {
public void getStudentInfo(int id)
{
	System.out.println(id);
}
public void getStudentInfo(int id,String name)
{
	System.out.println(id+""+name);
}
public void getStudentInfo(String email,long phonenumber)
{
	System.out.println(email+" "+phonenumber);
}
public static void main(String[] args) {
	Students stu=new Students();
	stu.getStudentInfo(111);
	stu.getStudentInfo(111, "MEGALA");
	stu.getStudentInfo("megalabca111@gmail.com", 7845503206L);
}
}
