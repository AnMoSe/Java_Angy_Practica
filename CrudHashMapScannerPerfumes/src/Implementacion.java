import java.util.HashMap;

public class Implementacion implements Metodos {

	// Declarar el hashMap --SINTAXIS
	HashMap<String, Perfumes> hashMapPerfumes = new HashMap<String, Perfumes>();

	@Override
	public void guardar(Perfumes perfume) {
		// TODO Auto-generated method stub
		hashMapPerfumes.put(perfume.getClave(), perfume);

	}

	@Override
	public void listar() {
		// TODO Auto-generated method stub
		System.out.println(hashMapPerfumes);

	}

	@Override
	public Perfumes buscar(Perfumes perfume) {
		// TODO Auto-generated method stub
		return hashMapPerfumes.get(perfume.getClave());
	}

	@Override
	public void editar(Perfumes perfume) {
		// TODO Auto-generated method stub
		hashMapPerfumes.put(perfume.getClave(), perfume);

	}

	@Override
	public void eliminar(Perfumes perfume) {
		// TODO Auto-generated method stub
		hashMapPerfumes.remove(perfume.getClave());

	}

}
