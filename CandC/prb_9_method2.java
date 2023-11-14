package CandC;

import java.util.ArrayList;
import java.util.List;


public class prb_9_method2 {

	public static void main(String[] args) {
		 List<List<Integer>> list = new ArrayList<List<Integer>>();
	        List<Integer> row , pre = null;
	        for(int i = 0; i < 5; i++){
	            row = new ArrayList<Integer>();
	            for(int j = 0; j <= i; j++){
	                if( j == 0 || j == i){
	                    row.add(1);
	                }else{
	                    row.add(pre.get(j-1) + pre.get(j));
	                }
	            }
	            pre = row;
	            list.add(row);
	        }
	        for(List<Integer> l:list) {
	        	for(Integer i:l)
	        	System.out.print(i);
	        System.out.println("");
	        }
	        System.out.println(list); 
	}

}
