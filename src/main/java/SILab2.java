import java.util.ArrayList;     //1
import java.util.List;          //2
                                //3
public class SILab2 {           //4
                                //5
    public static List<String> function(List<String> list) {                                //6
        if (list.size() <= 0) {                                                             //7
            throw new IllegalArgumentException("List length should be greater than 0");     //8
        }                                                                                   //9
        int n = list.size();                                                                //10
        int rootOfN = (int) Math.sqrt(n);                                                   //11
        if (rootOfN * rootOfN  != n) {                                                      //12
            throw new IllegalArgumentException("List length should be a perfect square");   //13
        }                                                                                   //14
        List<String> numMines = new ArrayList<>();                                          //15
        for (int i = 0; i < n; i++) {                                                       //16
            if (!list.get(i).equals("#")) {                                                 //17
                int num = 0;                                                                //18
                if ( (i % rootOfN != 0 && list.get(i - 1).equals("#")) || (i % rootOfN != rootOfN - 1 && list.get(i + 1).equals("#")) ) {       //19
                    if ( (i % rootOfN != 0 && list.get(i - 1).equals("#")) && (i % rootOfN != rootOfN - 1 && list.get(i + 1).equals("#")) ){    //20
                        num += 2;                                                                                                               //21
                    }                                                                                                                           //22
                    else {                                                                                                                      //23
                        num  += 1;                                                                                                              //24
                    }                                                                                                                           //25
                }                                                                                                                               //26
                if (i - rootOfN >= 0 && list.get(i - rootOfN).equals("#")){                                                                     //27
                    num++;                                                                                                                      //28
                }                                                                                                                               //29
                if (i + rootOfN < n && list.get(i + rootOfN).equals("#")){                                                                      //30
                    num++;                                                                                                                      //31
                }                                                                                                                               //32
                numMines.add(String.valueOf(num));                                                                                              //33
            }                                                                                                                                   //34
            else {                                                                                                                              //35
                numMines.add(list.get(i));                                                                                                      //36
            }                                                                                                                                   //37
        }                                                                                                                                       //38
        return numMines;                                                                                                                        //39
    }                                                                                                                                           //40
}