package homework7;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class homework7_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
        System.out.print("������ѧ��������");
        int n;
        int i,j,k;
        String temp="";
        int size=1000;
        n=input.nextInt();
        System.out.println("������ѧ�������ͳɼ���");
        String[] nasc=new String[size];//����&����
        String str="";
        String[] name=new String[size];//����
        String[] score=new String[size];//����
        for(i=0;i<=n;i++) {
        	nasc[i]=input.nextLine();
        	str=String.valueOf(nasc[i]);
        	String regCa="[^A-z]";  //����������
        	Pattern p = Pattern.compile(regCa);  
        	Matcher x = p.matcher(str);  
        	name[i]=x.replaceAll("").trim();  
        	String regEx="[^0-9]";  //����
        	Pattern q = Pattern.compile(regEx);  
        	Matcher y = q.matcher(str);  
        	score[i]=y.replaceAll("").trim();        	
        }
        for(j=1;j<i;j++) {
        	boolean flag=true;
        	for(k=1;k<i-j;k++) {
        		int a=Integer.parseInt(score[k]);
        		int b=Integer.parseInt(score[k+1]);
        		if(a<b) {
        			temp=score[k];
        			score[k]=score[k+1];
        			score[k+1]=temp;
        			temp=name[k];
        			name[k]=name[k+1];
        			name[k+1]=temp;
        			flag=false;
        		}
        	}
        	if(flag) {
        		break;
        	}
        }
        for(int l=0;l<i;l++) {
        	System.out.println(name[l]);
        }
        input.close();

	}

}
