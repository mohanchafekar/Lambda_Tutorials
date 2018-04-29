


@FunctionalInterface  //It is optional  
interface Drawable{
	public void draw();
}


public class LambdaExmaple {


	public static void main(String[] args) {
		int width = 5;
		Drawable d = () -> {
			System.out.println("Draw a diagram with length = "+width);
		};
		
		d.draw();
	}
}
