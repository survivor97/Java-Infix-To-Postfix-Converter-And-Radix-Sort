package main;

public class Main {

	public static void main(String[] args) {
		//POLISH NOTATION
		String input1 = "2 + 51";
		String input2 = "9 + 133 - 8";
		String input3 = "3 + (2 + 1) * 2^3^2 - 8 / (5 - 1 * 2 / 2)";
		String input4 = "23 + (2 + 1) * 24 ^ 3 ^ 2 - 82 / (5 - 1 * 2 / 2)";		
		//
		String evaluateInput1 = "2 51 +";
		String evaluateInput2 = "9 133 + 8 -";
		String evaluateInput3 = "3 2 1 + 2 3 2 ^ ^ * + 8 5 1 2 * 2 / - / -";		
		String evaluateInput4 = "-3 9 *";
		//
		InfixToPostfix convertor = new InfixToPostfix();
		System.out.println("Infix to postfix:");
		printInfixPostfix(input1, convertor);
		printInfixPostfix(input2, convertor);
		printInfixPostfix(input3, convertor);
		printInfixPostfix(input4, convertor);
		
		System.out.println("Evaluate postfix:");
		printEvaluatePostfix(evaluateInput1, convertor);
		printEvaluatePostfix(evaluateInput2, convertor);
		printEvaluatePostfix(evaluateInput3, convertor);
		printEvaluatePostfix(evaluateInput4, convertor);
	
		//RADIX SORT
		int[] radixInput = {1000, 4, 25, 319, 88, 51, 3430, 8471, 701, 1, 2989, 657, 713};
		int[] result;
		System.out.println("RADIX SORT:");
		printArray(radixInput);
		result = RadixSort.sortAscending(radixInput);
		printArray(result);
		result = RadixSort.sortDescending(radixInput);
		printArray(result);		
	}
	
	private static void printArray(int[] inputArray) {
		System.out.print("Array: ");
		for(int i=0; i<inputArray.length; i++) {
			System.out.print(inputArray[i]+" ");
		}
		System.out.println();
	}
	
	private static void printInfixPostfix(String input, InfixToPostfix convertor) {
		System.out.println("-------------");
		System.out.println("Input: "+input+"\npostfix: "+convertor.convert(input));
		System.out.println("-------------");
	}
	
	private static void printEvaluatePostfix(String input, InfixToPostfix convertor) {
		System.out.println("-------------");
		System.out.println("Input: "+input+"\nResult: "+convertor.evaluatePostfix(input));	
		System.out.println("-------------");
	}
}
