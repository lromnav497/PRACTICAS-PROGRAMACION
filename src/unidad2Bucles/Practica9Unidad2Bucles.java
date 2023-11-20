package unidad2Bucles;

public class Practica9Unidad2Bucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 char[][] map = {
		            {'T', 'R', 'R', 'T', 'M', 'D', 'D', 'M'},
		            {'D', 'M', 'D', 'R', 'R', 'T', 'M', 'D'},
		            {'T', 'R', 'M', 'D', 'D', 'R', 'T', 'M'},
		            {'M', 'D', 'D', 'M', 'T', 'R', 'R', 'T'},
		            {'T', 'R', 'R', 'T', 'M', 'D', 'D', 'M'},
		            {'D', 'M', 'D', 'R', 'R', 'T', 'M', 'D'},
		            {'T', 'R', 'M', 'D', 'D', 'R', 'T', 'M'},
		            {'M', 'D', 'D', 'M', 'T', 'R', 'R', 'T'}
		        };

		        int towns = 0, monsters = 0;
		        boolean isConnected = true;

		        for (int i = 0; i < 8; i++) {
		            for (int j = 0; j < 8; j++) {
		                if (map[i][j] == 'T') {
		                    towns++;
		                    if (i < 7 && map[i+1][j] != 'R' && map[i+1][j] != 'T') isConnected = false;
		                    if (j < 7 && map[i][j+1] != 'R' && map[i][j+1] != 'T') isConnected = false;
		                }
		                if (map[i][j] == 'M') monsters++;
		            }
		        }

		        if (isConnected) System.out.println("Las ciudades están conectadas por caminos.");
		        else System.out.println("Las ciudades no están conectadas por caminos.");

		        if (monsters > towns) System.out.println("No hay esperanza, hay más monstruos que ciudades.");
	}

}
