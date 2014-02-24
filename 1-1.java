class oneone {
  public static void main(String[] args) {
    double[] a = {4.0, 23.0, 45.0};
    double[] b = {13.0, 54.0, 23.0};
    double sum = 0.0;
    double sum1 = 0.0;
    double sum2 = 0.0;
    int timet=0;
    int count1=0;
    int count2=0;
    for (double x : a) {
      if(count1==2)
         timet=1;
      else if(count1==1)
         timet=60;
      else if(count1==0)
         timet=60*60;

      sum1 += x*timet;
      count1++;
    }
    for (double y : b) {
      if(count2==2)
         timet=1;
      else if(count2==1)
         timet=60;
      else if(count2==0)
         timet=60*60;

      sum2 += y*timet;
      count2++;
    }
    sum=sum2-sum1;
	System.out.println("sum="+sum);
  }
}
