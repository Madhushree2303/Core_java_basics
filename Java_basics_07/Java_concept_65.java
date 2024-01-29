package Java_basics_07;

public class Java_concept_65 {
    public static void main(String[] args) {

      //1D array
        int [] a= {1,2};
        a[0]= 10;

        int c[]=new int[2];

        int b[]={10,20,30};

        //2D array

        int [][] num=new int[2][2];
        int num2[][]=new int[2][2];

        // row starts from 0 to 1
        // col starts from 0 to 1

        //0,0 0,1
        //1,0 1,1
        //initializing first array / 1st row
        num[0][0]=10;
        num[0][1]=20;

        //initializing second array / 2nd row
        num[1][0]=30;
        num[1][1]=40;

        for (int i=0; i<a.length; i++){
            for (int j=0; j<num.length; j++){
                System.out.println(num[i][j]+"\t");
            }
            System.out.println("");
        }


    }
}
