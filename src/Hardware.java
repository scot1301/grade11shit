import processing.core.*;
import g4p_controls.*;
import javax.swing.*;

//change name of class:
public class Hardware extends PApplet
{
    GButton btnCpu, btnmother, btnram, btnvideo, btnpower, btnhard, btnoptical;
    GTextArea info;
    String[] string;
    PImage picture;
	public void setup()
	{
		size(640, 480, JAVA2D);
                string = new String[6];
                btnCpu = new GButton(this, 10, 10, 80, 50);
                btnCpu.setText("CPU");
                btnmother = new GButton(this, 100, 10, 80, 50);
                btnmother.setText("MotherBoard");
                btnram = new GButton(this, 190, 10, 80, 50);
                btnram.setText("Ram");
                btnvideo = new GButton(this, 280, 10, 80, 50);
                btnvideo.setText("Video Card");
                btnpower = new GButton(this, 370, 10, 80, 50);
                btnpower.setText("Power Supply");
                btnhard = new GButton(this, 460, 10, 80, 50);
                btnhard.setText("Hard Disk");
                btnoptical = new GButton(this, 550, 10, 80, 50);
                btnoptical.setText("Optical Drive");
                info = new GTextArea(this,50,100,200,100);

	}

	public void handleButtonEvents(GButton button, GEvent event) 
	{
             if(button==btnCpu){
                 info.setText("CPU - Central Processing Unit processes inputs and converts to output as well as it performs all calculations.");
                 picture=loadImage("cpu.gif");
             }
             else if(button==btnmother){
                 info.setText("MotherBoard - ");
                 picture=loadImage("motherboard.gif");
             }
             
             else if(button==btnram){
                 info.setText("");
                 picture=loadImage("ram.gif");
             }
             
             else if(button==btnvideo){
                 info.setText("");
                 picture=loadImage("videoCard.gif");
             }
             
             else if(button==btnpower){
                 info.setText("");
                 picture=loadImage("powerSupply.gif");
             }
             
             else if(button==btnhard){
                 info.setText("");
                 picture=loadImage("hardDisk.gif");
             }
             
             else if(button==btnoptical){
                 info.setText("");
                 picture=loadImage("opticalDrive.gif");
             }
		
	}		

	public void draw()
	{
		background(255); //white
                if(picture!=null){
                    image(picture,300,100);
                }
	}



}