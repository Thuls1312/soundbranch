package For33revision;

public class greaterthan {
	public static void main(String[]args) {
		int [] name= {10,20,30,40,50};
		int max=name[0];
		for(int i=0;i<name.length;i++) {
			if(name[i]>=max) {
				max=name[i];
			}
		}
		System.out.println(max);
		
	}

}
