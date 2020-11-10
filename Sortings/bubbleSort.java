class BubbleSort{
	public static void main(String args[]){
		BubbleSort bs = new BubbleSort();
		int arr[]={12,23,43,52,24,63};
		bs.bubbleSort(arr);
		bs.printArray(arr);
	}

	public void bubbleSort(int arr[]){
		int n = arr.length;
		for(int i = 0; i < n-1; i++)
			for(int j = 0; j < n-i-1; j++){
				if(arr[i]>arr[i+1]){
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
	}

	public void printArray(int arr[]){
		for(int i = 0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}

}



		