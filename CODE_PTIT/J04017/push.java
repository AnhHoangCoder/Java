package J04017;

import java.util.Scanner;

public class push {
    public static class Matrix {
        private int rows, cols;
        private int[][] data;

        public Matrix(int rows, int cols){
            this.rows = rows;
            this.cols = cols;
            data = new int[rows][cols];
        }

        public void nextMatrix(Scanner sc){
            for(int i = 0; i < rows; i++){
                for(int j = 0; j < cols; j++){
                    data[i][j] = sc.nextInt();
                }
            }
        }

        public Matrix trans(){
            Matrix res = new Matrix(cols, rows);
            for(int i = 0; i < rows; i++){
                for(int j = 0; j < cols; j++){
                    res.data[j][i] = data[i][j];
                }
            }
            return res;
        }

        public Matrix mul(Matrix other){
            if(this.cols != other.rows){
                throw new IllegalArgumentException("Ko hop le");
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
        public String toString(){
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < rows; i++){
                for(int j = 0; j < cols; j++){
                    if(j > 0) sb.append(" ");
                    sb.append(data[i][j]);
                }
                if(i < rows - 1){
                    sb.append("\n");
                }
            }
            return sb.toString();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt(), m = sc.nextInt();
            Matrix a = new Matrix(n,m);
            a.nextMatrix(sc);
            Matrix b = a.trans();
            System.out.println(a.mul(b));
        }
    }
}
