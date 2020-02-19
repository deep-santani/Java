class Demo
{
    public static void main(String[] args) {
        int sum=0;
        for(String i :args)
        {
            sum=sum+Integer.parseInt(i);
        }
        System.out.println("Sum is : "+sum);
    }
}