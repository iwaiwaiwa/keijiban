package check;

import java.io.UnsupportedEncodingException;

public class ByteCheck{
		
	public static boolean check(String name, String text){
		try{
			if( name.getBytes("Windows-31J").length>20 || 
				text.getBytes("Windows-31J").length>2000 ||
				text.length()==0
			)
			{
				return true;
			}
			
			
		}catch(UnsupportedEncodingException e){}
		return false;
	}
	
	public static boolean check(String title, String name, String text){
		try{
			if( title.getBytes("Windows-31J").length>100 || 
				name.getBytes("Windows-31J").length>20 || 
				text.getBytes("Windows-31J").length>2000 ||
				text.length()==0
			)
			{
				return true;
			}
			
			
		}catch(UnsupportedEncodingException e){}
		return false;
	}
}