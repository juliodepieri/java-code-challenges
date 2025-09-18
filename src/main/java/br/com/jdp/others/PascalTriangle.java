package br.com.jdp.others;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            // first and last elements are always 1
            row.add(1);
            for (int j = 1; j < i; j++) {
                int val = result.get(i - 1).get(j - 1) + result.get(i - 1).get(j);
                row.add(val);
            }
            if (i > 0) {
                row.add(1);
            }
            result.add(row);
        }

        return result;
    }

//    static List<Integer> rowList(int i){
//        List<Integer> ans=new ArrayList<>();
//        int res=1;
//        ans.add(res);
//        for(int c=1;c<i;c++){
//            res=res*(i-c);
//            res=res/c;
//            ans.add(res);
//        }
//        return ans;
//    }
//    public List<List<Integer>> generate(int numRows) {
//        List<List<Integer>> ans=new ArrayList<>();
//        for(int i=1;i<=numRows;i++){
//            ans.add(rowList(i));
//        }
//        return ans;
//    }
}
