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
public class TaskTest 
{
    
    public TaskTest(String tName) 
    {
        String expectedString = "Add Task Feature";
        String actual= new String();
        assertEquals(expectedString,actual);
    }

    @Test
    public boolean testCheckTaskDescription() 
    {
        String expectedString = "Create add Task ta add task Users";
          
        return(expectedString.length() <= 50);
    }

    @Test
    public void testCreareTaskID() 
    {
        
    }

    @Test
    public void testPrintTaskDeatils() 
    {
        String expectedString = "Mike Smith";
        System.out.println("Mike Smith");
    }

    @Test
    public boolean testReturnTotalhours(boolean returntotalHours) 
    {
        int totalHours = 10;
        return returntotalHours;
    }
    
}
