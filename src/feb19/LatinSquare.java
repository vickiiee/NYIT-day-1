package feb19;

//Vickie Wu
//Feb 19 2019
public class LatinSquare {
	
	private static int numElements;

	public LatinSquare() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int[][] arr2D = { { 10, 30, 20, 0 }, 
						  { 0, 20, 30, 10 }, 
						  { 30, 0, 10, 20 }, 
						  { 20, 10, 0, 30 } }; 
		
		printArray2D(arr2D);
		//System.out.println("\n"+duplicate(arr2D[0]));
		if (isLatin(arr2D))
			System.out.println("\nYes, 2D array is a Latin Square");
		else
			System.out.println("\nNO, 2D array is NOT a Latin Square");

	}

	public static boolean isLatin(int[][] arr2d) {
		System.out.println("1)CREATE TEMP ARRAY AND STRING");
		//create place to store elements for comparison
		numElements = arr2d[0].length;
		int [] storedVals = new int [numElements];
		String val = "";
		
		for(int i = 0; i < arr2d[0].length; i++) {
			storedVals[i] = arr2d[0][i];
			val += " "+arr2d[0][i]+",";
		}
		System.out.print("\n VAl String = "+val);
		System.out.print("\n VAL INDEX TEST = "+val.indexOf(" "+0+""));
		//call duplicate
		
		//rows
		System.out.println("\n2)CHECK ROW");
		for(int i = arr2d.length-1; i >=0; i--) {
			System.out.print("jfkjyfkyhjgjgyhgygygygh");
			boolean t = duplicate(arr2d[i]);
			System.out.println(t);
			System.out.println(i);
			if(t) {
				return false;
			}else {
				for(int q = 0; q < arr2d[i].length; q ++) { //check against stored values
					System.out.println("INDEEXESSS"+val.indexOf(" "+arr2d[i][q]));
					System.out.println(arr2d[i][q]);
					if(val.indexOf(" "+arr2d[i][q])==-1) { 
						return false;
					}
					
				}
			}
			
		}
			
			
			
		//columns
		System.out.println("3)CHECK COLUMN");
		//make array
		int [] temp = new int[arr2d.length];
		for(int i = arr2d.length-1; i >=0; i--) {
			for(int j = 0; j < arr2d.length; j++) {
				System.out.println("		COLUMNCICLDKCMSDKJCNKDSJCNJDSCNJDSBCJHDSCHJDSCHJDSHCJDBSHC" );
				temp[j] = arr2d[j][i];
				System.out.println("("+j+"),("+i+"): "+temp[j] );
			}
			boolean t = duplicate(temp);
			if(t) {
				return false;
			}else {
				for(int q = 0; q < temp.length; q ++) { //check against stored values
					if(val.indexOf(" "+temp[q])==-1) {
						return false;
					}
				}
			}
			
		}
		
		
		
		
		/*
		 * is true if:
		 * - square
		 * -no duplicates in each row/column
		 * -
		 */
		
		//duplicate
		//duplicate(arr2d[0]);
		return true;
	}
	

	public static boolean duplicate(int[]arr) {
		//1) check duplicate, if false, then store the values in array.
		System.out.println("\n");
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = i+1; j < arr.length; j++) {
				System.out.println(arr[i] + " compared with " + arr[j]);
				if(arr[i]==arr[j]) {
					return true;
				}
			}
		}
		
		return false;
		//false: no duplicates
		//true: there are duplicates
		
	}

	public static void printArray2D(int[][] arr2d) {
		for (int i = 0; i < arr2d.length; i++) {
			System.out.print("\n");
		for (int q = 0; q < arr2d[0].length; q++) {
			if(arr2d[i][q]<10) {
				System.out.print(" " + arr2d[i][q] + " ");
				}else {
					System.out.print(arr2d[i][q] + " ");
				}
			}
		}
	}
}
