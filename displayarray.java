public class displayarray {
    public static void main(String[] args){
        int [] marks={99,80,43,59,10,55};
        for (int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
        // display in reverse order
        for (int j=marks.length-1;j>=0;j--){
            System.out.printf("%d ",marks[j]);
        }
        //for Each loop
        for(int element:marks){
            System.out.printf("%d ",element);
        }
    }
    
}
