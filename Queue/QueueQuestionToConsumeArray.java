import java.util.*;

class QueueQuestionToConsumeArray 
{
	public static void main(String[] args) 
	{
		int[] A = {2, 3, 1, 5, 4};
		int[] B = {1, 3, 5, 4, 2};

		Queue<Integer> q = new LinkedList<>();

		for(int i=0; i<A.length; i++){
			q.add(A[i]);
		}

		int countCycle = 0;

		for(int i=0; i<B.length; i++){
			if(q.peek() != B[i]){
				int val = q.poll();
				q.add(val);
				countCycle++;
			}

			q.poll();
			countCycle++;
		}

		System.out.println(countCycle);
	}
}
