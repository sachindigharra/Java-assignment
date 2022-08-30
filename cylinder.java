class clyinder_getset{
    private float height;
    private float radius;
    public void setHeight(float height){
        this .height=height;
    }
    public float getHeight(){
        return height;

    }
    public void setRadius(float radius ){
    this.radius=radius;
    }
    public float getRadius(){
        return radius;
    }
}
public class cylinder {
    public static void main(String[] args) {
        clyinder_getset data =new clyinder_getset();
        data.setHeight(5.3f);
        data.setRadius(2.5f);
        float lenth=data.getHeight();
        float dia=data.getRadius();
        float volume =3.14f*(dia*dia)*lenth;
        System.out.printf("the volume of cylinder %.2f%n ",volume);
        double surface=2*3.140f*dia*lenth;
        System.out.printf("the surface area %.2f",surface);

        
    }
    
}
