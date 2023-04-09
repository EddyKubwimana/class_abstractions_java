public abstract class Figure{
    
    protected int sides;

    public Figure(int sides){
        this.sides = sides;
    }

    public  abstract double getPerimeter();
    public abstract  double getSurface();
    public abstract  double getVolume();

    public int getSides(){
        return this.sides;
    }

}