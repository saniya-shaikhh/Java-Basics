class Evenoddpositivenegative{

	public static void main(String args[]){
	Evenoddpositivenegative c= new Evenoddpositivenegative();
		c.Positivenegative();
		c.Evenodd();
}
}

	void Positivenegative(){
		int a=5;
		if (a>0){
			System.out.println("positive");
		}
		else{
			System.out.println("negative");
		}
	}
	void Evenodd(){
		int a=5;
		if (a%2==0){
			System.out.println("even");
		}
		else{
			System.out.println("odd");
		}
	}