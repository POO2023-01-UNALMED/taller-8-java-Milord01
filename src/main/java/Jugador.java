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
	public int compareTo(Futbolista jugador) {
	int d=getEdad()-jugador.getEdad();
		return Math.abs(d);

//return super.compareTo(jugador);
	}

//manos
@Override
	public boolean jugarConLasManos() {
		return false;
}

//set y get
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

//toString
public String toString(){
    return "El futbolista" +getNombre()+ " tiene "+getEdad()+ ", y juega de "+getPosicion()+"con el dorsal"+ getDorsal()+". Ha marcado"+getGolesMarcados();
}
}

