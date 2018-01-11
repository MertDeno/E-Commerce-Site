 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mertd
 */
@ManagedBean(name = "loginBean")
@SessionScoped
public class Login {
    private String userName;
    private String password1;
    private String message;                         //After the registration,we want from users to login.

    public String getPassword() {
        return password1;
    }

    public void setPassword(String password1) {
        this.password1 = password1;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    public String login() {                     //To Login Our Website,You should use down informations else it will return error
        if (userName.equals("AAAA1996") && password1.equals("Mert#123"))
            return "success1";
        else
            this.message="Invalid Password or Username";
            return null;
    }
    
    public String getBack(){            //If the user wants to get back,the page will return the previous page
        return "index";
    }
}
