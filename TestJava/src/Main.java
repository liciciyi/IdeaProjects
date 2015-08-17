import sun.rmi.runtime.Log;

/**
 * Created by alanjri on 15-7-23.
 * <p>
 * 编写一个方法，将字符串中的空格全部替换为“%20”，假定该字符串尾部有足够的空间存放新增的字符，并且知道字符串的真实长度。
 */
public class Main {

    public static void main(String[] args) {

        int[][] matirx = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };


        for (int i = 0; i < matirx.length; i++) {
            System.out.println();
            for (int j = 0; j < matirx[0].length; j++) {
                System.out.print(matirx[i][j] + " ");
            }
        }

        Rotate rotate = new Rotate();
        rotate.Rotate(matirx,4);

    }

    public static void replaceSpace(char[] str, int length) {
        int spaceCount = 0, newLengh, i;
        /*第一次扫描出空格数量*/
        for (i = 0; i < length; i++) {
            if (str[i] == ' ') {
                spaceCount++;
            }
        }

        newLengh = length + spaceCount * 2;
        str[newLengh] = '\0';//补全字符串结束标志
        for (i = length - 1; i >= 0; i--) {
            if (str[i] == ' ') {
                str[newLengh - 1] = '0';
                str[newLengh - 2] = '2';
                str[newLengh - 3] = '%';
                newLengh = newLengh - 3;
            } else {
                str[newLengh - 1] = str[i];
                newLengh = newLengh - 1;
            }
        }

        for (i = 0; i < newLengh; i++) {
            System.out.print(str[i]);
        }
    }

}

