import java.io.*;

class Circle {
  double r;
  int count;

 double area() {
    return 3.14 * r * r;
  }  
}
class Oval{
  double ra;
  double rb;
    int count;

   double area() {
    return 3.14 * ra * rb;
  }  
}
class Rectangle{
  double width, height;
    int count;

  double area() {
    return width*height;
  }  
}

class Triangle{
  double width2,height2;
    int count;

   double area() {
    return width2*height2/2;
  } 
  }  


class ShapeTest { 
  public static void main(String[] args) {
  int count=0;
  int[] ch=new int[10];
  double[] all=new double[20];
	Circle a = new Circle();
	Oval b = new Oval();
	Rectangle c = new Rectangle();
	Triangle d = new Triangle();
    for(int i=0;;i++)
	{
	    java.util.Scanner type = new java.util.Scanner(System.in);
        System.out.print("請選擇種類1)圓形2)橢圓形3)矩形4)三角形:-1離開");
        ch[count] = type.nextInt();
		if(ch[count]==1)
		{
		    java.util.Scanner type1 = new java.util.Scanner(System.in);
            System.out.print("請輸入半徑:");
            a.r = type1.nextInt();
			all[count]=a.area();
		}
		else if(ch[count]==2)
		{
			java.util.Scanner type2 = new java.util.Scanner(System.in);
            System.out.print("請輸入短軸:");
            b.ra = type2.nextInt();
			java.util.Scanner type3 = new java.util.Scanner(System.in);
            System.out.print("請輸入長軸:");
            b.rb= type3.nextInt();
			all[count]=b.area();
		}
		else if(ch[count]==3)
		{
			java.util.Scanner type4 = new java.util.Scanner(System.in);
            System.out.print("請輸入長:");
            c.width = type4.nextInt();
			java.util.Scanner type5 = new java.util.Scanner(System.in);
            System.out.print("請輸入寬:");
            c.height = type5.nextInt();
			all[count]=c.area();
		}
		else if(ch[count]==4)
		{
			java.util.Scanner type6 = new java.util.Scanner(System.in);
            System.out.print("請輸入底:");
            d.width2 = type6.nextInt();
			java.util.Scanner type7 = new java.util.Scanner(System.in);
            System.out.print("請輸入高:");
            d.height2 = type7.nextInt();
			all[count]=d.area();
		}
		else if(ch[count]==-1)
		    break;
	     count++;
	}
	for(int j=0;j<count;j++)
	{
	    if(ch[j]==1)
	    {
		    System.out.print("圓:");
		}
		else if(ch[j]==2)
		{
		    System.out.print("橢圓:");
		}
		else if(ch[j]==3)
		{
		    System.out.print("矩形:");
		}
		else if(ch[j]==4)
		{
		    System.out.print("三角形:");
		}
		System.out.print(""+all[j]);
		System.out.print("\n");
	}
	
  }
}
