public class Supermarket {	

	private PersonQueueImplementation till;

	public void addPerson(Person person){	
		this.till.insert(person);
	}
	
	public Person servePerson(){
		return this.till.retrieve();
	}
	
	public void checkQueue(){
		this.till.lookAtQueue();
	}
	
	public void launch(){
		Person p1 = new Person("customer000", 23);
		this.till = new PersonQueueImplementation(p1);
	
		for(int i=1; i<=10; i++){
			Person p = new Person("customer" + i, i);
			this.addPerson(p);
			
		}
	
		this.checkQueue();
		Person p2 = this.servePerson();
		this.checkQueue();
		
	}
	

	
	public static void main(String[] args){
		
		Supermarket sm = new Supermarket();
		sm.launchPrioritisedQueue();
		
	
	}
}