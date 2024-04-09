package unidad4;

import java.util.ArrayList;
import java.util.List;

import unidad4.model.ClienteDO;

public class listas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int listNumeros[] = new int[10];

		List<Integer> listaNumeros = new ArrayList<Integer>();
		List<String> listaNombres = new ArrayList<String>();
		List<String> listaNombres2 = new ArrayList<String>();
		List<Character> listaNombre = new ArrayList<Character>();

		List<ClienteDO> listaClientes = new ArrayList<ClienteDO>();
		List<ClienteDO> listaClientes2 = new ArrayList<ClienteDO>();

		ClienteDO cliente1 = new ClienteDO(-1, "juan", "perez", 23, 'M', "email@email2.com", "passswuord");
		ClienteDO cliente2 = new ClienteDO(-1, "juan2", "perez2", 23, 'M', "email@email2.com", "passswuord");
		ClienteDO cliente3 = new ClienteDO(-1, "juan3", "perez3", 23, 'M', "email@email2.com", "passswuord");
		ClienteDO cliente4 = new ClienteDO(-1, "juan4", "perez4", 23, 'M', "email@email2.com", "passswuord");
		ClienteDO cliente5 = new ClienteDO(-1, "juan5", "perez5", 23, 'M', "email@email2.com", "passswuord");

		listaClientes.add(cliente1);
		listaClientes.add(cliente2);

		listaClientes.add(1, cliente3);

		listaClientes2.add(cliente4);
		listaClientes2.add(cliente5);

		System.out.println("El cliente en la posicion 2 es " + listaClientes.get(1));

		System.out.println(listaClientes2);

		listaNombres.add("juanjo");
		listaNombres.add("juanjo2");
		listaNombres.add("juanjo3");
		listaNombres.add("pepe");

		listaNombres2.add("juanjo3");
		listaNombres2.add("pepe");

		listaNombres2.subList(3, 9);

		System.out.println("La lista2 contiene " + listaNombres);

		System.out.println("Juanjo esta en la lista? " + listaNombres.contains("juanjo2"));

		int posicionJuanjo2 = listaNombres.indexOf("juanjo2");

		System.out.println("Enla posicion " + posicionJuanjo2 + " esta " + listaNombres.get(posicionJuanjo2));

		listaNombres.remove(1);

		System.out.println("Juanjo esta en la lista? " + listaNombres.contains("juanjo2"));

		// listaNombres.clear();

		listaNombres.retainAll(listaNombres2);

		System.out.println("Lista despues del retainall" + listaNombres);

		// Cantidad de elementos de una lista se saca con size
		System.out.println("La lista 1 tiene " + listaNombres.size() + " elementos");
	}

}
