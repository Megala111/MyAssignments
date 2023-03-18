package week3.day1;

public class Automation extends MultipleLanguage implements Language,TestTool {

	public static void main(String[] args) {
		Automation lang=new Automation();
		lang.Java();
		lang.Selenium();
		lang.python();
		lang.ruby();
		
	}

	public void Selenium() {
		System.out.println("Selenium");
		
	}

	public void Java() {
		System.out.println("Java");
		
	}

	@Override
	public void ruby() {
		System.out.println("Ruby");
		
	}

}
