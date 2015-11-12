package Arrays;

public class ArraysFirst {
	static int list[] = { 10, 5, 19, 4, 7, 48, 74, 54, 32, 90 };

	public static void main(String[] args) {
		System.out.println("Arrays");
		System.out.println(":Welcome to array program:");
		System.out.println(":unsorted:");
		unsorted();
		System.out.println("\n:sorted:");
		sorted();
	}

	public static void sorted() {
		//ascending
		for (int i = 0; i < list.length; i++) {
			for (int j = i + 1; j < list.length; j++) {
				int temp;
				if (list[i] > list[j]) {
					temp = list[i];
					list[i] = list[j];
					list[j] = temp;
				}
			}
		}
		System.out.println("Biggest: " + list[list.length - 1]);
		System.out.println("Second Biggest: " + list[list.length - 2]);
		System.out.println("Second smallest: " + list[1]);
		System.out.println("Smallest: " + list[0]);
	}
	
	public static void unsorted(){

		int lowest = Integer.MIN_VALUE;
		int secondLowest = lowest;
		int biggest = lowest;
		int secondBiggest = lowest;

		// Loop over the array
		for (int i = 0; i < list.length; i++) {
			if(i==0){
				lowest=list[i];
				secondLowest=lowest;
			}
			if (list[i] < lowest) {
				secondLowest = lowest;
				lowest = list[i];
			} else if (list[i] < secondLowest) {
				secondLowest = list[i];
			} else if (list[i] > biggest) {
				secondBiggest = biggest;
				biggest = list[i];
			} else if (list[i] > secondBiggest) {
				secondBiggest = list[i];
			}
		}

		System.out.println("Biggest: "+biggest);
		System.out.println("Second Biggest:"+secondBiggest);
		System.out.println("Second Smallest: "+secondLowest);
		System.out.println("Smallest: "+lowest);
	}

}
