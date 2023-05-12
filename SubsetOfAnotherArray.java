package subsetArray;

public class SubsetOfAnotherArray {

	static boolean isSubset(int arr1[], int arr2[], int m, int n)
    {
        int i = 0;
        int j = 0;
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                if (arr2[i] == arr1[j])
                    break;
            }
 
            if (j == m)
            return false;
        }
 
        return true;
    }
 public static void main(String args[])
    {
	 	System.out.println("Array1[] : ");
        int arr1[] = { 11, 10, 13, 21, 30, 70 };
        for(int i =0; i<arr1.length;i++) {
        	System.out.print(arr1[i]+" ");
        }
        System.out.println();
        
        System.out.println("Array2[] : ");
        int arr2[] = { 11, 30, 70, 10 }; 
        for(int i =0; i<arr2.length;i++) {
        	System.out.print(arr2[i]+" ");
        }
        System.out.println();
        int m = arr1.length;
        int n = arr2.length;
        System.out.println();
        if (isSubset(arr1, arr2, m, n))
            System.out.print("Array2[] is subset of Array1[]");
        else
            System.out.print("Array2[] is not subset of Array1[] ");
 
    }
}