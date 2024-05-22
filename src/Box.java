public class Box {

    public double volume(int width, int height , double depth){
        return width*height*depth;
    }
    public static void main(String[] args){
        Box b1 = new Box();
        System.out.println("Volume of the Box is : " + b1.volume(13,18,15));
    }
}
