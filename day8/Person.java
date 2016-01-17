public class Person {
	private String name;
	private int age;
	private Person nextPerson;
	
	public Person(String name, int age){
		this.name = name;
		this.age = age;
		
	}
	
	public String getName(){
		return this.name;
	}
	public void setName(String new_name){
		this.name = new_name;
	}
	
	public int getAge(){
		return this.age;
	}
	public void setAge(int new_age){
		this.age = new_age;
	}
	
	public Person getNextPerson(){
		return this.nextPerson;
	}
	public void setNextPerson(Person new_nextPerson){
		this.nextPerson = new_nextPerson;
	}
	

	
}
