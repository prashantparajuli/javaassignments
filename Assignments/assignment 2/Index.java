/* Assignment 2: Create a class called Sum having two  data members fn and sn and two functions setData(float, float)
to initialize these fields and getSum() to return the sum of two numbers . WAP to test your class.*/
class Index{
    public static void main(String[] args) {
        Sum s= new Sum();
        s.setData(10.0f, 20.5f);
        float tot = s.getSum();
        System.out.println("Sum is: "+tot);
    }
}
class Sum{
    float fn;
    float sn;
    public void setData(float fn, float sn) {
        this.fn =fn;
        this.sn =sn;
    }
    public float getSum() {
        return (fn+sn);
    }
}