import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declarar las variables
		Scanner sc = null;

		String clave; // Este sera nuestra llave para nuestro hashMap
		String marca;
		float precio;

		Perfumes perfume = null;

		int menuP, subMenu;

		// Instancia de clase
		Implementacion im = new Implementacion();

		do {
			System.out.println("MENU PRINCIPAL PERFUMES");
			System.out.println("1.-ALTA DE PERFUMES");
			System.out.println("2.-MOSTRAR PERFUMES");
			System.out.println("3.-BUSCAR PERFUMES");
			System.out.println("4.-EDITAR PERFUMES");
			System.out.println("5.-ELIMINAR");
			System.out.println("6.-SALIR");

			sc = new Scanner(System.in);
			menuP = sc.nextInt();

			switch (menuP) {
			case 1:
				System.out.println("Ingrese la clave del perfume: ");
				sc = new Scanner(System.in);
				clave = sc.nextLine();

				System.out.println("Ingrese la marca del perfume: ");
				sc = new Scanner(System.in);
				marca = sc.nextLine();

				System.out.println("Ingrese el precio del perfume: ");
				sc = new Scanner(System.in);
				precio = sc.nextLong();

				// Crear el objeto
				perfume = new Perfumes(clave, marca, precio);

				// Guardar
				im.guardar(perfume);
				System.out.println("Se guardo con exito.");

				break;

			case 2:
				im.listar();
				break;

			case 3:
				System.out.println("REGISTRO DE PERFUMES");
				im.listar();

				System.out.println("INGRESE EL NUMERO DE PERFUMES A BUSCAR: ");
				sc = new Scanner(System.in);
				clave = sc.nextLine();

				// Buscar
				perfume = new Perfumes(clave);
				perfume = im.buscar(perfume);
				System.out.println("Se encontro: " + perfume);
				break;

			case 4:
				System.out.println("REGISTRO DE PERFUMES");
				im.listar();

				try {
					System.out.println("Ingrese la clave del perfume a editar");
					sc = new Scanner(System.in);
					clave = sc.nextLine();

					// Buscar
					perfume = new Perfumes(clave);
					perfume = im.buscar(perfume);
					System.out.println("Se encontro el producto a editar " + perfume);

					// Submenu para editar --- precio y marca
					do {
						System.out.println("SUBMENU PARA EDITAR");
						System.out.println("1---PRECIO");
						System.out.println("2---MARCA");
						System.out.println("3---REGRESAR");

						sc = new Scanner(System.in);
						subMenu = sc.nextInt();
						
						switch (subMenu) {
						case 1:
							System.out.println("Ingrese el nuevo precio: ");
							sc = new Scanner(System.in);
							precio = sc.nextFloat();

							// Actualizacion
							perfume.setPrecio(precio);
							System.out.println("Se edito correctamente.");
							break;

						case 2:
							System.out.println("Ingrese la marca");
							sc = new Scanner(System.in);
							marca = sc.nextLine();

							// Actualizacion
							perfume.setMarca(marca);
							im.editar(perfume);
							System.out.println("Se edito exitosamente.");
							break;

						case 3:
							break;
						}

					} while (subMenu < 3);
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Error al buscar para editar." + e.getMessage());
				}

				break;

			case 5:
				System.out.println("Ingrese la clave a eliminar: ");
				sc = new Scanner(System.in);
				clave = sc.nextLine();

				// Eliminacion
				perfume = new Perfumes(clave);
				im.eliminar(perfume);
				System.out.println("Se elimino correctamente.");
				break;
			case 6:

				break;

			}

		} while (menuP < 6);
		System.out.println("BYEEEEEEEEEEEEEEEEEEEEEEEEEEE");
	}

}
