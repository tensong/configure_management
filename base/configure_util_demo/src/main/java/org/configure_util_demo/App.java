package org.configure_util_demo;

import java.util.Arrays;
import org.configure_util.ConfigUtil;


/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
    {
    	String name = ConfigUtil.getConfiguration().getString("name");
		System.out.println("name:"+name);
		
		String asd = ConfigUtil.getConfiguration().getString("asd");
		System.out.println("asd:"+asd);
		
		String phone_number = ConfigUtil.getConfiguration().getString("phone_numbers");
		System.out.println("getString_______phone_numbers:"+phone_number);
		
		String[] bStrings = ConfigUtil.getConfiguration().getStringArray("phone_numbers");
		System.out.println("getStringArray_______phone_numbers"+Arrays.asList(bStrings));
    }
}
