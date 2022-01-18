

public class Serie implements Entregable {

	private String titulo, creador, genero;
	private int numtemp = 3;
	private boolean entregado = false;
	
	
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getNumtemp() {
		return numtemp;
	}

	public void setNumtemp(int numtemp) {
		this.numtemp = numtemp;
	}

	public Serie() {
		super();
		this.titulo = titulo;
		this.creador = creador;
		this.numtemp = numtemp;
		this.entregado = entregado;
		this.genero = genero;
	}

	public Serie(String titulo, String creador) {
		super();
		this.titulo = titulo;
		this.creador = creador;

	}

	public Serie(String titulo, String creador, int numtemp, String genero) {
		super();
		this.titulo = titulo;
		this.creador = creador;
		this.numtemp = numtemp;
		this.genero = genero;
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
			if(this.numtemp > ((Serie) a).getNumtemp()) {
				return true;
			}else {
				return false;
			}
		}
		
	

	
	

	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", creador=" + creador + ", numtemp=" + numtemp + ", entregado=" + entregado
				+ ", sexo=" + genero + "]";
	}

	
	
	
	
	
}
