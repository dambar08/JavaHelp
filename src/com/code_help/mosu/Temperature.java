package com.code_help.mosu;

import static org.junit.Assert.assertEquals;

public class Temperature {


     public static void main(String[] args) {
         System.out.println(temperatureDifference(new int[]{2,4,2,4,4,5,3,2}));
//         assertEquals(temperatureDifference(new int[]{2,4,2,4,4,5,3,2}), 2);
     }

     public static int temperatureDifference(int[] weatherData) {
         double maxDiff = 0;
         int index=  -1;
         for(int i=1;i<weatherData.length;i++) {
             double difference = Math.abs(weatherData[i] - weatherData[i-1]);
             if(difference > maxDiff) {
                 maxDiff = difference;
                 index = i;
             }
         }
         return index;

     }
}
