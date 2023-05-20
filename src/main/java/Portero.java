package futbol;

public class Portero extends Futbolista{
	public short golesRecibidos;
	public byte dorsal;
	public final String posicion="Portero";

	public Portero (short golesR, byte dorsal,String nombre, int edad, String posicion) {
		 super(nombre, edad, posicion);
		 this.dorsal=dorsal;
		 this.golesRecibidos=golesR;
	 }
	
@Override
public boolean jugarConLasManos() {
	return true;
}

@Override
public int compareTo(Futbolista o) {
	return super.compareTo(o);
}

public byte getDorsal() {
	return dorsal;
}
public short getGolesRecibidos() {
	return golesRecibidos;
}
 
public void setDorsal(byte dorsal) {
	this.dorsal = dorsal;
}
public void setGolesRecibidos(short golesRecibidos) {
	this.golesRecibidos = golesRecibidos;
}

}
