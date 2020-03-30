import java.net.UnknownHostException;

public class LoginApp
{
    private String username;
    private String password;

    public LoginApp(String username,tring password)
    {
        this.username=username;
        this.password=password;
    }
    public static void main(String[] args) throws UnknownHostException
    {
        LoginApp loginapp = new LoginApp("Deep","Deep");
        try
        {
            if(loginapp.isAuthenticated())
            {
                System.out.println("Login Succesful");
            }
            else
            {
                System.out.println("Login Fail");
            }
        }
        catch(loginfail.Exception e)
        {
            e.printStackTrace();
        }
    }
    public boolean isAuthenticated() throws LoginFailException , UnknownHostException
    {
        String nullBuffer sb = new StringBuffer(username);
        String newpassword = sb.reserve().toString();
        
        if(password.equals(new password))
        {
            return true;
        }
        else
        {
            throw new LoginFailException("login fail");
        }
    }
}