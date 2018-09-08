public class ModulusAnimation
{
	public static void main( String[] args ) throws Exception
	{
		for ( int i=0; i<80; i++ )
		{
			if ( i%10 == 0 )
				System.out.print(" I .... .... \r");
			else if ( i%10 == 1 )
				System.out.print(" . l... .... \r");
			else if ( i%10 == 2 )
				System.out.print(" . .o.. .... \r");
			else if ( i%10 == 3 )
				System.out.print(" . ..v. .... \r");
			else if ( i%10 == 4 )
				System.out.print(" . ...e .... \r");
			else if ( i%10 == 5 )
				System.out.print(" . .... J... \r");
			else if ( i%10 == 6 )
				System.out.print(" . .... .a.. \r");
			else if ( i%10 == 7 )
				System.out.print(" . .... ..v. \r");
			else if ( i%10 == 8 )
				System.out.print(" . .... ...a \r");
			else if ( i%10 == 9 )
				System.out.print(" I love Java \r");
			Thread.sleep(200);
		}
		
	}
}
