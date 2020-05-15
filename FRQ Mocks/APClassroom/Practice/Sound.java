/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: X/X/20
 * Purpose: X
 */

import java.util.Arrays;

public class Sound {
    private int[] samples = new int[]{0,1,0,0,100, -100, 3};

    public int limitAmplitude(int limit){
        int cnt = 0;
        for (int i = 0; i < samples.length; i++) {
            int amp = samples[i];
            if(amp > limit) {
                samples[i] = limit;
                cnt ++;
            } else if(-amp > limit) {
                samples[i] = -limit;
                cnt ++;
            }
        }
        System.out.println(Arrays.toString(samples));
        return cnt;
    }

    public void trimSilenceFromBeginning(){
        int cnt = 0;

        for (int sample : samples) {
            if (sample != 0) break;
            else cnt++;
        }

        int[] newArr = new int[samples.length-cnt];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = samples[cnt+i];
        }
        samples = newArr;
        System.out.println(Arrays.toString(newArr));
    }

    public static void main(String[] args) {
        Sound s = new Sound();
        s.trimSilenceFromBeginning();
    }
}
