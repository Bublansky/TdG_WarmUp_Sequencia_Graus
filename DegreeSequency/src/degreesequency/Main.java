/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 asdughiaudgiassufhdiasuhdiasuhdiusaghd
 */

//package degreesequency;
import  java.util.Scanner;

/**
 *
 * @author Ludus
 */
class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n, x, y, k, graus[], aux;
        boolean useArgs = false;
        String values[] = {};
        
        if(useArgs)
        {
            n = Integer.getInteger(args[0]);
            
            values = args.toString().split(" ");
            values = values.toString().split("\n");
        }
        else
        {
            n = entrada.nextInt();
        }
        k = 1;
        int matriz[][] = new int[n][n];
        graus = new int[n];
        
        for(x = 0 ; x < n ; x++)
        {
            for(y = 0 ; y < n ; y++)
            {
                if(useArgs)
                {
                    matriz[x][y] = Integer.getInteger(values[k]);
                    k++;
                }
                else
                {
                    matriz[x][y] = entrada.nextInt();
                }
            }
        }
        
        for(x = 0 ; x < n ; x++)
        {
            graus[x] = 0;
            for(y = 0 ; y < n ; y++)
            {
                if(matriz[x][y] == 1)
                {
                    graus[x]++;
                    //System.out.print(y + " ");
                }
            }
            //System.out.println("");
        }
        for(x = 0 ; x < n ; x++)
        {
            for(y = 0 ; y < n ; y++)
            {
                if(graus[y] > graus[x])
                {
                    aux = graus[y];
                    graus[y] = graus[x];
                    graus[x] = aux;
                }
            }
        }
        for(x = 0 ; x < n ; x++)
        {
            System.out.print(graus[x] + " ");
        }
    }
}