package pij;
public class HashUtilitiesNeat{
	
	public  int shortHash(int val){
		return  Math.abs(val) % 1000;
	}
	
}