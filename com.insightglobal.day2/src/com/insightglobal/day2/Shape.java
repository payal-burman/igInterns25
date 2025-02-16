package com.insightglobal.day2;

public class Shape {
    int length;

    public Shape(int length) {
        this.length = length;
    }
    
    public double calculateArea() {
        return 0;
    }

    public static class Rectangle extends Shape {
       
        int height;

        public Rectangle(int length, int height) {
            super(length); 
            this.height = height;
        }

        @Override
        public double calculateArea() {
            return length * height; 
        }
    }

   
    public static class Square extends Shape {
        
        public Square(int length) {
            super(length); 
        }

        @Override
        public double calculateArea() {
            return length * length; 
        }
    }

    
    public static class Triangle extends Shape {
        
        int height;

        public Triangle(int length, int height) {
            super(length); 
            this.height = height;
        }

        @Override
        public double calculateArea() {
            return 0.5 * length * height; 
        }
    }

   
    public static class TestShape {
        public static void main(String[] args) {
            
            Shape[] shapes = new Shape[4];

            shapes[0] = new Rectangle(5, 10); 
            shapes[1] = new Square(4); 
            shapes[2] = new Triangle(6, 8); 
            shapes[3] = new Rectangle(7, 3); 

           
            for (Shape shape : shapes) {
                System.out.println("Area is : " + shape.calculateArea());
               
            }
        }
    }
}
