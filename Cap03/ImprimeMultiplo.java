class ImprimeMultiplo{
	public static void main(String[] args){
		int numMin = 0;
		int numMax = 100;
		int multiplo = 0;
		
		for(int i = numMin ; i < numMax ; i++){
			if(i %3 == 0){
				System.out.println(i+" é múltiplo de 3");
			}
		}
	}
}
