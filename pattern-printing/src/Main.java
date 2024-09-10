//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //  square/rectangle
//      for(int i=1; i<=3; i++) {
//          for(int j=1; j< 5; j++) {
//              System.out.print("*");
//          }
//          System.out.println("");
//      }


        // hollow square or rectangle
//        int m = 4;
//        int n = 5;
//        for(int i=1; i<=4; i++) {
//            for(int j=1; j<=5; j++){
//                if(i==1 || j==1 || i==4 || j==5){
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println(" ");
//        }

        // right angled triangle

//        for(int i=1; i<=4; i++){
//            for (int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println("");
//        }

        //upside down of right angled triangle
//        for(int i=5; i>=1; i--){
//            for (int j=i; j>=1; j--){
//                System.out.print("*");
//            }
//            System.out.println("");
//        }

        //top right of right angled triangle
//        int n = 4;
//        for(int i=1; i<=n; i++){
//           for (int j=1; j<=n-i; j++){
//                  System.out.print(" ");
//              }
//            for (int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println("");
//            }

        // right angled triangle using numbers
//        int n=5;
//        for ( i=1; i<=5; i++){
//            for (j=1;j<=i; j++) {
//                System.out.print(j);
//            }
//            System.out.println("");
//        }


        // floyds triangle
//         int counter=1;
//        for ( i=1; i<=5; i++){
//            for (j=1;j<=i; j++) {
//                System.out.print(counter+" ");
//                counter++;
//            }
//            System.out.println("");
//        }

        //triangle using zero and one

//               for ( i=1; i<=5; i++){
//           for (j=1;j<=i; j++) {
//               int sum = i+j;
//             if(sum%2 == 0) {
//                 System.out.print("1");
//             } else {
//                 System.out.print("0");
//             }
//                }
//            System.out.println("");
//        }


        //   ADVANCED PATTERNS

        //butterfly pattern
//        int n = 4;
//        for(int i=1; i<5; i++){
//           for(int j=1; j<=i; j++){
//               System.out.print("*");
//           }
//            int space=2*(n-i);
//            for (int j=1; j<=space; j++) {
//               System.out.print(" ");
//           }
//            for (int j=1;j<=i; j++) {
//                System.out.print("*");
//            }
//            System.out.println("");
//       }
//        for(int i=1; i<=4; i++){
//            for(int j=4; j>=i; j--){
//                System.out.print("*");
//            }
//            int space=2*(n-i);
//            for (int j=5; j>=space; j--) {
//                System.out.print(" ");
//            }
//            for (int j=4;j>=i; j--) {
//                System.out.print("*");
//            }
//            System.out.println("");
//        }

        // solid rombus

//        int hole = 5;
//        for(int i=1; i<=5; i++) {
//            int space = hole-i;
//            for (int j=1; j<=space; j++) {
//                System.out.print(" ");
//            }
//            for (int j=1; j<=hole; j++) {
//                System.out.print("*");
//            }
//            System.out.println("");
//            }
//        }

      // pyramid
//        int hole = 5;
//        for (int i=1; i<=5; i++) {
//           int space = hole-i;
//           for (int j=1; j<=space; j++){
//               System.out.print(" ");
//           }
//           for (int j=1; j<=i; j++){
//               System.out.print(i+" ");
//           }
//            System.out.println("");
//        }

        // palindromic pyramid
//         int n= 5;
//        for (int i=1; i<=n; i++) {
//            int spaces = n-i;
//            for (int j=1; j<=spaces; j++) {
//                System.out.print(" ");
//            }
//            for (int j=i; j>=1; j--){
//                    System.out.print(j);
//            }
//            for (int j=2; j<=i; j++){
//                System.out.print(j);
//            }
//
//            System.out.println("");
//        }


        // Diamond pattern
        int n=4;
        for (int i=1; i<=4; i++){
            int space = n-i;
            for (int j=1; j<=space; j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            for( int j=2; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        int a = 4;
        for (int i=4;i>=1; i--) {
        int space = a-i;
        for (int j=1;j<=space; j++) {
            System.out.print(" ");
        }
        for (int j=1;j<=i; j++) {
            System.out.print("*");
        }
        for (int j=1; j<=i-1; j++) {
            System.out.print("*");
        }
            System.out.println("");
        }
    }
    }
