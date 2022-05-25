import java.util.Scanner;
public class Multi {
    private int num;
    private int [] A = new int [10];
    private int [] B = new int [A.length];
    private int [] C = new int [B.length];

    public void camb (int vnumero)
    { num=vnumero;
    }
    public void IngresarDatos()
    {   int vnumero, i;
        Scanner sn = new Scanner(System.in);
        for(i=0;i<=A.length-1;i++)
        {   System.out.printf("Deme el numero %d: ",i+1);
            vnumero = sn.nextInt();
            camb(vnumero);
            A[i]=num;
        }
        System.out.print("Introduzca el Segundo Array\n");
        for(i=0;i<=B.length-1;i++)
        {   System.out.printf("Deme el numero %d: ",i+1);
            vnumero = sn.nextInt();
            camb(vnumero);
            B[i]=num;
        }
        sn.close();
    }
    public void Multiplicando()
    {   int i=0,j=0;
        System.out.print("\nEl arreglo multiplicado es: ");
        for(i=A.length-1, j=0;i>=0;i--,j++)
        {   C[j]=A[j]*B[i];
            System.out.printf("%d  ", C[j] );
        }
    }
    public static void main(String[] args) {
        
        Multi nm = new Multi();
        nm.IngresarDatos();
        nm.Multiplicando();
    }
}
