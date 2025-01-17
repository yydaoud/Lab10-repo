package SelectionSort;

public class SelectionSort 
{

    private int temp;

	/** Creates a new instance of SelectionSort */
    public SelectionSort() {
    }
    
    /* A simple SelectionSort algorithm
     * pre-condition: 
     * post-condition:
     * inputs:
     * outputs:
     * special conditions:
     */    
    public int[] basicSelectionSort(int[] x) {
        for (int i = 0; i < x.length; ++i) {
            for (int j= i+1; j < x.length; ++j) {
                if (x[i] > x[j]) 
                {
                    temp = x[i];
                    x[i] = x[j];
                    x[j] = temp; 
                }
                
            } // end of inner for loop
        } // end of outer for loop
        return x;
    } // end of basicSelectionSort method

    public static void main (String [] args)
    {
        SelectionSort tester = new SelectionSort();

        int[] arr3 = new int[5];
        arr3[0] = 2;
        arr3[1] = -3;
        arr3[2] = 0;
        arr3[3] = -2;
        arr3[4] = 8;
        int[] correct = tester.basicSelectionSort(arr3);

        for (int i = 0; i < correct.length; i++) {
            System.out.print(correct[i] + " ");
        }
        

    }

}



