public class VectorsTest {
	static double frontWeightedAverage;
	static double backWeightedAverage;
	public static void main(String[] args){
		SwerveDrive swerveDrive = new SwerveDrive();
		SwerveDrive.Vector[] temp =  swerveDrive.compute(1, 1, 0);
		
		frontWeightedAverage = (temp[0].getAngleDegrees()*temp[0].getMagnitude()+temp[2].getAngleDegrees()*temp[2].getMagnitude())/(temp[0].getMagnitude()+temp[2].getMagnitude());
		backWeightedAverage = (temp[1].getAngleDegrees()*temp[1].getMagnitude()+temp[3].getAngleDegrees()*temp[3].getMagnitude())/(temp[1].getMagnitude()+temp[3].getMagnitude()); 
		
		System.out.println(frontWeightedAverage + " " + backWeightedAverage);
		System.out.println(temp[0].getMagnitude() +" " + temp[2].getMagnitude() + " " + temp[1].getMagnitude() + " " + temp[3].getMagnitude());	
	}
}

/*
 							0 degrees
                              |
                              |
                              |
                              |
                              |
       -90 degrees____________|______________ 90 degrees
                              |
                              |
                              |
                              |
                              |
*/