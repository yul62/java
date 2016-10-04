package kr.ac.kookmin.cs.twobutton;

/**
 * Created by 조유리 on 2016-10-02.
 */
public class MyMinimum extends MyValues {
    @Override
    float getResult(int[] list) {
        int min = 100000;
        for(int value : list)
            if(min > value)
                min = value;
        return min;
    }
}
