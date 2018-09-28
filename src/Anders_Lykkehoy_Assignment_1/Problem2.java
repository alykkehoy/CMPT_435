public class Problem2 {
	public static boolean majority(int[] A)
	{
		/*
		Input: an array A of n integers (positive, negative, or 0), elements sorted in ascending order.
		Output: if there exists a majority element.
		An element is a majority if it appears more than n/2 times. For example, if the input list is:
		{0, 0, 0, 0, 0, 0, 1, 1, 2, 4, 7}
		The output should be true, as 0 appears 6 times (>n/2 = 11/2 times).
		However, if the input list is:
		{0, 0, 0, 1, 1, 2, 3, 10, 10}
		The majority element does not exist.
		Design an algorithm that solves this problem.
		*/

		int majority = (int)Math.ceil((A.length) / 2.0);
		int count = 1;
		for(int i = 1; i < A.length - 1; i++){
			if(A[i] == A[i-1]) {
				count++;
			}else {
				count = 1;
			}
			if(count == majority) {
				return true;
			}
		}
		return false;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Test your majority method

		int[] testarray1 = {0, 0, 0, 0, 0, 0, 1, 1, 2, 4, 7};

		int[] testarray2 = {0, 0, 0, 1, 1, 2, 3, 10, 10};


		System.out.println("Does there exist a majoirty element in testarray1? "+ majority(testarray1));
		System.out.println("Does there exist a majoirty element in testarray2? "+ majority(testarray2));

	}
}
