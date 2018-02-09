Damsteen[] damstenen = new Damsteen[]{new Damsteen(100, 100, #FFFFFF, 50), new Damsteen(200, 200, #FFFFFF, 50), new Damsteen(300, 300, #000000, 50), new Damsteen(400, 400, #000000, 50)};

void setup() {
  size(1000, 1000);
}


void draw() {


  for (int i = 0; i < damstenen.length; i++)
  {
    damstenen[i].tekendamstenen();
  }
}


class Damsteen {
  int xpos;
  int ypos;
  color Color;
  int diameter;

  Damsteen(int x, int y, color colour, int diameter) {
    this.xpos = x;
    this.ypos = y;
    this.Color = colour;
    this.diameter = diameter;
  }

  void tekendamstenen() {

    fill(this.Color);
    ellipse(this.xpos, this.ypos, this.diameter, this.diameter);
  }
}