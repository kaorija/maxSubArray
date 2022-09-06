import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.io.BufferedWriter;
import java.util.Scanner;

public class MaxSubarray {

public static void main(String[] args) throws IOException{

			String path = "";
			String inputFile = path+args[0]+".txt";
			String outputFile = path+args[1]+".txt";

			Scanner scanner = new Scanner(new File(inputFile)); //READING THE INPUT FILE
			int read = scanner.nextInt();

			BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile,true));


			while(read-- > 0){
					int n = scanner.nextInt();
					int[] nums = new int[n];

					for(int i = 0; i < n; i++)

							nums[i] = scanner.nextInt();
							writer.write(maxSumSubarray(n,nums)+"\n");

				}

					writer.close();
					scanner.close();

}

		public static int maxSumSubarray(int n, int[] nums) {
		int currSum ,maxSum;

			currSum = maxSum = 0;

			for(int i = 0; i < n; i++){
			currSum += nums[i];

			maxSum = Math.max(maxSum,currSum); 
			if(currSum < 0) 
			currSum = 0;
		}

			return maxSum;
			}
				}