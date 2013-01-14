public class rectangle
{
    
    private int length;
    private int width;
    
    public rectangle() {
        length = 0;
        width = 0;
    }

    public rectangle(int l, int w) {
        length = l;
        width = w;
    }
    
    public int getLength() {
        return length;
    }
    
    public int getWidth() {
        return width;
    }
    
    public int computeArea () {
        int a = (length * width);
        return a;
    }

    public int computePerimeter () {
        int p = (length + length) + (width + width);
        return p;
    }
    
    public void drawRectangle (){
        for (int i = 1; i <= width; i++) {
            for (int j = 1; j <= length; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    public boolean squareTest () {
        if (length == width)
            return true;
        else 
            return false;
    }
}
