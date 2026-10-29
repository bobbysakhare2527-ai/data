public class Main{
    public static void main(String args[]){
        Shape shape = new Shape();
        double rectangleArea=shape.area(6,7);
        double rectanglePerimeter=shape.perimeter(6,7);
        System.out.println("Rectangle area:"+rectangleArea+"and perimeter is:"+rectanglePerimeter);

        double squareArea = shape.area(89);
        double squarePerimeter = shape.perimeter(89);
        System.out.println(+squareArea+"||"+ squarePerimeter);


        double circleArea = shape.area(66);
        double circlePerimeter = shape.perimeter(66);
        System.out.println(+circleArea+"||"+circlePerimeter);
    }
}