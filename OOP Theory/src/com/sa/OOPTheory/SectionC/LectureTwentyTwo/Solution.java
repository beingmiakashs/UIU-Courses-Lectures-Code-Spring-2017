package com.sa.OOPTheory.SectionC.LectureTwentyTwo;

import com.sa.OOPTheory.SectionC.LectureNineteen.ThreadRunnable;

import java.util.ArrayList;

/**
 * Created by akashs on 4/24/17.
 */
public class Solution {

//    public static void printArray(int[] array){
//        for(int element : array){
//            System.out.print(element+" ");
//        }
//        System.out.println("");
//    }
//
//    public static void printArray(double[] array){
//        for(double element : array){
//            System.out.print(element+" ");
//        }
//        System.out.println("");
//    }


    public static <M> void printArray(M[] array){
        for(M element : array){
            System.out.print(element+" ");
        }
        System.out.println("");
    }

    public static < N extends Comparable<N> > N
    findMax(ArrayList<N> list){

        N max = list.get(0);
        for(N item : list){
            if(item.compareTo(max) > 0){
                max = item;
            }
        }

        return max;

    }

    public static void main(String[] args)
    {



        Integer[] a = {1 ,2 , 3, 4, 5};
        ArrayList<Integer> ar = new ArrayList<Integer>();
        ar.add(10);
        ar.add(10);
        ar.add(10);
        ar.add(10);
        System.out.println(findMax(ar));


        ArrayList<Double> ard = new ArrayList<Double>();
        ard.add(10.1);
        ard.add(10.5);
        ard.add(10.7);
        ard.add(10.0);
        System.out.println(findMax(ard));

        Laptop laptop;
        //ArrayList<Laptop> laptops = new ArrayList<>();
        //System.out.println(findMax(laptops));


        System.out.println("Integer Array: ");
        printArray(a);

        Double[] da = {1.1 ,2.52 , 30.21, 4.01, 5.0};
        System.out.println("Integer Array: ");
        printArray(da);


        ThreadRunnable tr = new ThreadRunnable(){
            @Override
            public void run() {
                super.run();
            }
        };


    }
}

class Laptop<T,Z,Y,E>{

}

