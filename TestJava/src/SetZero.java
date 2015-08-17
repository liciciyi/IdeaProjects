/**
 * Created by alanjri on 15-8-17.
 */
public class SetZero {

    public void setZero(int[][] matirx){
        boolean[] row = new boolean[matirx.length];
        boolean[] column = new boolean[matirx[0].length];

        /*记录值为0的元素的位置*/
        for (int i = 0; i < matirx.length; i++)
            for (int j = 0; j < matirx[0].length; j++){
                if (matirx[i][j] == 0){
                    row[i] = true;
                    column[j] = true;
                }
            }

        for (int i = 0; i < matirx.length; i++)
            for (int j = 0; j < matirx[0].length; j++){
                if(row[i] == true || column[j] == true){
                    matirx[i][j] = 0;
                }
            }

        for (int i = 0; i < matirx.length; i++) {
            System.out.println();
            for (int j = 0; j < matirx[0].length; j++) {
                System.out.print(matirx[i][j] + " ");
            }
        }
    }
}
