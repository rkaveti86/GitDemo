import Demo.CentralTraffic;
import Demo.Interface2;

public class IndianTraffic implements CentralTraffic, Interface2 {

	public static void main(String[] args) {
		
CentralTraffic CT=new IndianTraffic();
IndianTraffic IT=new IndianTraffic();
Interface2 In=new IndianTraffic();
CT.RedSignal();
CT.GreenSignal();
CT.YellowSignal();
IT.walk();
In.Black();

	}

	@Override
	public void RedSignal() {
		System.out.println("Red Stop");
		
	}

	@Override
	public void GreenSignal() {
		System.out.println("Green stop");
		
	}

	@Override
	public void YellowSignal() {
		System.out.println("Yello stop");
		
	}
	public void walk()
	{
		System.out.println("Walk");
	}

	@Override
	public void Black() {
		System.out.println("Black");
		
	}

}
