import java.util.Scanner;
public class Nums {
    public static void main(String[] args){
        int numeros []= new int [10];
        int inverso [] = new int[numeros.length];
        int i,k, j;
        i=j=k=0;
        Scanner sn = new Scanner(System.in);

        for(i=0;i<=numeros.length-1;i++)
        {   System.out.printf("Deme el numero %d: ",i+1);
            numeros[i]=sn.nextInt();
        }
        System.out.print("El arreglo es: ");
        for(k=0;k<=9;k++)
        { System.out.printf("%d ",numeros[k]);
        }
        System.out.print("\nEl arreglo invertido es: ");
        for(i=numeros.length-1, j=0;i>=0;i--,j++)
        {   inverso[j]= numeros[i];
            System.out.printf("%d  ", inverso[j] );
        }
        sn.close();
    }
}
