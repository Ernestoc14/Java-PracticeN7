import java.util.Scanner;
public class Mult {
    public static void main(String[] args){
        int A[]= new int [3];
        int B[] = new int[A.length];
        int C[] = new int[B.length];
        int i, j;
        i=j=0;
        Scanner sn = new Scanner(System.in);

        for(i=0;i<=A.length-1;i++)
        {   System.out.printf("Deme el numero %d del arreglo A: ",i+1);
            A[i]=sn.nextInt();
        }
        for(i=0;i<=B.length-1;i++)
        {   System.out.printf("Deme el numero %d del arreglo B: ",i+1);
            B[i]=sn.nextInt();
        }
        System.out.print("El arreglo multiplicado es: ");
        for(i=A.length-1, j=0;i>=0;i--,j++)
        {   C[j]= A[j]*B[i];
            System.out.printf("%d  ", C[j] );
        }
        sn.close();
    }
}
