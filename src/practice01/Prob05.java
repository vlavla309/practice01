package practice01;

import java.util.ArrayList;
import java.util.List;

public class Prob05 {

	public static void main(String[] args) {
		for(int i=1; i<100; i++) {
			int count = getCount(i);
			if(count>0) {
				System.out.print("\n"+i+" ");
				for(int j=0; j<count; j++)
					System.out.print("짝");
			}
		}
	}
	
	public static int getCount(int num) {
		int count=0;
		do{
			int tsn=num%10;
			if(tsn==3 || tsn==6 || tsn==9)count++;
			num/=10;
		}while(num>0);
		
		return count;
	}

}
