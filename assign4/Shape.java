class Shape{  
    //Rectangle
    double area(double length, double breadth){
        return length*breadth;
    }

    double perimeter(double length, double breadth){
        return 2*(length+breadth);
    }

    //square
    double area(double height){
        return height*height;
    }

    double perimeter(double height){
        return 4*height;
    }

    //circle
    double area(double radius,boolean circle){
        return Math.PI*radius*radius;
    }
    double perimeter(double radius,boolean circle){
        return Math.PI*2*radius;
    }
}