import java.io.*;

class twotwo {
  public static void main(String[] args) throws Exception {
    double total;
    java.util.Scanner type = new java.util.Scanner(System.in);
    System.out.print("請輸入數字1:");
    double number1 = type.nextDouble();
    java.util.Scanner type1 = new java.util.Scanner(System.in);
    System.out.print("請輸入數字2:");
    double number2 = type1.nextDouble();
     java.util.Scanner type2 = new java.util.Scanner(System.in);
    System.out.print("請選擇運算方式1)+.2)-.3)*.4)/:");
    int ch = type2.nextInt();
        switch(ch) {  
            case 1: 
                total=number1+number2;
                System.out.println(""+total); 
                break; 
            case 2: 
                total=number1-number2;
                System.out.println(""+total); 
                break; 
            case 3: 
                total=number1*number2;
                System.out.println(""+total); 
                break; 
            case 4: 
                if(number2==0)
                { 
                    System.out.println("error!\n");
                    break; 
                } 
                total=number1/number2;
                System.out.println(""+total); 
                break; 
            default: 
                System.out.println("無此運算法則!\n");
  }
}
}
