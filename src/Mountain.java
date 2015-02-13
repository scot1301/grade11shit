import processing.core.*;
import g4p_controls.*;
import java.util.Random;
import javax.swing.*;

//change name of class:
public class Mountain extends PApplet
{
    Random r;
    GButton btn1, btn2;
    String color = "day";
    PImage creeper;
    int framecount;
    int x1;
    int count;
    boolean isThere, isBlown;
	public void setup()
	{
            
		size(640, 480, JAVA2D);
                btn1 = new GButton(this, 10, 10, 80, 40);
                btn1.setText("Turn Day");
                btn2 = new GButton(this, 120, 10, 80, 40);
                btn2.setText("Turn Night");
                creeper = loadImage("creeper.png");
                x1 = 650;
                isBlown = false;
                isThere = false;
                framecount = 0;
                count = 0;
                
	}

	public void handleButtonEvents(GButton button, GEvent event) 
	{
            if(button==btn1)color = "day";
            if(button==btn2)color = "night";        
	}		

	public void draw()
	{
            
            drawBackground();
            drawBackMountain();
            drawFrontMountain();
            drawSnowyTops();
            drawHouse();
            drawTree();
            mousePressed();
            drawSnow();
            //drawCharacter();
            drawCreeperBoom();
            
            
            
	}

        public void mousePressed(){
            text("x " + mouseX + " ,y " + mouseY ,mouseX,mouseY);
        }
        
        public void drawBackground(){
            if (color=="day"){
                background(150,230,230);
                //sun
                fill(243,255,0);
                ellipse(550, 80, 52, 52);
                x1 = 650;
                isThere = false;
                isBlown= false;
                count =0;
            }
            if (color=="night"){
                background(3,11,46);
                fill(231,205,165);
                ellipse(550, 80, 52, 52);
                
                //draw snow
                r = new Random();
                 for(int i = 1; i<100; i++){
                    int x = r.nextInt(800) + 1;
                    int y = r.nextInt(600) + 1;
                    //draw little snow flakes
                    fill(255);
                    ellipse(x, y, 2, 2);
                }
                 //moon
                fill(231,205,165);
                ellipse(550, 80, 52, 52);
                ellipse(560, 90, 5, 6);
                ellipse(553, 75, 14, 13);
                ellipse(545, 90, 7, 8);
                ellipse(535, 68, 5, 6);
                ellipse(530, 82, 3, 3);
                ellipse(568, 67, 3, 3);
            }
            /*sky
            fill(150,230,230);
            rect(0, 0, 800, 600);*/
            //snow ground
            fill(255);
            rect(0,400,800,100);
            
        }
            
        public void drawBackMountain(){
            fill(68,68,68);
            beginShape();
            vertex(75, 400);
            vertex(130, 148);
            vertex(191, 200);
            vertex(280, 119);
            vertex(383, 260);
            vertex(499, 157);
            vertex(600, 400);
            endShape(CLOSE);
        }
        public void drawFrontMountain(){
            fill(140,140,140);
            beginShape();
            vertex(0, 400);
            vertex(60,154);
            vertex(100, 270);
            vertex(185,118);
            vertex(197, 70);
            vertex(315, 240);
            vertex(369,138);
            vertex(375,180);
            vertex(441, 320);
            vertex(499, 200);
            vertex(542,293);
            vertex(576,176);
            vertex(640, 400);
            endShape(CLOSE);
        }
        public void drawSnowyTops(){
            //first snowy peak
            fill(255);
            beginShape();
            vertex(52,185);
            vertex(60,154);
            vertex(68,179);
            vertex(60, 177);
            endShape(CLOSE);
            //second peak
            beginShape();
            vertex(187,107);
            vertex(197,70);
            vertex(222,106);
            vertex(203,98);
            endShape(CLOSE);
            //third peak
            beginShape();
            vertex(352,169);
            vertex(369,138);
            vertex(374,177);
            vertex(363,163);
            endShape(CLOSE);
            //fourth peak
            beginShape();
            vertex(485,229);
            vertex(499,200);
            vertex(506,216);
            vertex(499,214);
            endShape(CLOSE);
            //fifth peak
            beginShape();
            vertex(568,205);
            vertex(576,176);
            vertex(589,220);
            vertex(579,215);
            vertex(571,223);
            endShape(CLOSE);
        }
        public void drawHouse(){
            fill(69,50,34);
            //house one
            rect(200, 367, 60, 40);
            //door 1
            fill(127,90,51);
            rect(210,377,10,30);
            fill(255,241,125);
            rect(230, 377, 25, 20);
            //roof 1
            fill(125,25,25);
            beginShape();
            vertex(195,370);
            vertex(200,350);
            vertex(260,350);
            vertex(265,370);
            endShape(CLOSE);
            //house two
            fill(69,50,34);
            rect(500, 367, 50, 40);
            //door 2
            fill(127,90,51);
            rect(510,377,10,30);
            fill(255,241,125);
            rect(530, 377, 15, 20);
            
            //roof 2
            fill(125,25,25);
            beginShape();
            vertex(495,370);
            vertex(500,350);
            vertex(550,350);
            vertex(555,370);
            endShape(CLOSE);
            //house three
            fill(69,50,34);
            rect(350, 387, 70, 50);
            //door 3
            fill(127,90,51);
            rect(360,407,10,30);
            fill(255,241,125);
            rect(380, 407, 30, 20);
            //roof 3
            fill(125,25,25);
            beginShape();
            vertex(345,390);
            vertex(350,370);
            vertex(420,370);
            vertex(425,390);
            endShape(CLOSE);
            
            //icicle challenge
            fill(255);
            beginShape();
            vertex(206,370);
            vertex(213,378);
            vertex(218,370);
            vertex(224,374);
            vertex(230,370);
            endShape(CLOSE);
            
            beginShape();
            vertex(240,370);
            vertex(246,378);
            vertex(252,370);
            vertex(258,374);
            vertex(264,370);
            endShape(CLOSE);
            
            beginShape();
            vertex(508,370);
            vertex(514,378);
            vertex(520,370);
            vertex(526,374);
            vertex(532,370);
            endShape(CLOSE);
           
        }
        public void drawTree(){
            //tree trunks
            fill(83,43,0);
            rect(20,371,10,40);
            rect(50,391,10,40);
            rect(90,371,10,40);
            rect(150,397,10,40);
            rect(300,371,10,40);
            rect(450,371,10,40);
            rect(580,391,10,40);
            
            //tree leaves
            fill(15,94,6);
            beginShape();
            vertex(10,397);
            vertex(40,397);
            vertex(25,350);
            endShape(CLOSE);
            
            beginShape();
            vertex(40,417);
            vertex(70,417);
            vertex(55,370);
            endShape(CLOSE);
            
            
            beginShape();
            vertex(80,397);
            vertex(110,397);
            vertex(95,350);
            endShape(CLOSE);
            
            beginShape();
            vertex(140,417);
            vertex(170,417);
            vertex(155,370);
            endShape(CLOSE);
            
            beginShape();
            vertex(290,397);
            vertex(320,397);
            vertex(305,350);
            endShape(CLOSE);
            
            beginShape();
            vertex(440,397);
            vertex(470,397);
            vertex(455,350);
            endShape(CLOSE);
            
            beginShape();
            vertex(570,417);
            vertex(600,417);
            vertex(585,370);
            endShape(CLOSE);
            
            //add name
            fill(0);
            text("Scott Reid", 20, 470);
        }
        public void drawSnow(){
            frameRate(18);
            if (color=="night"){
                //draw snow
                r = new Random();
                 for(int i = 1; i<70; i++){
                    int x = r.nextInt(800) + 1;
                    int y = r.nextInt(410) + 1;
                    //draw little snow flakes
                    fill(255);
                    ellipse(x, y, 3, 3);
                    
                    //Enable this code below to have some fun
                    //image(creeper,x, y);
                }
            }
        }
        public void drawCharacter(){
            if(color=="night"){
                if (x1<50){
                    isThere = true;
                }
                if (isThere==true){
                    
                }else x1 -= 5;
                
                image(creeper,x1, 350);
                
            }
        }
        public void timer(){
            count++;
        }
        public void drawCreeperBoom(){
            
            if(color=="night"){
                if(x1<50){
                    //image(creeper,650,350);
                    timer();
                    if (framecount==(18*2)){
                        
                    }else{
                            if(count>10){
                                fill(80);
                                
                            }else if(count<10){
                                r = new Random();
                                isBlown = true;
                                for(int i = 1; i<70; i++){
                                    int x = r.nextInt(60) + 90;
                                    int y = r.nextInt(120) + 350;
                                    //draw little snow flakes
                                    fill(255);
                                    ellipse(x, y, 15,15);
                                    
                            }
                        }
                    }
                }
            }
            if(isBlown==false){
                drawCharacter();
            }
            else{
                
            }
        }
        
        
}