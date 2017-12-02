public class PictureMaker
{
    private TurtleWorld world;
    private Turtle fred;
    
    public PictureMaker()
    {
        world = new TurtleWorld(500, 500, "Picture Maker");
        fred = new Turtle();
    }
    
    public void display() {
        world.display();
    }
    
    public void erase() {
        world.removeTraces();
        world.removeTurtles();
    }
 
    public void drawInitials() 
    {
        world.dropIn(fred);
        
        fred.penUp();
        fred.left(90);
        fred.forward(200);
        fred.left(90);
        fred.forward(200);
        fred.left(180);
        
        fred.penDown();
        fred.forward(175);
        fred.left(-90);
        fred.forward(100);
        fred.penUp();
        fred.right(90);
        fred.forward(175);
        fred.right(90);
        fred.forward(100);
        fred.right(180);
        fred.penDown();
        fred.forward(100);
        fred.left(90);
        fred.forward(50);
        fred.left(90);
        fred.forward(20);
        
        fred.penUp();
        fred.left(90);
        fred.forward(50);
        fred.left(90);
        fred.forward(100);
        fred.left(70);
        fred.penDown();
        fred.forward(186);
        fred.right(140);
        fred.forward(100);
        fred.left(140);
        fred.forward(100);
        fred.right(140);
        fred.forward(186);
        
        world.removeTurtle(fred);
    }
    /**
     * Draw a pentagon with variable size
     */
   public void drawPentagon(int length)
   {
       world.dropIn(fred);
       fred.penDown();
       fred.left(18);
       fred.forward(length);
       fred.right(72);
       fred.forward(length);
       fred.right(72);
       fred.forward(length);
       fred.right(72);
       fred.forward(length);
       fred.right(72);
       fred.forward(length);
       world.removeTurtle(fred);
    }
     /**
     * Draw a hexagon with variable size
     */
   public void drawHexagon(int length)
   {
       world.dropIn(fred);
       fred.penDown();
       fred.left(30);
       fred.forward(length);
       fred.right(60);
       fred.forward(length);
       fred.right(60);
       fred.forward(length);
       fred.right(60);
       fred.forward(length);
       fred.right(60);
       fred.forward(length);
       fred.right(60);
       fred.forward(length);
       world.removeTurtle(fred);
    }
    /**
     * Draw both polygons in different colours
     */
    public void polygons(int length)
    {
        fred.setColor(Color.blue);
        drawPentagon(length);
        fred.setColor(Color.red);
        drawHexagon(length);
    }
    
   
       
       
}

