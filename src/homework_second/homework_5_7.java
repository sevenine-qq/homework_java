package homework_second;

public class homework_5_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double tuition =10000;
        double add_tuition=0;
        int i;
        for (i=0;i<15;++i) {
        	tuition=tuition*(1+0.05);
        	if (i>10) {
        		add_tuition+=tuition;
        	}
        }
        System.out.format("The total tuition is %.2f",add_tuition);
	}

}
