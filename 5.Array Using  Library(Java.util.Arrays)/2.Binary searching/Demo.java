import java.util.Arrays;
class Demo
{
  public static void main(final String[] args) {
        int a[] = {2,4,6,8,10,12,14,16,18,20,200,400};

        int index = Arrays.binarysearch(a, 20);
      System.out.println("20 is at :"+index+" Position");
  }
}
