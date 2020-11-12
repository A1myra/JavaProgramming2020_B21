package day21_WhileLoop;

public class ContinueStatement {

    public static void main(String[] args) {

        for(int i=1; i<=50; i++){
            if(i%2==0){
                continue;
            }
            System.out.print(i+" ");
        }

        System.out.println();
        System.out.println("=============================================");


        for(int i=1; i<=50; i++){
            if(i%2!=0){
                continue;
            }
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("=============================================");

        for(int i=1; i<=50; i++){
            if(i%3!=0) {
                continue;
            }
            System.out.print(i+" ");
        }



    }
}
