public class Rectangle implements Shape{

    double length;
    double width;
     /*constructor */
    public Rectangle( double len, double wi){
        this.length = len;
        this.width = wi;
    }
    public double perimeter(){
        return (this.length+ this.width)*2;
    }

    public double surface(){

        return this.length*this.width;
    }

    public double volume(double height){

        return this.length*this.width*height;
    }




 public static void main(String[]arr){

     Shape rectangle = new Rectangle(20, 40);
     System.out.println(rectangle.perimeter());

     System.out.println(rectangle.surface());

     System.out.println(rectangle.volume(12));
     
    

    }


 
}