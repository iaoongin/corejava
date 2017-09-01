package corejava.day18_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ObjectIOStreamTest {

	public static void main(String[] args) throws Exception{
		
		String file = "C:\\Users\\XHX\\Desktop\\stu.txt";
		
		writeObj(file);
		
		readObj(file);
	}
	
	public static void writeObj(String file) throws Exception{
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
		
		List<Student> list = new ArrayList<>();
		
		for(int i = 0;i<10;i++) {
			list.add(new Student(i, 20, "tom"));
		}
		
		oos.writeObject(list);
		
//		oos.writeObject("abc");
		
		oos.close();
		
	}
	
	public static void readObj(String file) throws Exception {
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
		
		List<Student> list = (ArrayList<Student>)ois.readObject();
		
		for (Student student : list) {
			System.out.println(student);
		}
		
		System.out.println(ois.readObject());
		
		ois.close();
		
	}
}

class Student implements Serializable{
	
	private static final long serialVersionUID = -3571838458914412553L;
	
	//transient		临时存取
	private transient int id;
	private int age;
	private String name;
	
	public Student(int id, int age, String name) {
		this.id = id;
		this.age = age;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", age=" + age + ", name=" + name + "]";
	}
}