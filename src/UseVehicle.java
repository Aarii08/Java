import mypack.Bus;
import mypack.Stopable;
import mypack.Taxi;
import mypack.Train;
import mypack.Vehicle;

public class UseVehicle {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Vehicle[] v = new Vehicle[3];
		v[0] = new Taxi(4);
		v[1] = new Train(160);
		v[2] = new Bus(80);
		
		for(int i = 0; i < v.length; i++) {
			v[i].showCrewNum();
			if(v[i] instanceof Stopable) {
				Stopable s = (Stopable) v[i];
				s.stop();
			}
		}
	}

}
