package Java_basics_06;

public class Java_concept_58 {
    public static void main(String[] args) {

       int a[]={10,20,30,40,50};

       for (int i=0; i<a.length; i++){
           System.out.println(a[i]);
       }
        System.out.println("ref address "+ a);

        // for (int i=0; i<=a.length; i++) ->when we use = in the for loop we use to get array index exception
        // for loop is searching for a array index and the index values is not available

    }

}
