public class Aggregation {
    public static void main(String args []){
        for (int i=1;i<=4;i++){
            for (int j=1;j<=4;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=8;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int i=1;i<=4;i++){
            for (int j=1;j<=6;j++){
                if (j!=6){
                    System.out.print(" " );
                }
                else {
                    System.out.print("*");
                }

            }
            System.out.println();
        }
        for(int i=1;i<=5;i++){
            for (int j=i;j<=4;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println("");
        }
        }
    }
