int getal1, getal2;
float resultaat;

void setup() {
  getal1 = 5;
  getal2 = 2;
  println(floatDelen(getal1,getal2));


}

float floatDelen(int nummer1,int nummer2) {
  float getala = float(nummer1);
  float getalb = float(nummer2);
  return getala / getalb; 
}