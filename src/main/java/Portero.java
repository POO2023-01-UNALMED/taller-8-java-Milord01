package futbol;

public class Portero extends Futbolista{
	public short golesRecibidos;
	public byte dorsal;

	public Portero (String nombre, int edad, String posicion, short golesR, byte dorsal) {
		 super(nombre, edad, posicion);
		 this.dorsal=dorsal;
		 this.golesRecibidos=golesR;
	 }
	
@Override
public boolean jugarConLasManos() {
	return true;
}

@Override
public int compareTo(Futbolista portero) {
	int d=this.golesRecibidos-((Portero) portero).getGolesRecibidos();
	return Math.abs(d);
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

//toString
public String toString(){
  return "El futbolista" +getNombre()+ " tiene "+getEdad()+ ", y juega de "+getPosicion()+"con el dorsal"+ getDorsal()+". Le han marcado"+getGolesRecibidos();
}
}
