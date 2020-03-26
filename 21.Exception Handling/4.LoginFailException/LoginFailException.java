import java.net.InetAddress;
import java.net.UnknownHostException;

public class LoginFailException extends Exception
{
    private String msg=null;

   /* public LoginFailException
    {

    }
    */
    public LoginFailException(String msg) throws UnknownHostException
    {
        System.out.println(InetAddress.getLocalHost());
        this.msg=msg;
    }
    public String tosString()
    {
        return msg;
    }
}