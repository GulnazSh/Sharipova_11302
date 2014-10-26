import java.util.Scanner;

/**
 * Created by ABC on 21.10.14.
 */
public class CheckUser {
    private String currentLogin;
    private String currentPassword;

    public String getCurrentLogin() {
        return currentLogin;
    }

    public void setCurrentLogin(String currentLogin) {
        this.currentLogin = currentLogin;
    }

    public String getCurrentPassword() {
        return currentPassword;
    }

    public void setCurrentPassword(String currentPassword) {
        this.currentPassword = currentPassword;
    }

    CheckUser(String currentLogin, String currentPassword) {
          setCurrentLogin(currentLogin);
        setCurrentPassword(currentPassword);
    }

    public void check()
    {
        boolean f=true;
        while(f)
        {
            Scanner scanner= new Scanner(System.in);
            System.out.print("Login: ");
            String tempLog=String.valueOf(System.console().readLine());
            System.out.print("Password: ");
            String tempPas=String.valueOf(System.console().readPassword());
            if(currentLogin.equals(tempLog)&& currentPassword.equals(tempPas))
            {
                System.out.println("Hello, "+currentLogin);
                f=false;
            }
            else
            {
               System.out.println("Please check that you have entered your login and password correctly.");
            }

        }
    }
}


