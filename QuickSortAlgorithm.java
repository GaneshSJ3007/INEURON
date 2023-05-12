package quickSortAlg;

public class QuickSortAlgorithm {
	public void quickSort(int arr[], int low, int high){
	int i = low, j = high, temp=0, pivot = arr[(low + high) / 2];
	/** partition **/
	while (i <= j){
		while (arr[i] < pivot)
			i++;
		while (arr[j] > pivot)
			j--;
	if (i <= j)
		{/** swap **/
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}
	if (low < j)/** recursively sort lower half **/
	quickSort(arr, low, j);
	if (i < high)/** recursively sort upper half **/
	quickSort(arr, i, high);
	}
public static void main(String[] args) {
			int arr[]={50,30,40,60,70,80,0,10,20};
			
			System.out.println("Sample Array for Quick Sorting: ");
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();System.out.println();
				int low=0;
				int high= arr.length-1;
				QuickSortAlgorithm q=new QuickSortAlgorithm();
				q.quickSort(arr, low,high);
			System.out.println("Array after Quick Sorting: ");
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]+" ");
			}
	}

			
}
