class HashUtilities{
	
	public int shortHash(int val){
		
		return  ( (val - int.MIN) / (int.MAX - int.MIN) ) * (1 - 1000) + 1;
		
	}
	
	public static void main(String[] args){
		System.out.println(this.shortHash(1));
		System.out.println(this.shortHash(1000));
		
		System.out.println(this.shortHash(1000000000));
		
		
	}
	
}