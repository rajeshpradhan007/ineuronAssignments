
class HelloWorld {
    public static void main(String[] args) {
        for(int i=1;i<=8;i++){
            for(int j=1;j<=14;j++){
                if(j<i+1 || j > 14-i){
                    System.out.print("*");
                }else{
                    System.out.print("@");    
                }
            }
            System.out.print("\n");
        }
    }
}
