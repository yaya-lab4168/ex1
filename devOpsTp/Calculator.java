class Calculator {
	
	static int somme( int p1, int p2){
		
		return (p1 + p2);
		
	}
	
		static int sub( int p1, int p2){
			return (p1 - p2);

}
		
		static int div( int p1, int p2){
			return (p1 / p2);

		}
		
	public static void main(String[] args) {
		
		int a = 5;
		int b = 6;
		
		System.out.println("somme de a et b est : " +somme(a,b));
		System.out.println("Soustraction de a et b de  est : " +sub(a,b));
		System.out.println("division de a et b de  est : " +div(a,b));
		

  }

}
