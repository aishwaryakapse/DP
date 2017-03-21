package dp;

public class StairClimbing {
	//n = no of steps
	public static int waysRec(int n){
		//base cases
		if(n >0 && n <= 2) return n;
		//It follows fibonacci series in the no of ways	
		return waysRec(n-1)+waysRec(n-2);
	}
	
	public static int waysIter(int n){
		//base cases
		if(n > 0 && n <= 2) return n;
		int[] prev = {1, 2};
		
		int current = 2; // will reach here after n > 2
		while(current < n){
			int preTotal = prev[0] + prev[1];
			prev[0] = prev[1];
			prev[1] = preTotal;
			++current;
		}
		return prev[1];
	}
	
	

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		System.out.println("Rec: "+waysRec(40));
		System.out.println("Time used by Rec : "+(System.currentTimeMillis() - startTime));
		startTime = System.currentTimeMillis();
		System.out.println("Iter: "+waysIter(40));
		System.out.println("Time used by Iter : "+(System.currentTimeMillis() - startTime));
	}

}
