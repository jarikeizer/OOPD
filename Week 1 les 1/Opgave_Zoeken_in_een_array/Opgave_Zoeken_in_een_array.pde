int[] getallen = {1,2,3,4,5,6,7,8,9,10};
int getal = 1212;
void setup(){

}
void draw(){
  if(komtGetalVoorIn(getal,getallen))
  {
    println("Hij komt voor"); 
  }
  else
  {
    println("Hij komt niet voor");
  }
}

boolean komtGetalVoorIn(int getal,int[] getallen)
{
  boolean komtvoor = false;
  
  for(int i = 0; i < getallen.length; i++)
  {
     if(getallen[i] == getal)
     {
      komtvoor = true; 
     }
  }
  
 return komtvoor; 
}