/**
 * Created by alanjri on 15-8-17.
 *
 * 利用字符重复出现的次数，编写一个方法，实现基本的字符串压缩功能，比如，字符
 * 串aabcccccaaa变成a2b1c5a3.若压缩后字符串没有变短，则返回原先的字符串
 */
public class Compress {

    public String compressBad(String str){
        String mystr = "";
        char last = str.charAt(0);
        int count = 1;
        for (int i = 1; i < str.length(); i++){
            if (str.charAt(i) == last){
                count++;
            }
            else {
                mystr = mystr + last + "" + count;
                last = str.charAt(i);
                count = 1;
            }
        }

        return mystr + last + count;
    }

    public String compressBetter(String string){

        /*先判断是否压缩失败*/
        int size = countCompression(string);
        if (size >= string.length()){
            return string;
        }

        StringBuffer mystr = new StringBuffer();
        char last = string.charAt(0);
        int count = 1;
        for (int i = 0; i < string.length(); i++){
            if(string.charAt(i) == last){
                count++;
            } else {
                mystr.append(last);
                mystr.append(count);
                last = string.charAt(i);
                count = 1;
            }
        }

        mystr.append(last);
        mystr.append(count);
        return mystr.toString();
    }

    public int countCompression(String string){
        int count = 2;
        char last = string.charAt(1);
        /*字符相同不计算,last后移，字符不同count++*/
        for (int i = 0; i < string.length(); i++ ){
            if (string.charAt(i) != last ){
                count = count + 2;
                last = string.charAt(i);
            }
        }

        return count;
    }
}
