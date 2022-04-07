public class MatrixManipulation {
    public int rows;
    public int columns;
    public double[][] data;
    public void MatrixCreation(double[][] dat){
        data = dat;
        rows = dat.length;
        columns = dat[0].length;
    }
    public void MatrixCreation(int row,int column){
        rows = row;
        columns = column;
        data = new double[rows][columns];
    }
}
