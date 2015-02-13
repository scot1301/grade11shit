import processing.core.*;
import g4p_controls.*;
import javax.swing.*;
import java.util.Random;

//change name of class:
public class Drawing extends PApplet
{
        Random r;
        GButton btn1, btn2;
        String color = "orange";
        PImage mountain;
        
	public void setup()
	{
		size(800, 600, JAVA2D);
                btn1 = new GButton(this, 10, 10, 80, 40);
                btn1.setText("Reset Background");
                btn2 = new GButton(this, 120, 10, 80, 40);
                btn2.setText("Change Color");
                mountain = loadImage("mountain.png");
	}

	public void handleButtonEvents(GButton button, GEvent event) 
	{
            if(button==btn1)color = "orange";
            if(button==btn2)color = "black";
		
	}		

	public void draw()
	{
            
            if (color=="orange"){
                for(int e = 1; e<1;e++){
                    background(r.nextInt(255),r.nextInt(255),r.nextInt(255));
                }
            }
            
            if (color=="black")background(0);
            //image(mountain,200, 300);
                
          r = new Random();
            for(int i = 1; i<2000; i++){
                int x = r.nextInt(800) + 1;
		int y = r.nextInt(600) + 1;
		
                fill(r.nextInt(255),r.nextInt(255),r.nextInt(255));
		ellipse(x, y, 10, 10);
            }
            
            /*
                fill(0,255,0);
                ellipse(600, 100, 52, 52);
                fill(100,100,255);
                rect(50, 400, 60, 100);
                
                
                //custom shape
                beginShape();
                vertex(450, 150);
                vertex(500, 50);
                vertex(75, 25);
                vertex(500, 350);
                vertex(500, 250);
                endShape(CLOSE);*/
	}



}