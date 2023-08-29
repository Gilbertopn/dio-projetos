package smart_tv;

public class Usuario {

	public static void main(String[] args) {
		
		SmartTv smartTv = new SmartTv();
		
		System.out.println("TV Ligada? " + smartTv.ligada);
		System.out.println("Qual canal está? " + smartTv.canal);
		System.out.println("Qual o volume? " + smartTv.volume);
		
		smartTv.mudarCanal(15);
		
		System.out.println("Mudança de Canal " + smartTv.canal);
	}

}
	