
public class sample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkCube(8));

	}
	
	static boolean checkCube(int n){
		boolean isCube = false;
		for(int i = 2; i <= n/i; i++){
			if(n/(i*i*i) == 1){
				isCube = true;
				System.out.println(i);
			}
		}
		return isCube;
		
	}

}
