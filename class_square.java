class square{
    public int area(int a){

        return a*a;

    }
    public int parameter(int side){
        return 4*side;
    }
}
public class class_square {
    public static void main(String[] args) {
        square cal=new square();
        int sq_area=cal.area(5);
        System.out.println(sq_area);
        int ad_side=cal.parameter(3);
        System.out.println(ad_side);
        
    }
    
}
