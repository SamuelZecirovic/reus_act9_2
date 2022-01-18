
public class Videojuego implements Entregable {

	private String titulo, genero, compañia;
	private int horas = 10;
	private boolean entregado = false;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getCompañia() {
		return compañia;
	}
	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	
	public Videojuego() {
		super();
	}
	
	public Videojuego(String titulo, int horas) {
		super();
		this.titulo = titulo;
		this.horas = horas;
	}
	
	public Videojuego(String titulo, String genero,int horas, String compañia) {
		super();
		this.titulo = titulo;
		this.genero = genero;
		this.compañia = compañia;
		this.horas = horas;
	}
	
	public void entregar() {
		entregado = true;
	}

	public void devolver() {
		entregado = false;
	}

	public boolean isEntregado() {
		return entregado;
	}

	public boolean compareTo(Object a) {
		if(this.horas > ((Videojuego) a).getHoras()) {
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "Videojuego [titulo=" + titulo + ", genero=" + genero + ", compañia=" + compañia + ", horas=" + horas
				+ ", entregado=" + entregado + "]";
	}
	
	
	
	

	
	
	
	
}
