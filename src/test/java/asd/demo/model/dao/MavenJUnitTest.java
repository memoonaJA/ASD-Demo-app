/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asd.demo.model.dao;

import asd.demo.model.User;
import asd.demo.model.Users;
import com.mongodb.client.MongoDatabase;
import java.net.UnknownHostException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Memoona Anwar DZ
 */
public class MavenJUnitTest {
    private static MongoDBConnector mdb;
    
    public MavenJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() throws UnknownHostException{
        System.out.println("\n<-- Starting test -->"); 
        String name = "dbuser";
        String password = "helloworld99";
        mdb = new MongoDBConnector(name,password);
                
    }
    @Test 
    public void testMongoDBConnect() throws UnknownHostException { 
        Assert.assertNotNull("Cannot establish connection to MDB",mdb.getMongoDB());
        System.out.println("\n- Connecting to MongoDB "); 
    }
      @Test
    public void testGetMongoDB() {
        System.out.println("getMongoDB");
        MongoDBConnector instance = null;
        MongoDatabase expResult = null;
        MongoDatabase result = instance.getMongoDB();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showall method, of class MongoDBConnector.
     */
    @Test
    public void testShowall() {
        System.out.println("showall");
        Users users = null;
        MongoDBConnector instance = null;
        instance.showall(users);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class MongoDBConnector.
     */
    @Test
    public void testAdd_User() {
        System.out.println("add");
        User user = null;
        MongoDBConnector instance = null;
        instance.add(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showUsers method, of class MongoDBConnector.
     */
    @Test
    public void testShowUsers() {
        System.out.println("showUsers");
        MongoDBConnector instance = null;
        instance.showUsers();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadUsers method, of class MongoDBConnector.
     */
    @Test
    public void testLoadUsers() {
        System.out.println("loadUsers");
        MongoDBConnector instance = null;
        Users expResult = null;
        Users result = instance.loadUsers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of user method, of class MongoDBConnector.
     */
    @Test
    public void testUser() {
        System.out.println("user");
        String email = "";
        String password = "";
        MongoDBConnector instance = null;
        User expResult = null;
        User result = instance.user(email, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class MongoDBConnector.
     */
    @Test
    public void testAdd_int_int() {
        System.out.println("add");
        int a = 0;
        int b = 0;
        MongoDBConnector instance = null;
        int expResult = 0;
        int result = instance.add(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of subtract method, of class MongoDBConnector.
     */
    @Test
    public void testSubtract() {
        System.out.println("subtract");
        int a = 0;
        int b = 0;
        MongoDBConnector instance = null;
        int expResult = 0;
        int result = instance.subtract(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
