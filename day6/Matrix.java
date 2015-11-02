
public class Matrix{
	private int[][] matrix;
	private int matrix_rows;
	private int matrix_columns;
	
	public Matrix(int rows, int columns){
		this.matrix = new int[rows][columns];
		this.matrix_rows = rows;
		this.matrix_columns = columns;
		
		for (int i =0; i<= rows-1; i++){
			for(int j =0; j<=columns-1; j++){
					this.matrix[i][j] = 1;
			}	
		}
	}
	 	
	public void setElement(int row, int column, int val){
		this.matrix[row][column] = val;
	}
	
	public void setRow(int row, String values){
		String[] tokens = values.split(",");
		if ((row <= this.matrix.length-1) && (tokens.length == matrix[row].length) ){
			for(int i=0; i<=tokens.length-1; i++){
				this.setElement(row,i, Integer.parseInt(tokens[i]));
				
			}
		}
	}
	
		public void setColumn(int column, String values){
		String[] tokens = values.split(",");
		if ((column <= this.matrix[0].length-1) && (tokens.length == matrix.length) ){
			for(int i=0; i<=tokens.length-1; i++){
				this.setElement(i,column, Integer.parseInt(tokens[i]));
				
			}
		}
	}
	
	public String toString(){

		int chars_required = ( this.matrix_rows * this.matrix_columns ) * 10;
		String representation = "";
		
		representation += "{";	
		
		for(int i = 0; i<=this.matrix_rows-1; i++){
			for(int j=0; j<=this.matrix_columns-1; j++){
				representation += Integer.toString(this.matrix[i][j]);
				representation += ",";
			}
			representation += ";";	
		}
		representation += "}";	
		return representation;
	}
	
	public String prettyPrint(){

		int chars_required = ( this.matrix_rows * this.matrix_columns ) * 10;
		String representation = "";
		
		int counter = 0;
		representation += "\n" + "-----------" +"\n";	
		
		for(int i = 0; i<=this.matrix_rows-1; i++){
			for(int j=0; j<=this.matrix_columns-1; j++){
				representation += Integer.toString(this.matrix[i][j]);
				representation += "\t";
			}
			representation += "\n";	
		}
		representation += "\n" + "-----------" +"\n";	
		return representation;
	}
}