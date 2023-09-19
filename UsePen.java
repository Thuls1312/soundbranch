package For33revision;

public class UsePen {
	public static void main(String[]args) {
		Pen pen1=new Pen();
		pen1.brand="reynolds";
		pen1.price=20;
		pen1.color="black";
		Pen pen2=new Pen();
		pen2.brand="cello";
		pen2.price=30;
		pen2.color="blue";
		Pen pen3=new Pen();
		pen3.brand="rado";
		pen3.price=40;
		pen3.color="green";
		Pen pen4=new Pen();
		pen4.brand="mant";
		pen4.price=50;
		pen4.color="gray";
		Pen [] pens= {pen1,pen2,pen3};
		Pen max=pens[0];
		for(int i=0;i<pens.length;i++) {
			if(pens[i].color.equals("blue")&&pens[i].price>=max.price) {
				max=pens[i];
			}
		}
		System.out.println(max.price+" "+max.color);
		
		
		
		
		
		
		
		
	}

}







class Pen {
	String brand;
	int price;
	String color;
	
}