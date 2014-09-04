	

    import java.util.Scanner;
    public class SymmetricNumbersRange {
     
            public static boolean checkSymmetricity(int number){
                    if (Integer.toString(number).equals(new StringBuilder(Integer.toString(number)).reverse().toString()))
                    return true;
                else
                    return false;
            }
           
            public static void main(String[] args) {
                    Scanner input = new Scanner(System.in);
                    int start = input.nextInt();
                    int end = input.nextInt();
                    input.close();
                    for(int number = start ; number<=end ; number++){
                            if(checkSymmetricity(number)==true){
                                    System.out.print(number);
                                    if(number!=end) System.out.print(" ");
                            }
                    }
            }
     
    }


