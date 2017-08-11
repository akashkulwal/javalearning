 
 public class TriangleStar
 {
	 public static void main(String args[])
	 {
		 int i,j,k;
		 for(i=1;i<=5;i++)
		 {
			 for(j=1;j<i;j++)
			 {
				 System.out.print("  ");
			 }
			 for(k=i;k<i*2;k++)
			 {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
	 }
 }