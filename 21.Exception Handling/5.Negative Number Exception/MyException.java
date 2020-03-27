class MyException extends Exception
{
  String msg;
  public MyException(String msg)
  {
      this.msg=msg;
  }
  public String toString()
  {
      return msg;
  }
  public static void main(String[] args) throws MyException 
  {
        int a=-3;
        try
        {
            if(a<0)
            {
                throw new MyException("Negative");
            }
        }
        catch (MyException e)
        {
            e.printStackTrace();
            e.toString();
        }
  }
}