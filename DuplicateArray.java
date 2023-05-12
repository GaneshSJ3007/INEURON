package duplicateArray;

public class DuplicateArray {

	public static void main(String[] args) {
		 int arr[] = {1, 2, 3, 4, 2, 7, 8, 8, 3};  
		 for(int i=0;i<arr.length;i++) {
			 System.out.print(arr[i]+","); 
		 }
		 System.out.println();
		 System.out.println("Duplicate elements in given array:");
		 
		 for(int i=0;i<arr.length;i++) {
			 for(int j=i+1;j<arr.length;j++) {
				 if (arr[i]==arr[j])
					 System.out.print(arr[j]+",");
			 }
		 }

	}

}
