package student_pojo;

public class Student implements Comparable<Student> {
	int id;
	String name;
	String city;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public int compareTo(Student that) {
		
		return this.name.compareTo(that.name);
	}
	public void finalize() {
		id=0;
		name=null;
		city=null;
	}
	
}
