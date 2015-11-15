public class Spy {
	private static int spyCount = 0;
	private int ID;

	public Spy(int ID) {
		this.ID = ID;
		spyCount++;
		System.out.println("The ID of the spy is:" + ID + " there are " + spyCount + " spies.");
	}
	
	public void die(){
		System.out.println("Spy " + this.ID + " has been detected and eliminated");
		spyCount--;
		System.out.println("There are " + spyCount +" spies left");
	
	}
	
	public static void main(String[] args){
		Spy s1 = new Spy(1);
		Spy s2 = new Spy(2);
		Spy s3 = new Spy(3);
		Spy s4 = new Spy(4);
		s2.die();
		s3.die();
	}
}