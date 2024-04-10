
public class Perfumes {
	private String clave; //Este sera nuestra llave para nuestro hashMap
	private String marca;
	private float precio;
	
	public Perfumes() {
		
	}

	//Constructor con la llave
	public Perfumes(String clave) {
		this.clave = clave;
	}

	public Perfumes(String clave, String marca, float precio) {
		this.clave = clave;
		this.marca = marca;
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Perfumes [clave=" + clave + ", marca=" + marca + ", precio=" + precio + "]\n";
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
}
