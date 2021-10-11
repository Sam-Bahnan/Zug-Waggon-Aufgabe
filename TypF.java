class TypF extends Transportwagen {
  public TypF(int pGesamtgewicht, char pZielgebiet) {
    super(pGesamtgewicht, pZielgebiet);
    this.zgg = 65;
    this.leergewicht = 13;
    if (getGesamtgewicht() < 65) {
      this.defekt = true;
    } else {
      this.defekt = false;
    }
  }

  public void auskunft() {

    System.out.println("Dies ist ein Wagen vom TypF, er hat ein Gesamtgewicht von " + getGesamtgewicht()
        + " Tonnen und sein zulässiges Gesamtgewicht beträgt" + getZgg() + "Tonnen");
    if (this.defekt = true) {
      System.out.println("(Dieser Wagon ist zu schwer und darf nicht in betrieb genommen werden)");
    }
  }
}