import java.io.*;

class twoone {
  public static void main(String[] args) throws Exception {
    int y=1911;
    System.out.print("�п�J�m�W�G");
    InputStreamReader is = new InputStreamReader(System.in);
    BufferedReader in = new BufferedReader(is);
    String name = in.readLine();
    java.util.Scanner type = new java.util.Scanner(System.in);
    System.out.print("�п�J�~:");
    int year = type.nextInt();
    System.out.print("�п�J��:");
    InputStreamReader is2 = new InputStreamReader(System.in);
    BufferedReader in2 = new BufferedReader(is2);
    String month = in2.readLine();
    System.out.print("�п�J��:");
    InputStreamReader is3 = new InputStreamReader(System.in);
    BufferedReader in3 = new BufferedReader(is3);
    String day = in3.readLine();
	System.out.println(name+"�z�n�A�ܰ�������z!\n");
        year=year-y;
        System.out.printf("����:"+year);
        System.out.printf("��:"+month);
        System.out.printf("��:"+day);
  }
}
