package pis2;

import java.util.ArrayList;

public class Polinomio {

	ArrayList<Integer> polinomio = new ArrayList<Integer>();
	
	public ArrayList<Integer> suma (ArrayList<Integer> uno, ArrayList<Integer> dos){
		ArrayList<Integer> sol = new ArrayList<Integer>();
		//Return the sum of itself and other polynomial
		//añadir 0 cuando sea de mayor tamaño.
		if (uno.size() > dos.size()){
			for (int i=0; i<=uno.size();i++){
				sol.add(uno.get(i)+dos.get(i));
			}
		}
		else
			for (int i=0; i<=dos.size();i++){
				sol.add(dos.get(i)+uno.get(i));
			}
		return sol;
	}

}
