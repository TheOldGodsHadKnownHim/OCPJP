package ocpjp._5.string_processing;

import java.util.Arrays;

public class BinarySearch {
	
	static String[] sa = { "aa", "ac", "aaa", "aaaa" };
	static{
		Arrays.sort(sa);
		}
		public static void main(String[] args){
			
			String search = "ab";
			//if(args.length != 0) search = args[0];
			System.out.println(Arrays.binarySearch(sa, search));
			}
		} 
