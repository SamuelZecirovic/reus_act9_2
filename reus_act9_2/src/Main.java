public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Serie series[] = new Serie [5];
		series[0] = new Serie();	
		series[1] = new Serie("titulo2","creador2");	
		series[2] = new Serie("titulo3","creador3",3,"genero3");	
		series[3] = new Serie("titulo4","creador4",4,"genero4");	
		series[4] = new Serie("titulo5","creador5",5,"genero5");	

		Videojuego videojuegos[] = new Videojuego [5];
		videojuegos[0] = new Videojuego();	
		videojuegos[1] = new Videojuego("titulo2",20);	
		videojuegos[2] = new Videojuego("titulo3","genero3",30,"compañia3");	
		videojuegos[3] = new Videojuego("titulo4","genero4",40,"compañia4");	
		videojuegos[4] = new Videojuego("titulo5","genero5",50,"compañia5");
		
		series[3].entregar();
		series[4].entregar();
		videojuegos[3].entregar();
		videojuegos[4].entregar();
			
		series[4].devolver();
		videojuegos[4].devolver();
		
		int mayortemp = 0,mashoras = 0, cont = 0;
		
		Serie mayorserie = null;
		Videojuego mayorvideojuego = null;
		
		System.out.println("series: ");
		for (int i = 0; i < series.length; i++) {
			if (series[i].getNumtemp() > mayortemp ) {
				mayorserie = series[i];
			}
			if (series[i].isEntregado() == true) {
				cont += 1;
			}
			System.out.println(series[i].toString());
		}
		
		System.out.println("\n videojuegos: ");
		for (int i = 0; i < videojuegos.length; i++) {
			if (videojuegos[i].getHoras() > mashoras ) {
				mayorvideojuego = videojuegos[i];
			}
			if (videojuegos[i].isEntregado() == true) {
				cont += 1;
			}
			System.out.println(videojuegos[i].toString());
		}
		
		System.out.println("\nse han entregado "+ cont + " series y videojuegos");
		System.out.println("la serie con mas temporadas es: " + mayorserie.toString());
		System.out.println("el juego con mas horas es: " + mayorvideojuego.toString());

	}

}
