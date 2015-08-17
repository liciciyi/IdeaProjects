/**
 * Created by alanjri on 15-8-17.
 *
 * 给定一副N*N的矩阵表示的图像，其中每个像素的大小为4字节，编写一个方法，将图像旋转90度，
 * 不占用额外的内存空间能否做到。
 */
public class Rotate {

    public void Rotate(int[][] matrix, int n){

        for (int layer = 0; layer < n/2; ++layer){
            int first = layer;
            int last = n - 1 - layer;
            for (int i = first; i < last; i++){
                int offest = i- first;
                int top = matrix[first][i];

                matrix[first][i] = matrix[last - offest][first];

                matrix[last - offest][first] = matrix[last][last - offest];

                matrix[last][last - offest] = matrix[i][last];

                matrix[i][last] = top;

            }
        }

        for (int i = 0; i < matrix.length; i++) {
            System.out.println();
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
    }
}
