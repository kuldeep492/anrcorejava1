package InterfaceandAbstract;

public class AppMain extends QaTrainee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TrainingModuleInterf tm=new QaTrainee();
		tm.add(10, 20);
		tm.get();
		System.out.println(tm.count());
		System.out.println(tm.count());
		((QaTrainee) tm).SessionAttend();
		
	

	}

}
