class Index{
    public static void main(String[] args) {
        Area a = new Area();
        System.out.println("The area is " + a.rectangle(4,2));
        System.out.println("The area of rectangle is " + a.circle(7.0f));
    }
}
class Area{
    int len, bre;
    float r;
    public int rectangle(int len, int bre) {
    
        return len*bre;
    }
    public float circle(float r){
        float areaofcircle = 3.1415f * r*r;
        return areaofcircle;
    }
}