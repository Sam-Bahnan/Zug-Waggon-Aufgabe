public class Zug {
  private static Transportwagen[] wagen = { new TypR(9, 'E'), new TypS(24, 'G'), new TypF(48, 'A'), new TypS(24, 'B'),
      new TypF(59, 'F'), new TypR(14, 'C') };

  public static void main(String[] args) {
   

    
    
    for (int i = 0; i < wagen.length; i++) {
      wagen[i].auskunft();

    }
  }

}