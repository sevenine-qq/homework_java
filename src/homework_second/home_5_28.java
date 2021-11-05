package homework_second;
import java.util.Scanner;
public class home_5_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("输入年份：");
        int year,day,month;
        year=scan.nextInt();
        System.out.print("输入代表月份的数字：");
        day=scan.nextInt();
        scan.close();
        String syear,smonth,sday;
        syear=String.valueOf(year);
        smonth="";
        sday="";
        for(month=1;month<=12;++month) {
        	switch(month) {
        	case 1:
        		//day+=31;
        	    smonth="Janury 1";
        	    break;
        	case 2:
        		day+=31;
        	    smonth="Febrary 1";
        	    break;
        	case 3:
        		day+=28;
        		smonth="March 1";
        		break;
        	case 4:
        		day+=31;
        		smonth="April 1";
        		break;
        	case 5:
        		day+=30;
        		smonth="May 1";
        		break;
        	case 6:
        		day+=31;
        		smonth="June 1";
        		break;
        	case 7:
        		day+=30;
        		smonth="July 1";
        		break;
        	case 8:
        		day+=31;
        		smonth="April 1";
        		break;
        	case 9:
        		day+=31;
        		smonth="September 1";
        		break;
        	case 10:
        		day+=30;
        		smonth="Octorber 1";
        		break;
        	case 11:
        		day+=31;
        		smonth="November 1";
        		break;
        	case 12:
        		day+=30;
        		smonth="December 1";
        		break;
        		}
        	if ((year%4==0 & year%100!=0) || (year%1000==0 & year%400==0)) {
        		if(month!=1) {
        			day+=1;
        		}
        	}
        	int week;
            week=day%7;
            switch(week) {
            case 0:
            	sday="is Sunday";
            	break;
            case 1:
            	sday="is Monday";
            	break;
            case 2:
            	sday="is Tuesday";
            	break;
            case 3:
            	sday="is Wednesday";
            	break;
            case 4:
            	sday="is Thursday";
            	break;
            case 5:
            	sday="is Friday";
            	break;
            case 6:
            	sday="is Saturday";
            	break;
            }
            System.out.println(smonth+", "+syear+" "+sday);
            smonth="";
            sday="";
        }
        
	}

}
