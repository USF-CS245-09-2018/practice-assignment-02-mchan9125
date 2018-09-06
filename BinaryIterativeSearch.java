
public class BinaryIterativeSearch implements Practice2Search {
	public String searchName() {
		return "Binary iterative search";
	}
	public int search(int [] arr, int target) {
		int low = 0;
		int upper = arr.length -1;
		int mid = (arr.length-1)/2;
		
		
				
		while(low <= upper) { //base case
			if(arr[mid] < target) {
				low = mid + 1;
				
			}
			else if(arr[mid] > target) {
				upper = mid - 1;
			}
			else {
				return mid;
			}
			
			mid = (upper + low)/2;
		}
		
		return -1; //target was not in the array
	}
	
	
	

}
