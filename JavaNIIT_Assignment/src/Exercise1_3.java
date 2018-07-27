import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise1_3 {

	public static boolean checkTriplets(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			
				if (arr[i] == arr[i+1] && arr[i] == arr[i+2]) {
					return true;
			}
			break;
		}
		return false;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr = new int[5];

		System.out.println("Enter the numbers: ");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		if (checkTriplets(arr)) {
			System.out.println("There are triplets");
		} else
			System.out.println("No triplets");
	}
}