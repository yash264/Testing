package com.pkb.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Hello world!
 *
 */
@ToString
@Getter
@Setter
@NoArgsConstructor
public class App 
{
	private String app_name;
	private int app_id;
    public static void main( String[] args ) throws IOException
    {
    	display();
        System.out.println( "Hello World!" );
    }
    
    public static void display () throws IOException {
    	
    	App a = new App();
    	a.setApp_id(1);
    	a.setApp_name("yash");
    	
    	ClassLoader loader=Thread.currentThread().getContextClassLoader();
    	InputStream rs=loader.getResourceAsStream("jdbc.properties");
    	Properties p=new Properties();
    	p.load(rs);
    	System.out.println(p.getProperty("jdbc.username"));
    	 
    	
    	System.out.println( a );
    }
}
