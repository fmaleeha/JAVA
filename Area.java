class Room{
    float x;
    float y;
   void getdata(float x,float y){
       this.x=x;
       this.y=y;
    }
}
class Area{
    public static void main(String args[]){
        Room r1=new Room();
       r1.getdata(10,20);
        float calculatedArea=r1.x*r1.y;
        System.out.println("Area="+calculatedArea);
    }
}