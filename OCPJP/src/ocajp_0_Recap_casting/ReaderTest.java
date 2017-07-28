package ocajp_0_Recap_casting;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;


interface Classic {
	
	int version = 1;
	public void read() ; 
	}  

class MediaReader implements Classic{
	
	int version = 2;
	public void read() {
		//Insert code here  
		System.out.println(Classic.version);		
		System.out.println(((Classic)this).version);		
		System.out.println(this.version);		

		} 
	}
public class ReaderTest{
	public static void main(String[] args) {
		MediaReader mr = new MediaReader();
		mr.read();
	}}
