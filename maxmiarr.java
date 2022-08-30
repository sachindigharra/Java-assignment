public class maxmiarr {
    public static void main(String[] args){
        int [] marks={12,10,6,9,3,5,19};
        for(int i=0;i<marks.length;i++){
            int maxi=marks[0];
            int temp=0;
            if(maxi>marks[i]){
                temp=marks[i];
                marks[i]=maxi;
                maxi=temp;

            } 
            System.out.println("maximum number "+marks[marks.length-1]);
            System.out.println("minimum number "+marks[0]);
        }
        
    }
    
}
