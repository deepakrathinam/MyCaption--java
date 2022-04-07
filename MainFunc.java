public class MainFunc {
    public static void main(String[] args) {
        double[][] data1 = {{1,3,4},{2,4,3},{3,4,5}};
        double[][] data2 = {{1,3,4},{2,4,3},{1,2,4}};
        MatrixManipulation obj1 = new MatrixManipulation();
        MatrixManipulation obj2 = new MatrixManipulation();
        MatrixManipulation obj3 = new MatrixManipulation();
        obj1.MatrixCreation(data1);
        obj2.MatrixCreation(data2);
        obj3.MatrixCreation(3,3);
        int i,j;
        for (i = 0;i < 3;i++){
            for (j = 0;j < 3;j++){
                obj3.data[i][j] = obj1.data[i][j] + obj2.data[i][j];
            }
        }
        System.out.println("Final output Matrix is :");
        for (i = 0;i < 3;i++){
            for (j = 0;j < 3;j++){
                System.out.print(obj3.data[i][j] + " ");
            }
            System.out.println();
        }
    }
}
