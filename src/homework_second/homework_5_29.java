package homework_second;

import java.util.Scanner;

public class homework_5_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
        System.out.print("输入年份：");
        int year,day,month,DaysPerMonth,i;
        year=scan.nextInt();
        System.out.print("输入代表月份的数字：");
        day=scan.nextInt();
        scan.close();
        String smonth;
        smonth="";
        DaysPerMonth=0;
        for(month=1;month<=12;++month) {
        	switch(month) {
        	case 1:
        		//day+=31;
        		DaysPerMonth=31;
        		smonth="Janurary";
        	    break;
        	case 2:
        		day+=31;
        		DaysPerMonth=30;
        		smonth="Febrary";
        	    break;
        	case 3:
        		day+=28;
        		DaysPerMonth=31;
        		smonth="March";
        		break;
        	case 4:
        		day+=31;
        		DaysPerMonth=30;
        		smonth="April";
        		break;
        	case 5:
        		day+=30;
        		DaysPerMonth=31;
        		smonth="May";
        		break;
        	case 6:
        		day+=31;
        		DaysPerMonth=30;
        		smonth="June";
        		break;
        	case 7:
        		day+=30;
        		DaysPerMonth=31;
        		smonth="July";
        		break;
        	case 8:
        		day+=31;
        		DaysPerMonth=31;
        		smonth="Auguest";
        		break;
        	case 9:
        		day+=31;
        		DaysPerMonth=30;
        		smonth="September";
        		break;
        	case 10:
        		day+=30;
        		DaysPerMonth=31;
        		smonth="October";
        		break;
        	case 11:
        		day+=31;
        		DaysPerMonth=30;
        		smonth="November";
        		break;
        	case 12:
        		day+=30;
        		DaysPerMonth=31;
        		smonth="December";
        		break;
        		}
        	if ((year%4==0 & year%100!=0) || (year%1000==0 & year%400==0)) {
        		if(month!=1) {
        			day+=1;
        		}
        	}
        	int week;
            week=day%7;
            
            System.out.println("        "+smonth);
            System.out.println("-------------------------------");
            System.out.println("Sun  Mon  Tue  Wed  Thu  Fri  Sat");
            
            switch(week) {
            case 0:
            	for (i=1;i<=DaysPerMonth;++i) {
            		if (i==1|i==8) {
            			System.out.printf("%2d",i);
            		}
            		else if(i==15|i==22|i==29) {
            			System.out.print(i);
            		}
            		else {
            		    System.out.printf("%5d",i);
            		    if (i%7==0) {
            			    System.out.println();
            	    	}
            		}
            	}
            	break;
            case 1:
            	for (i=1;i<=DaysPerMonth;++i) {
            		if (i==1|i==8) {
            			System.out.printf("%2d",i);
            		}
            		else if(i==15|i==22|i==29) {
            			System.out.print(i);
            		}
            		else {
            			System.out.printf("%5d",i);
                		if (i%7==0) {
                			System.out.println();
                		}
            		}
            	}
            		break;
            case 2:
            	for (i=1;i<=DaysPerMonth;++i) {
            		if (i==1) {
            			System.out.print("           1");
            		}
            		else if(i==6) {
            			System.out.printf("%2d",i);
            		}
            		else if(i==13|i==20|i==27) {
            			System.out.print(i);
            		}
            		else {
            			System.out.printf("%5d",i);
                		if (i==12|i==5|i==19|i==26) {
                			System.out.println();
                		}
            		}
            	}
            		break;
            case 3:
            	for (i=1;i<=DaysPerMonth;++i) {
            		if (i==1) {
            			System.out.print("                1");
            		}
            		else if(i==5) {
            			System.out.printf("%2d",i);
            		}
            		else if(i==12|i==19|i==26) {
            			System.out.print(i);
            		}
            		else {
            			System.out.printf("%5d",i);
                		if (i==11|i==18|i==25|i==4) {
                			System.out.println();
                		}
            		}
            	}
            		break;
            case 4:
            	for (i=1;i<=DaysPerMonth;++i) {
            		if (i==1) {
            			System.out.print("                     1");
            		}
            		else if(i==4) {
            			System.out.printf("%2d",i);
            		}
            		else if(i==11|i==18|i==25) {
            			System.out.print(i);
            		}
            		else {
            			System.out.printf("%5d",i);
                		if (i==10|i==17|i==3|i==24) {
                			System.out.println();
                		}
            		}
            	}
            		break;
            case 5:
            	for (i=1;i<=DaysPerMonth;++i) {
            		if (i==1) {
            			System.out.print("                          1");
            		}
            		else if(i==3) {
            			System.out.printf("%2d",i);
            		}
            		else if(i==10|i==17|i==24|i==31) {
            			System.out.print(i);
            		}
            		else {
            			System.out.printf("%5d",i);
                		if (i==2|i==9|i==16|i==23|i==30) {
                			System.out.println();
                		}
            		}
            	}
            		break;
            case 6:
            	for (i=1;i<=DaysPerMonth;++i) {
            		if (i==1) {
            			System.out.println("                               1");
            		}
            		else if(i==2|i==9) {
            			System.out.printf("%2d",i);
            		}
            		else if(i==16|i==23|i==30) {
            		    System.out.print(i);
            		}
            		else {
            			System.out.printf("%5d",i);
                		if (i==8|i==15|i==22|i==29) {
                			System.out.println();
                		}
            		}
            	}
            		break;
            			
            	
            	}
            	System.out.println();
            	//System.out.println(week);
            }
            
        }
	}

