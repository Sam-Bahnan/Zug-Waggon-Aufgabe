class TypS extends Transportwagen {
  public TypS(int pGesamtgewicht, char pZielgebiet) {

    super(pGesamtgewicht, pZielgebiet);
    this.zgg = 25;
    this.leergewicht = 10;
    if (getGesamtgewicht() < 25) {
      this.defekt = true;
    } else {
      this.defekt = false;
    }
  }








  public void auskunft() {

    
    System.out.println("Dies ist ein Wagen vom TypS, er hat ein Gesamtgewicht von " + getGesamtgewicht()
        + " Tonnen und sein zulässiges Gesamtgewicht beträgt" + getZgg() + "Tonnen");

    if (this.defekt = true) {
      System.out.println("(Dieser Wagon ist zu schwer und darf nicht in betrieb genommen werden)");
    }
  }
}
