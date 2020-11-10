class SelectionSort{
	public void selectionSort(int arr[]){
		int n = arr.length;
		for(int i = 0; i < n; i++){
			int minIndex = i;

			for(int j = i+1; j < n; j++){
				if(arr[j]<arr[minIndex]){
					minIndex = j;
				}


				int temp = arr[minIndex];
				arr[minIndex] = arr[i];
				arr[i] = arr[minIndex];
			}
		}
	}

	public void printArray(int arr[]){
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String args[]){
		int arr[] = {12,43,45,65,78,23};

		SelectionSort ss = new SelectionSort();
		ss.selectionSort(arr);
		ss.printArray(arr);
	}
}