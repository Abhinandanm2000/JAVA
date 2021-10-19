
public interface polygon {
           void circle();
           void rectangle();
           void square();
           void triangle();
           void hexagon();
           
}

class area implements polygon{
	public void circle(int a) {
		double areac=3.14*a*a;
		System.out.println(areac);
	}
	public void rectangle(int a,int b) {
		double aread=a*b;
		System.out.println(aread);
	}
	public void square(int a) {
		double areas=a*a;
		System.out.println(areas);
	}
	public void triangle(int a,int b) {
		double areat=0.5*a*b;
		System.out.println(areat);
	}
	public void hexagon(int a) {
		double areah=3*Math.sqrt(3)*Math.pow(a,2)/2;
		System.out.println(areah);
	}
	public static void main(String[] args)
	{
		area obj= new area();
		obj.hexagon(5);
	}
	
	
	
	
}
