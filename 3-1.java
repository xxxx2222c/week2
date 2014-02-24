import java.io.*;
class Circle {
  double []r=new double[10];
  int ci=0;
  int count=0;
  int k;
  double Arc(){
    return 3.14*2*r[k]*ci/360;
  }
  double Pie(){
    return 3.14*r[k]*r[k]*ci/360;
  }
  
  public static void main(String[] args) {
    Circle c = new Circle();
	for(int i=0;;i++)
	{
	    java.util.Scanner type = new java.util.Scanner(System.in);
        System.out.print("請輸入半徑:-1離開");
        c.r[c.count] = type.nextInt();
		if(c.r[c.count]==-1)
		    break;
			
		c.count++;
	}
	c.count--;
	java.util.Scanner type1 = new java.util.Scanner(System.in);
    System.out.print("請輸入想選擇的編號(需介於0~"+c.count+")");
    c.k = type1.nextInt();
	java.util.Scanner type2 = new java.util.Scanner(System.in);
    System.out.print("請輸入角度:");
    c.ci = type2.nextInt();
	System.out.print("Arc:"+c.Arc());
	System.out.print("Pie:"+c.Pie());
    
	
  }
}
