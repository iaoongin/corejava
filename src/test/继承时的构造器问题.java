package test;

public class 继承时的构造器问题 {

	public static void main(String[] args) {
		new CJC("af");
	}
	
}

class AJC{
	public AJC(String name) {
		System.out.println("AJC");
	}
}

class BJC extends AJC{

	//父类没有无参构造器时，需要手动调用有参构造器
	public BJC() {
		super("");
	}
	
	public BJC(String name) {
		super(name);
		System.out.println("BJC");
	}
	
}

class CJC extends BJC{

	public CJC(String name) {
		super(name);
		System.out.println("CJC");
	}
	
}