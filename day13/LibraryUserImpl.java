public class LibraryUserImpl implements LibraryUser {
	
	String name;
	int ID;
	
	LibraryUserImpl(String name ){
		this.name = name;
	}
	
	public String getName(){
		//return "implement me";
		return this.name;
	}
	
	public int getID(){
		//return 555;
		return this.ID;
	}
	
	public void setID(int id){
		//int a = id;
		this.ID = id;
	}
}