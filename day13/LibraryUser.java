/**
*
* Create a class for the users of the library. Users have a name and a library-ID (an int), both of which must be
*unique in a library. The name is set at construction time, but the library-ID is not (more on this on 1.3 and 1.4).
*The class must implement methods to get the name of the person and their ID.
*
* @author David Asfaha
*
*/


interface LibraryUser {
	
	/**
	* get the library user name
	* @return LibraryUser name
	*/
	String getName();
	
	/**
	* Get the library user id
	* @return LibraryUser ID
	*/
	int getID();

	/**
	* Set the LibraryUser id
	* @param LibraryUser ID
	*/
	void setID(int id);
		
}