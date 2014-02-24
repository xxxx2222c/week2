import java.io.*;

class twothree {
  public static void main(String[] args) throws Exception {
    java.util.Scanner type = new java.util.Scanner(System.in);
    System.out.print("請輸入西元年:");
    int number = type.nextInt();
    for(int i=0;i<number;i++)
    {
        if(i%400==0)
          System.out.print("\n"+i);
        else if(i%100==0)
          System.out.print("");
        else if(i%4==0)
          System.out.print("\n"+i);
        else
          System.out.print("");
    }
  
}
}
