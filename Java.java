public class javachallenge {

    public static void selReverse(int[] A, int N){
        int[] myarray = new int[20];
        int[] newarray = new int[A.length];
        int n = 3;
        // for (int i=0;i<20;i++){

        //     System.out.println(i);
        //     myarray[i]=i;

        // }

        // System.out.println("myfunc");
        // System.out.println(myarray);

        // for (int j=0;j<20;j++){

        //     System.out.println(myarray[j]);
        
        // }
        int count=0;
        if (N > A.length){
            for (int j=A.length-1;j>-1;j--){
                // System.out.println("********");
                // System.out.println(myarray[j]);
                newarray[count]=A[j];
                // System.out.println("count: "+count);
                // System.out.println("newarray: "+newarray[count]);
                // System.out.println("myarray: "+myarray[j]);
    
                count+=1;
                // System.out.println("********");
            
            }



        }

        else if (N==0) {
            for (int l=0;l<A.length;l++){
                System.out.println(N);
                System.out.println("value is "+l);
                System.out.println("my myarray: "+myarray[l]);
                newarray[l] = A[l];
                System.out.println("my newarray: "+newarray[l]);
                
                // System.out.println("newarrays: "+newarray[l]);
                // System.out.println("myarray: "+myarray[l]);
            
            }


        
        }
        else {

            for (int j=N-1;j>-1;j--){
                // System.out.println("********");
                // System.out.println(myarray[j]);
                newarray[count]=A[j];
                // System.out.println("count: "+count);
                // System.out.println("newarray: "+newarray[count]);
                // System.out.println("myarray: "+myarray[j]);
    
                count+=1;
                // System.out.println("********");
            
            }
    
            // for (int k=0;k<N;k++){
    
            //     System.out.println("newarray: "+newarray[k]);
              
            
            // }
    
            //  System.out.println("--------------");
            for (int l=N;l<A.length;l++){
                System.out.println(N);
                System.out.println("value is "+l);
                System.out.println("my myarray: "+myarray[l]);
                newarray[l] = A[l];
                System.out.println("my newarray: "+newarray[l]);
                
                // System.out.println("newarrays: "+newarray[l]);
                // System.out.println("myarray: "+myarray[l]);
            
            }
            System.out.println("--------------");
        }

        for (int m=0;m<A.length;m++){

            // newarray[l] = myarray[l];
            System.out.println("newarray: "+newarray[m]);
            // System.out.println("myarray: "+myarray[k]);
        
        }



    }
    public static void main(String[] args) {
        System.out.println("Hello world..!!!");
        // int[] myarray = new int[20];
        // int n = 3;
        // for (int i=0;i<myarray.length;i++){

        //     // System.out.println(i);
        //     myarray[i]=i;

        // }
        int[] array1 = {1,2,3,4,5,6};
        int[] array2 = {2,4,6,8,10,12,14,16};
        int[] array3 = {5,7,2,6,0,4,6};

        // selReverse([1,2,3,4,5,6], 2)



        // selReverse([2,4,6,8,10,12,14,16], 3) 
        
        
        
        // selReverse([5,7,2,6,0,4,6], 100)
        selReverse(array1, 2);
        selReverse(array2, 3);
        selReverse(array3, 100);
    }
    
}
