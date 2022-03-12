class PrimeCheck
{
	public boolean primeNumberCheck(int num){
		
	int temp;
	boolean isPrime=true;

	for(int i=2;i<=num/2;i++)
	{
           temp=num%i;
	   if(temp==0)
	   {
	      isPrime=false;
	      break;
	   }
	}
	return isPrime;
	}
	
	public static void main(String[] args) {
		PrimeCheck check = new PrimeCheck();
		
		System.out.println(check.primeNumberCheck(7));
		
	}
}