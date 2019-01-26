
public class Main {

	public static void main(String[] args) {

		
	}
	public boolean sleepIn(boolean weekday, boolean vacation) {
		 if(!weekday || vacation){
		   return true;
		 }
		 return false;
		}

	public int diff21(int n) {
		  if(n<=21){
		    return 21 - n;
		  }
		  else{
		    return (n-21)*2;
		  }
		}

	public String endUp(String str) {
		  if (str.length() <= 3) {
			  return str.toUpperCase();
		  }
		  else {
			  int n = str.length() - 3;
			  String front = str.substring(0, n);
			  String back  = str.substring(n);

			  return front + back.toUpperCase();

		  }

	}


	public int intMax(int a, int b, int c) {
		if(a>b && a>c) {
			return a;
		}
		if(b>a && b>c) {
			return b;
		}
		else {
			return c;
		}
	}

	public boolean commonEnd(int[] a, int[] b) {
		  for(int i=0; i<a.length; i++){
		    for(int j=0; j<b.length; j++){
		      if(a[a.length-1]==b[b.length-1] || a[0]==b[0] ){
		        return true;
		      }
		    }
		}
		return false;
		}

	public int sum2(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if(nums.length==0) {
				return 0;
			}
			if(nums.length<2) {
				return nums[i];
			}
			else{
			  return nums[0]+nums[1];
			}

		}
		return 0;
}

	public int countEvens(int[] nums){
		int count = 0;
		for(int i = 0; i < nums.length; i++){
			if(nums[i] % 2 == 0)
				count++;
		}
		return count;
	}

	//Ýòîò ìíå äîâåëîñü ñòÿíóòü ñ ãóãëà =)
	public int[] zeroMax(int[] nums) {
		  int max = 0;

		  for (int i = nums.length-1; i >= 0; i--) {
		    if (nums[i] % 2 != 0)
		      max = Math.max(max, nums[i]);
		    if (nums[i] == 0)
		          nums[i] = max;
		  }
		  return nums;
		}


	public int[] shiftLeft(int[] nums) { 
		  int[] res;
		  res = new int[nums.length];

		  if (nums.length == 0)
		  return res;

		  for (int i = 0; i < nums.length-1; i++) {
		    if (i > 0)
		      res[i] = nums[i+1];
		  }
		  if (nums.length > 1)
		    res[0] = nums[1];
		  res[nums.length-1] = nums[0];
		 return res;

		}

	public String nonStart(String a, String b) {
		   return a.substring(1,a.length()) + b.substring(1,b.length());
		}

	public String middleTwo(String str) {
		  int half = str.length() / 2;
		  return str.substring(half-1,half+1);
		}
}
