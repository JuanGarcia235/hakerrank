package com.hackerrank.genahanoi.junit;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.junit.Test;

/**
 * @author Juan-PC
 *
 */
public class Assertions {

	
	@Test
	public void test() {
		
		/**
		 * test get file data
		 */		
		try {
			System.setIn(new FileInputStream(System.getProperty("user.dir") + "/" + "in.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block	
			e.printStackTrace();
		}
		
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        
        
        System.out.println(n);
        
        assertNotNull(n);
        
        in.close();
		
	}
}
