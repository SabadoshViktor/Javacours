	
	public class Sesons {

		public static void main(String[] args) {
	        int[] T = {2, (-3), 3, 1, 10, 8, 2, 5, 13, (-5), 3, (-18)};
	        int[] T1 = {(-3), (-14), (-5), 7, 8, 42, 8, 3};
	        String amplitude = Solution(T);
	        String amplitude1 = Solution(T1);

	        System.out.println(amplitude);
	        System.out.println(amplitude1);
		}

		public static String Solution(int[] T) {
		
	        int max = T[0];
	        int min = T[0];
	     
	        int[] ampArray = new int[4]; 
	        int seasons = T.length / 4;

	        int ampCounter = 0; 
	        int seasonCheck = 1; 

	        for (int counter = 0; counter < T.length; counter++) {

	            if (T[counter] < min) 
	                min = T[counter];

	            else if (max < T[counter]) 
	                max = T[counter];

	            if (seasonCheck % seasons == 0) { 
	                ampArray[ampCounter] = max - min; 

	                if (T.length == counter + 1) { 
	                    break;
	                } else {
	                    min = T[counter + 1]; 
	                    max = T[counter + 1];
	                }
	                ampCounter++;  
	            }
	            seasonCheck++; 
	        }

	        String bigAmplitude = null; 
	        switch (seasons) {
	            case 0:
	            	bigAmplitude = "WINTER";
	                break;
	            case 1:
	            	bigAmplitude = "SPRING";
	                break;
	            case 2:
	            	bigAmplitude = "SUMMER";
	                break;
	            case 3:
	            	bigAmplitude = "AUTUMN";
	                break;

	        }
	        return bigAmplitude;
	   
		}
		
	    
	}


