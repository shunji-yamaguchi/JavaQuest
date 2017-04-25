/**
 * list7-9に示す、for文を使ったプログラムを、while文だけを使うように修正してください。
 * list7-9
 * public class Graph1{
 *     public static void main(String[] args){
 *         for(int i = 0; i < 10; i++){
 *             for(int j = 0; j < i * i; j++){
 *                 System.out.print("*");
 *             }
 *             System.out.println("");
 *         }
 *     }
 * }
 */

public class Q7_2 {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        while (i < 10) {
            j = 0;
            while (j < i * i) {
                System.out.print("*");
                j++;
            }
            System.out.println("");
            i++;
        }
    }
}
