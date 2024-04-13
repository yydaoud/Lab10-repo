import org.junit.*; 
import SelectionSort.*;

public class testSelectionSort 
{
    SelectionSort sorter = new SelectionSort();

    @Test
    public void test() {
        testPositive();
        testNegative();
        testMixed();
        testDuplicates();
    }

    public testSelectionSort() {
    }
    
    public void testPositive(){
        int[] arr1 = new int[5];
        arr1[0] = 8;
        arr1[1] = 9;
        arr1[2] = 7;
        arr1[3] = 10;
        arr1[4] = 2;
        
        int[] Sortedarr1 = new int[5];
        Sortedarr1[0] = 2;
        Sortedarr1[1] = 7;
        Sortedarr1[2] = 8;
        Sortedarr1[3] = 9;
        Sortedarr1[4] = 10;

        Assert.assertArrayEquals(sorter.basicSelectionSort(arr1), Sortedarr1);
        
        /** add tests to check for this unit test **/
    }
    
    public void testNegative()
    {
        int[] arr2 = new int[5];
        arr2[0] = -8;
        arr2[1] = -9;
        arr2[2] = -7;
        arr2[3] = -10;
        arr2[4] = -2;
        
        int[] Sortedarr2 = new int[5];
        Sortedarr2[0] = -10;
        Sortedarr2[1] = -9;
        Sortedarr2[2] = -8;
        Sortedarr2[3] = -7;
        Sortedarr2[4] = -2;

        Assert.assertArrayEquals(sorter.basicSelectionSort(arr2), Sortedarr2);
        
        
        /** Test data contains negative values only **/
    }
    
    public void testMixed()
    {
        int[] arr3 = new int[5];
        arr3[0] = 8;
        arr3[1] = 9;
        arr3[2] = -7;
        arr3[3] = -10;
        arr3[4] = -2;
        
        int[] Sortedarr3 = new int[5];
        Sortedarr3[0] = -10;
        Sortedarr3[1] = -7;
        Sortedarr3[2] = -2;
        Sortedarr3[3] = 8;
        Sortedarr3[4] = 9;

        Assert.assertArrayEquals(sorter.basicSelectionSort(arr3), Sortedarr3);
        
        /** Test data contains with both positive, negative and zeros **/
    }
    
    public void testDuplicates()
    {
        int[] arr3 = new int[5];
        arr3[0] = 8;
        arr3[1] = 8;
        arr3[2] = -7;
        arr3[3] = 10;
        arr3[4] = -2;
        
        int[] Sortedarr3 = new int[5];
        Sortedarr3[0] = -7;
        Sortedarr3[1] = -2;
        Sortedarr3[2] = 8;
        Sortedarr3[3] = 8;
        Sortedarr3[4] = 10;

        Assert.assertArrayEquals(sorter.basicSelectionSort(arr3), Sortedarr3);
        
        /** Test data contains duplicates **/
    }


}







