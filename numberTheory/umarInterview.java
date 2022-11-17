// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int row = s.nextInt();
        int columns = 3;
        
        for(int i = 0; i<row; i++)
        {
            if(i == 0)
            { 
                for(int j = 0; j <columns/2; j++)
                {
                    System.out.print(" ");
                }
                 System.out.print("1");
             }
            else
            {
                for(int j = 0; j<columns; j++)
                {
                    if(j== 0)
                        System.out.print("2");
                    else if(j==1)
                     System.out.print("1");
                    else if(j==2)
                     System.out.print("2");       
                }
            }
            System.out.println();
        }
    }
}
