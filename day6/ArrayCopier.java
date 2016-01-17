
public class ArrayCopier{
	public int[] copyArrays(int[] src , int[] dst ){
		for(int i=0; (i<=src.length-1 && i<=dst.length-1); i++){
			dst[i] = src[i]; 
		}	
		if (dst.length > src.length){
			int diff = dst.length - src.length  ;
			for (int i=src.length; i<=(src.length + diff - 1); i++){
				dst[i] = 0;	
			}				
		}
		return dst;
	}
}