
public class swexpert_3131 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		for(int i=1; i<=1000000; i++){
			int count =0;
			for(int j=1; j<=i; j++){
				if(i%j ==0){
					count +=1;					
				}
				if(count>2)
					break;
			}
			if(count ==2)
				sb.append(count+" ");
		}
		System.out.println(sb);
	}

}
