package tarefa06;

public class Studant {
	public String name;
	public double g[] = new double [3];
	
	public double finalGrade () {
		double average = 0.0;
		double weight [] = new double [3];
		weight[0] = 3.0; weight[1] = 3.5; weight[2] = 3.5;
		for (int i = 0; i < 3; i++) average += (g[i]*weight[i])/10;
		return average;
	}
	public String status () {
		if (finalGrade()>=6.0) return "PASS";
		else return  String.format("FAILED \n MISSING: %0.1f POINTS",(6.0-finalGrade()) );
	}
}
