package parcial2;
public class parcial2 {

	public static void main(String[] args) {
		int[] nums = { 12,43,65,87,23,65,87,23,76,34,65,34,76,34,43,23,54,23,65,73};
		int inpar=0;
		int par=0;
		for(int i=0;i<nums.length;i++){
			 
			 if(nums[i]% 2 ==0){
				par++; 
		 }else{
			inpar++; 
		}
		   
		
	}
		 System.out.println("Numero total de pares: "+par);
		 System.out.println("Numero total de inpares: "+inpar);
}
}

