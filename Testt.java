class Testt{

	public static void main(String args[]){
		Testt t= new Testt();
		t.Positivenegative();
		t.Evenodd();
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
}