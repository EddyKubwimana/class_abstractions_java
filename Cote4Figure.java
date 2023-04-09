public abstract class Cote4Figure extends Figure{

    double side1;
    double side2;

    public  Cote4Figure(double side1, double side2){
        super(4);
        this.side1 = side1;
        this.side2 = side2;

    }

    public double getPerimeter(){
       
        return (this.side1+this.side2)*2;
    }

    public double getSurface(){
        return this.side1*this.side2;
    }
    @Override
    public void getVolume(){
        System.out.println(" no volume can be computed because the figure is two D");
    }


}