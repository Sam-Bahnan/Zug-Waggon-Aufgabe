public abstract class Transportwagen {

private int gesamtgewicht;
private char zielgebiet;
int leergewicht;
int zgg;
boolean defekt;
//zzg = zulässiges Gesamtgewicht
public Transportwagen(int pGesamtgewicht, char pZielgebiet){

gesamtgewicht = pGesamtgewicht;
zielgebiet = pZielgebiet;


}
public abstract void auskunft();

public int getGesamtgewicht(){
return gesamtgewicht;

}

public char getZielgebiet(){
return zielgebiet;
  
}

public int getLeergewicht(){
return leergewicht;
  
}

public int getZgg(){
return zgg;
  
}
}