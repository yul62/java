package kr.ac.kookmin.cs.twobutton;

/**
 * Created by 조유리 on 2016-10-02.
 */
public class MyAverage extends MyValues {
    @Override
    float getResult(int[] list) {
        float avg=0;
        for(int value:list){
            avg += value;
        }
        avg/=list.length;
        return avg;
    }
}
