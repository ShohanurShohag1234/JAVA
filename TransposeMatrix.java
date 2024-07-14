/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.transposematrix;


public class TransposeMatrix {
    public static int [][] transpose_Matrix(int [][] matrix){
        int rows =matrix.length;
        int cols=matrix[0].length;
        int[][] transposedMatrix = new int [cols][rows];
        for(int i =0; i<rows;i++){
            for(int j=0; j<=cols; j++){
               transposedMatrix[j][i]=matrix[i][j]; 
            }
        }
        return transposedMatrix;
       
        
     }
    

    public static void main(String[] args) {
       int [][]matrix={
           {1,2,3},
           {4,5,6},
           {7,8,9}
       };
       int[][] transposedMatrix =transpose_Matrix(matrix);
        System.out.println("Original Matrix : ");
        print_Matrix(matrix);
        System.out.println("\n Transposed Matrix: ");
        print_Matrix(transposedMatrix);
        
    }
    public static void print_Matrix(int [][]matrix){
        for(int []row  : matrix){
            for(int num : row){
                System.out.println(num+ " ");
            }
            System.out.println();
        }
    }
}
