import java.util.Scanner;

public class Area {

	public static double AreaRettangolo(double B,double H)
	{
		return B*H;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double base,altezza;
		Scanner in = new Scanner(System.in);
		base=in.nextDouble();
		altezza=in.nextDouble();
		double area = AreaRettangolo(base,altezza);
        System.out.print("L'area del rettangolo è: "+ area);
	}

}
