/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author st10220249
 */
public class LoginTest 
{
    
    public LoginTest() 
    {
        Login ll = new Login();
        System.out.print(ll.LoginUser());
    }
    

    @Test
    public boolean testReturnLoginStatus(boolean returnLoginSuccess) 
    {
        String expectedString = "You have successfully logged in ";
        return   returnLoginSuccess = false;
    }
    
}
