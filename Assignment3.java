public class HelloWorld {
    public static void main(String[] args) {
        for(int i=0;i<14;i++){
            for(int j=0;j<14;j++){
                if(i==0 || i==13 || j <7-i || j<i-6){
                    
                    System.out.print("*");
                }else{
                    System.out.print("@");
                }
                
            }
            System.out.print("\n");
        }
    }
}
