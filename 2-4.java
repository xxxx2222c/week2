import java.io.*;

class twofour {
  public static void main(String[] args) {
           int count=0;
           int[] grade=new int[10];
           for(int j=0;;j++)
           {         
               java.util.Scanner type = new java.util.Scanner(System.in);
               System.out.print("�п�J����:-1���}");
               grade[count] = type.nextInt();
			   if(grade[count]==-1)
			       break;
               if(grade[count]>100||grade[count]<-1)
               {
                    System.out.print("error!\n");
                    j--;
                    count--;
               } 

               count++;
           }
		       count--;
               java.util.Scanner type1 = new java.util.Scanner(System.in);
               System.out.print("�п�J�Q��ܪ��s��(�ݤ���0~"+count+")");
               int k = type1.nextInt();
               System.out.print(k+":"+grade[k]+"\n");
  }
}
