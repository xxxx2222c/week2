class onetwo {
  public static void main(String[] args) {
    double[] a = {2.2, 4.4, 6.6};
    double sum = 0.0;
    int count=0;
    for (double x : a) {
      sum += x;
      count++;
    }
	System.out.println("sum="+sum);
        System.out.println("average="+sum/count);
  }
}
