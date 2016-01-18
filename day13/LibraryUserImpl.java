public class LibraryUserImpl implements LibraryUser {
	
	String name;
	int ID;
	Library library;
	
	
	/**
	* Constructor. Only name can be set here.
	* 
	* @param LibraryUser name
	*/
	LibraryUserImpl(String name ){
		this.name = name;
	}
	
	/**
	* Get LibraryUser name
	* 
	* @return LibraryUser name
	*/
	public String getName(){
		//return "implement me";
		return this.name;
	}
	
	/**
	* Get LibraryUser ID
	* 
	* @return LibraryUser ID
	*/
	public int getID(){
		//return 555;
		return this.ID;
	}
	
	/**
	* Set LibraryUser ID
	* 
	* @param LibraryUser ID
	*/
	public void setID(int id){
		//int a = id;
		this.ID = id;
	}
	
	/**
	* Register LibraryUser with Library
	* 
	* @param Library where LibraryUser is to be registered
	*/
	public void register(Library lib){
		library = lib;
	}
	
	/**
	* Get Library where LibraryUser is registered
	* 
	* @return Library where LibraryUser has registered
	*/
	public Library getLibrary(){
		return library;
	}
}