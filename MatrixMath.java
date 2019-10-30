import java.util.Arrays;
/**
 * Write a description of class MatrixMath here.
 *
 * @author ( Mr. Kim)
 * @version ((October 28. 1029)
 */
public class MatrixMath
{
    // instance variables - replace the example below with your own
    private static int[][] data = {{1,2,3}, {2,1,0}, {1,0,2}};
    
public static String toString(int[] array)
{
    return Arrays.toString(array);
}
public static String toString(double[] array)
{
    return Arrays.toString(array);
}
    /**
     * Constructor for objects of class MatrixMath
     */
    public MatrixMath(int[][] data)
    {
        this.data = data;
}
    /**
     * Find the sum of all the elements in each row.
     * 
     *
     * @return    int[]
     */
    public int[] rowSum()
    {
        int[] rowSum;
        rowSum = new int[(this.data).length];
        int sum = 0;
        for (int i = 0; i<(this.data).length; i++)
        {
            for (int j = 0; j<(this.data)[0].length; j++)
            {
                sum+=this.data[i][j];
        }
        rowSum[i] = sum;
        sum=0;
    }
    return rowSum;
}
        /**
     * Find the average of all the values in each row
     *
     * @return    int[] 
     */
    public double[] rowAve()
    {
        double [] rowAve;
        rowAve = new double[this.data.length];
        double sum = 0.0;
            for (int i = 0; i<this.data.length; i++)
        {
            for (int j = 0; j<this.data[0].length; j++)
            {
                sum+=this.data[i][j];
        }
        rowAve[i] = sum/this.data[i].length;
        sum=0.0;
    }
    return rowAve;
    }
    
        /**
     * Find the sum of all the numbers in column
     * 
     *
     * @return    int[] 
     */
    public int[] colSum()
    {
            int[] colSum;
        colSum = new int[this.data[0].length];
        int sum = 0;
        for (int i = 0; i<this.data[0].length; i++)
        {
            for (int j = 0; j<this.data.length; j++)
            {
                sum+=this.data[j][i];
        }
        colSum[i] = sum;
        sum=0;
    }
    return colSum;
    }
    
     /**
     * Find the average of all the values in each row
     *
     * @return    int[] 
     */
    public double[] colAve()
    {
                double [] colAve;
        colAve = new double[this.data[0].length];
        double sum = 0.0;
            for (int i = 0; i<this.data[0].length; i++)
        {
            for (int j = 0; j<this.data.length; j++)
            {
                sum+=this.data[j][i];
        }
        colAve[i] = sum/this.data.length;
        sum=0.0;
    }
    return colAve;
    }
    
}
