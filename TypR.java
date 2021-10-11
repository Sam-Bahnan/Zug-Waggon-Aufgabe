class TypR extends Transportwagen {
  public TypR(int pGesamtgewicht, char pZielgebiet) {
    super(pGesamtgewicht, pZielgebiet);
    this.zgg = 20;
    this.leergewicht = 2;
    if (getGesamtgewicht() < 20) {
      this.defekt = true;
    } else {
      this.defekt = false;
    }
  }

  public void auskunft() {

    System.out.println("Dies ist ein Wagen vom TypR, er hat ein Gesamtgewicht von " + getGesamtgewicht()
        + " Tonnen und sein zulässiges Gesamtgewicht beträgt" + getZgg() + "Tonnen");

    if (this.defekt = true) {
      System.out.println("(Dieser Wagon ist zu schwer und darf nicht in betrieb genommen werden)");
    }
  }
}