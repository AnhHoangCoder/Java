package J04016;

import java.util.Scanner;

public class Matrix {
    private int rows, cols;
    private int[][] data;

    public Matrix(int rows, int cols){
        this.rows = rows;
        this.cols = cols;
        this.data = new int[rows][cols];
    }

    public void nextMatrix(Scanner sc){
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                data[i][j] = sc.nextInt();
            }
        }
    }

    public Matrix mul(Matrix other){
        if(this.cols != other.rows){
            throw new IllegalArgumentException("Kich thuoc ko hop le");
        }

        Matrix res = new Matrix(this.rows, other.cols);
        for(int i = 0; i < this.rows; i++){
            for(int j = 0; j < other.cols; j++){
                for(int k = 0; k < this.cols; k++){
                    res.data[i][j] += this.data[i][k] * other.data[k][j];
                }
            }
        }
        return res;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (j > 0) sb.append(" ");
                sb.append(data[i][j]);
            }
            if (i < rows - 1) sb.append("\n");
        }
        return sb.toString();
    }
}
