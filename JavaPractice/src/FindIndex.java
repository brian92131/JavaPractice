import java.util.Arrays;

public class FindIndex {


    public static void main(String args[]){

        Integer[] arr = {12,3,4,55,2,333,566};
        System.out.println(index(arr , 333));


    }

    public static Integer index(Integer[] a, Integer n){

        return Arrays.asList(a).indexOf(n);

    }
}