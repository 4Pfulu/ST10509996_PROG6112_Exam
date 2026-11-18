/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matresssalesreport;
import java.util.Scanner;
/**
 *
 * @author pfulu
 */
//----------  INTERFACE  ----------
interface IProduct {
    int GetTotalProductsSold();
    double GetAverageProductSold();
    String GetMostPopularProduct();
}

// ----------  PRODUCT CLASS ----------
class Product implements IProduct {
    private String[] productNames;   
    private int[][] sales;          

    
    public Product(String[] productNames, int[][] sales) {
        this.productNames = productNames;
        this.sales = sales;
    }

    
    public int GetTotalProductsSold() {
        int total = 0;
        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
                total = total + sales[i][j];
            }
        }
        return total;
    }

     
    public double GetAverageProductSold() {
        int count = sales.length * sales[0].length;
        return (double) GetTotalProductsSold() / count;
    }

    // Finds the product with the highest total sales
    public String GetMostPopularProduct() {
        int topIndex = 0;
        int topTotal = 0;
        for (int i = 0; i < sales.length; i++) {
            int rowTotal = 0;                        
            for (int j = 0; j < sales[i].length; j++) {
                rowTotal = rowTotal + sales[i][j];
            }
            if (rowTotal > topTotal) {
                topTotal = rowTotal;
                topIndex = i;
            }
        }

        
        int best = sales[topIndex][0];
        for (int j = 1; j < sales[topIndex].length; j++) {
            if (sales[topIndex][j] > best) {
                best = sales[topIndex][j];
            }
        }
        return productNames[topIndex] + "(" + best + ")";
    }
}

// ---------- PRINTPRODUCT CLASS  ----------
class PrintProduct {
    private IProduct product;

    public PrintProduct(IProduct product) {
        this.product = product;
    }

    public void PrintTotalProductSales() {
        System.out.println("TOTAL PRODUCT SALES: " + product.GetTotalProductsSold());
    }

    public void PrintAverageProductSales() {
       
        System.out.println("AVERAGE PRODUCT SALES: " + Math.round(product.GetAverageProductSold()));
    }

    public void PrintMostPopularProduct() {
        System.out.println("MOST POPULAR PRODUCT: " + product.GetMostPopularProduct());
    }

    
}
// ----------  MAIN CLASS ----------

public class MatressSalesReport {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] productNames = {"Cozy Nights Monarch", "Restonic Barbados", "Sealy Phuket"};
        int[][] sales = new int[3][3];

        
        for (int i = 0; i < productNames.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter number of sales for month " + (j + 1)
                        + " for " + productNames[i] + " mattress: ");
                sales[i][j] = input.nextInt();
            }
            System.out.println();     
        }

        Product product = new Product(productNames, sales);
        PrintProduct printer = new PrintProduct(product);
        
        System.out.println();
        System.out.println("PRODUCT SALES REPORT - 2026");
        System.out.println();
        System.out.println("**********************************************");
        printer.PrintMostPopularProduct();
        printer.PrintAverageProductSales();
        printer.PrintTotalProductSales();
    }
}
    

