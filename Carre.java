public class Carre extends Cote4Figure{


    public Carre(double cote){

        super(cote, cote);
    }

public static void main(String[] args){

    Figure  carre = new Carre(20);
    System.out.println(carre.getSides());
    System.out.println(carre.getPerimeter());
    System.out.println(carre.getSurface());
    System.out.println(carre instanceof  Cote4Figure);
    System.out.println(carre instanceof  Figure);
    System.out.println(carre instanceof  Shape);
    System.out.println(carre instanceof  Carre);


}
}