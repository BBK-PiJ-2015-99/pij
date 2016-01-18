public class LibraryImpl implements Library{
	
	String name;
	int maxBooks;
	
	LibraryImpl(String name){
		this.name = name;
	}
	
	public String getName(){
		return "IMPLEMENT ME";
		
	}
	
	public void setMaxBooks(int maxBooks){
		//return "IMPLEMENT ME";
		//this.maxBooks = maxBooks;
	}
	
	public int getMaxBooks(){
		return 5;
		//return this.maxBooks;
	}
	
	public int getID(){
		return 123;
	}
}