public class temp{
	public  static void invertArray(int [] v) {
	int  temp,  k;
	for ( int  i = 0 ;  i < v.length/2 ;  i++ ) {
		k= v.length-1 -i;temp = v[i];
		v[i]    = v[k]; 
		v[k]   = temp;
		}
	}
		public  static void  main(String[]  args) {
			int [] x = { 4 , 3 , 7 , 4 , 9 } ;
			invertArray( x );
		}
	}