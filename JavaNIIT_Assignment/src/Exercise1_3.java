import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise1_3 {

	public static boolean checkTriplets(int[] arr) {
		boolean result = false;
		int b, c;
		for (int i = 0; i < arr.length; i++) {
			b = i + 1;
			c = i + 2;
			if (b < arr.length && c < arr.length) {
				if (arr[i] == arr[b] && arr[i] == arr[c]) {
					return true;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("ENTER THE NUMBER OF DIGITS:");
		int num = Integer.parseInt(br.readLine());
		
		int[] arr = new int[num];

		System.out.println("Enter the numbers: ");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		if (checkTriplets(arr)) {
			System.out.println("There are triplets");
		} else
			System.out.println("There are no triplets");
	}
}