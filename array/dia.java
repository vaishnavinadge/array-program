public static void printStar (int n) {

        int col (n*2) 1;

     for (int i= n; i>= 1; i--) {

          int star (i*2) 1;

          int space = (col star)/2;

for (int j = 1; j<= col; j++){

               if (space>0 && j<n) 
                 { 
                     System.out.print(" ");
                      space--; 
                 }
               else if (space >= 0 && star > 0) 
                {

                     System.out.print("*"); 
                    if (j>n && star == 0) 
                    space++; 
                    System.out.print(" ");
                  star--;

                 }else
                 {
               

                     System.out.println("");
}
}