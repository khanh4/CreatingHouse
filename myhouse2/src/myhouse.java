import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.canvas.*;
import javafx.scene.paint.Color;
import javafx.scene.Group;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polyline;
import javafx.scene.shape.Rectangle;

public class myhouse extends Application {
  
Group group;
GraphicsContext gc;
public static void main(String args[])
   {
// launch the application
launch(args);
   }
  
   public void start(Stage sc) throws Exception
   {
       // set title for the stage
       sc.setTitle("House");
       // creating the house with the measurments of the scene.
       Canvas house = new Canvas(600.0f, 800.0f);
       gc = house.getGraphicsContext2D();   
       group = new Group(house);
       draw1();
       // create a scene
       Scene scene = new Scene(group, 600, 800);
       sc.setScene(scene);
       sc.show();
   }
  
   public void draw1()
   {
//getting the sky color and points
    gc.setFill(Color.LIGHTBLUE);
    gc.fillRect(0, 0, 600, 250);

//lawn color and points
    gc.setFill(Color.GREEN);
    gc.fillRect(0, 250, 600, 600);
  
//creating  A triangle
    Polyline triangle = new Polyline();
    triangle.getPoints().addAll(new Double[]
    {300.0, 0.0, 550.0, 150.0,50.0, 150.0,300.0, 0.0, }); 
    triangle.setStroke(Color.BLACK);
    triangle.setFill(Color.WHITE);
    group.getChildren().add(triangle);
  
//rectangle below the triangle
    Rectangle rect = new Rectangle(70, 150, 460, 30);
    rect.setFill(Color.WHITE);
    rect.setStroke(Color.BLACK);
    group.getChildren().add(rect);
  
//rectabgle brown / wall
    rect = new Rectangle(70, 180, 460, 330);
    rect.setFill(Color.RED);
    rect.setStroke(Color.BLACK);
    group.getChildren().add(rect);

//For the window in the middle
    rect = new Rectangle(260, 210, 80, 50);
    rect.setFill(Color.LIGHTGRAY);
    rect.setStroke(Color.BLACK);
    group.getChildren().add(rect);
  
//This is for door 1 and the pillar
    rect = new Rectangle(125, 295, 80, 165);
    rect.setFill(Color.WHITE);
    rect.setStroke(Color.BLACK);
    group.getChildren().add(rect);
    doorblacks(142, 310);
    pillar(80, 180);
  
//This is for door 2 and pillar 2
    rect = new Rectangle(260, 275, 80, 190);
    rect.setFill(Color.WHITE);
    rect.setStroke(Color.BLACK);
    group.getChildren().add(rect);
    doorblacks(277, 310);
    pillar(215, 180);
  
//This is for door 3 and pillar 3
    rect = new Rectangle(395, 295, 80, 165);
    rect.setFill(Color.WHITE);
    rect.setStroke(Color.BLACK);
    group.getChildren().add(rect);
    doorblacks(412, 310);
    pillar(350, 180);
    pillar(485, 180);
  
//This is for the rectangle below doors
    rect = new Rectangle(70, 460, 460, 5);
    rect.setFill(Color.LIGHTGRAY);
    rect.setStroke(Color.BLACK);
    group.getChildren().add(rect);
  
    stairs(120, 460);

      
   }
  
    public void doorblacks(int x, int y)
    {
    Rectangle rect;
  
    for(int i = 0, j=0; i<5; i++, j+=30)
    {
    rect = new Rectangle( x, y+j, 15, 25 ); 
    rect.setFill(Color.BLACK);
    rect.setStroke(Color.BLACK);
    group.getChildren().add(rect);
  
    rect = new Rectangle( x+30, y+j, 15, 25 ); 
    rect.setFill(Color.BLACK);
    rect.setStroke(Color.BLACK);
    group.getChildren().add(rect);
  
}
}
  
public void pillar(int x, int y)
{
    Rectangle rect;
    int width=35, height=270;
  
    rect = new Rectangle( x, y, width, height ); 
    rect.setFill(Color.WHITE);
    rect.setStroke(Color.BLACK);
    group.getChildren().add(rect);
  
    rect = new Rectangle( x-5, y+height, 45, 10 ); 
    rect.setFill(Color.WHITE);
    rect.setStroke(Color.BLACK);
    group.getChildren().add(rect);
  
//circles
    Circle circle1 = new Circle();
//Setting UP THE CIRCLES
    int radius=11;
    circle1.setFill(Color.WHITE);
    circle1.setStroke(Color.BLACK);
    circle1.setRadius(radius);
    circle1.setCenterX(x);
    circle1.setCenterY(y+radius);
    group.getChildren().add(circle1);

    Circle circle2 = new Circle();
//Setting UP THE OTHER CIRCLES   
    circle2.setFill(Color.WHITE);
    circle2.setStroke(Color.BLACK);
    circle2.setRadius(radius);
    circle2.setCenterX(x+width);
    circle2.setCenterY(y+radius);
    group.getChildren().add(circle2);
   
}
  
public void stairs(int x, int y)
{
    Rectangle rect;
    int width=360, height=10;
  
    for(int i=1; i<=11; i++)
    {
        rect = new Rectangle(x, y, width, 10);
        rect.setFill(Color.GRAY);
        rect.setStroke(Color.BLACK);
        group.getChildren().add(rect);   
        x= x-10; //it will decrease the value by 10
        y= y+height; //this one will increase the value for the stairs
        width = width + 20; //increase the width 
    }   
    

  }
   
   
}