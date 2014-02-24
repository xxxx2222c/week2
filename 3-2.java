import java.io.*;
class Year {
  int year=0;
  int month=0;
  int day=0;
  int Y(){
  if(year<0)
     return 0;
  else
    return 1;
  }
  int M(){
  if(month>12||month<0)
     return 0;
  else 
    return 1; 
  }
  int D(){
  if(month==1&&day>31)
     return 0;
  else if(month==2&&day>28)
     return 0;
  else if(month==3&&day>31)
     return 0;
  else if(month==4&&day>30)
     return 0;
  else if(month==5&&day>31)
     return 0;
  else if(month==6&&day>30)
     return 0;
  else if(month==7&&day>31)
     return 0;
  else if(month==8&&day>31)
     return 0;
  else if(month==9&&day>30)
     return 0;
  else if(month==10&&day>31)
     return 0;
  else if(month==11&&day>30)
     return 0;
  else if(month==12&&day>31)
     return 0;
  else
    return 1; 
  }
  
  public static void main(String[] args) {
    Year y = new Year();
    int a;
	int b;
	int c;
	java.util.Scanner type = new java.util.Scanner(System.in);
    System.out.print("請輸入年:");
    y.year = type.nextInt();
	java.util.Scanner type1 = new java.util.Scanner(System.in);
    System.out.print("請輸入月:");
    y.month = type1.nextInt();
	java.util.Scanner type2 = new java.util.Scanner(System.in);
    System.out.print("請輸入日:");
    y.day = type2.nextInt();
	a=y.Y();
	b=y.M();
	c=y.D();
	if(a==1&&b==1&&c==1)
	{
	    System.out.print("年:"+y.year+"月:"+y.month+"日:"+y.day);
	}
	else
	{
	    if(a==0)
	        System.out.print("年error!\n");
	    if(b==0)
	        System.out.print("月error!\n");
		if(c==0)
	        System.out.print("日error!\n");
	}
    
	
  }
}