class InsertionSort{
	public static void main(String args[]){
		InsertionSort is = new InsertionSort();
		int arr[] = {23,42,45,64,23,22};
		is.insertionSort(arr);
		is.printArray(arr);
	}

	public void printArray(int arr[]){
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i]+ " ");
		}
	}

	public void insertionSort(int arr[]){
		int n = arr.length;
		for(int i = 1; i < n; i++){
			int key = arr[i];
			int j = i - 1;

			while(j >= 0 && arr[j]>key){
				arr[j+1] = arr[j];
				j = j - 1;
			}

			arr[j+1] = key;
		}
	}
}