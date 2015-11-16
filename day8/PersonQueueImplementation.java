public class PersonQueueImplementation implements PersonQueue {
	
	private Person queueStart;
	
	PersonQueueImplementation(Person person){
		this.queueStart = person;	
	}
	
	public Person getQueueStart(){
		return this.queueStart;
	}

	public void setQueueStart(Person person){
		this.queueStart = person;
	}
	
	public void insert(Person person){
		
		Person currentPerson = queueStart;

		while (currentPerson.getNextPerson() != null){
			currentPerson = currentPerson.getNextPerson();		
		}
		currentPerson.setNextPerson(person);
	}

	public Person retrieve(){	
	
		Person cur_head = this.queueStart;
		
		if (this.queueStart.getNextPerson()!= null){
			this.queueStart = queueStart.getNextPerson();
		}
		
		return cur_head;
	}
	
	
	
	public void lookAtQueue(){
		
		System.out.println("Looking at queue:");
		Person cur = queueStart;
		System.out.println(cur.getName() + "--" + cur.getAge());
		while (cur.getNextPerson()!=null){
			cur = cur.getNextPerson();
			System.out.println(cur.getName() + "--" + cur.getAge());

		}
		
	}
	
	
	
}