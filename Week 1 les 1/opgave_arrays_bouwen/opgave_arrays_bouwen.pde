int[] getallen1 = {1,2,3,4,5};
int[] getallen2 = {6,7,8,9,10};


void setup(){
printArray(opgetelt(getallen1,getallen2));
}



void draw(){
  
}

int[] opgetelt(int[] array1,int[] array2)
{
 int getallen[] = {};
 
 for(int i = 0; i < array1.length; i++)
 {
  append(getallen,array1[i] + array2[i]); 
 }
/8*\ /
 return getallen;
 
}