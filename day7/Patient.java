public class Patient {
	private String name;
	private int age;
	private String illness;
	private Patient nextPatient;

	public Patient(String name, int age, String illness) {
		this.name = name;
		this.age = age;
		this.illness = illness;
		this.nextPatient = null;
	}
	public void addPatient(Patient newPatient) {
		if (this.nextPatient == null) {
			this.nextPatient = newPatient;
		} else {
			this.nextPatient.addPatient(newPatient);
		}
	}
	public boolean deletePatient(Patient patient) {
		if (this.nextPatient == null) {
			return false;
		} else if (this.nextPatient.name.equals(patient.name)) {
			this.nextPatient = nextPatient.nextPatient;
			return true;
		} else {
			return this.nextPatient.deletePatient(patient);
		}
	}
	
	public void printPatients(){
		Patient current_patient = this;
		System.out.println(current_patient.name);	
		while (current_patient.nextPatient != null){
			current_patient = current_patient.nextPatient;
			System.out.println(current_patient.name);	
		}
	}
	
	public int queueLength(){
		int counter = 1;
		Patient current_patient = this;
		while (current_patient.nextPatient != null){
			current_patient = current_patient.nextPatient;
			counter++;
		}
		return counter;
	}
	public int recursiveLength() {
		Patient nextPatientInstance = this.nextPatient;
		int result = 1;
		if (nextPatientInstance == null){
			return 1;
		}
		else {
			return result = result +  nextPatientInstance.recursiveLength();
		}
	}
	
	
	//This method will always be called by the base
	public void deletePatientByName(String patientName){
		
		Patient current_patient = this;
		
		do {
			if (current_patient.name.equals(patientName)){
					this.deletePatient(current_patient);		
			}
			current_patient = current_patient.nextPatient;
			//System.out.println(current_patient);
		}	while (current_patient.nextPatient != null) ;
	}
	
	public static void main(String[] args) {
		Patient base = new Patient("Base Patient",10,"TB" );
		//System.out.println("First Print");
		for (int i = 0;i < 9 ;i++){
			Patient p1 = new Patient("patient" + i,i,"TB" );
			base.addPatient(p1);
		}
		//System.out.println("Second Print");
		base.printPatients();
		
		base.deletePatientByName("patient3");
		
		base.printPatients();
			
		int queueLengthRecursive = base.recursiveLength();
		int queueLength = base.queueLength();
		System.out.println(queueLengthRecursive);
		System.out.println(queueLength);
		
	}
	 

}
