package futbol;

public class Jugador extends Futbolista{
	
//Atributos
 public short golesMarcados;
 public byte dorsal;
 
//constructor
 public Jugador (short goles, byte dorsal,String nombre, int edad, String posicion) {
	 super(nombre, edad, posicion);
	 this.dorsal=dorsal;
	 this.golesMarcados=goles;
 }

public Jugador () {
	super();
	this.golesMarcados=289;
	this.dorsal=7;
}

//comparar
@Override
	public int compareTo(Futbolista o) {
		return super.compareTo(o);
	}

//manos
@Override
	public boolean jugarConLasManos() {
		return false;
}

public byte getDorsal() {
	return dorsal;
}
public short getGolesMarcados() {
	return golesMarcados;
}

public void setGolesMarcados(short golesMarcados) {
	this.golesMarcados = golesMarcados;
}
public void setDorsal(byte dorsal) {
	this.dorsal = dorsal;
}
}

