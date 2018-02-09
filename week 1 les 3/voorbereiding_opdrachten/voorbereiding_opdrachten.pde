Damsteen damsteen1 = new Damsteen(100,100,#FFFFFF,50);
Damsteen damsteen2 = new Damsteen(200,200,#000000,50);
Damsteen damsteen3 = new Damsteen(500,200,123,50);
void setup(){
    size(1000,1000);
    
}


void draw(){
  damsteen1.tekendamstenen();
  damsteen2.tekendamstenen();
  damsteen3.tekendamstenen();
}


class Damsteen{
 int xpos;
 int ypos;
 color Color;
 int diameter;
 
 Damsteen(int x,int y,color colour,int diameter){
   this.xpos = x;
   this.ypos = y;
   this.Color = colour;
   this.diameter = diameter;
 }
 
 void tekendamstenen(){
   
   fill(this.Color);
   ellipse(this.xpos,this.ypos,this.diameter,this.diameter);
 }
}