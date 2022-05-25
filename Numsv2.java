import java.util.Scanner;

public class Numsv2 {
    private int num;
    private int [] numeros = new int [10];
    private int [] inverso = new int [10];

    public void camb (int vnumero)
    { num=vnumero;
    }
    public void IngresarDatos()
    {   int vnumero, i;
        Scanner sn = new Scanner(System.in);
        for(i=0;i<=inverso.length-1;i++)
        {   System.out.printf("Deme el numero %d: ",i+1);
            vnumero = sn.nextInt();
            camb(vnumero);
            numeros[i]=num;
        }
        sn.close();
    }
    public void Inverso()
    {   int i=0,j=0;
        System.out.print("\nEl arreglo invertido es: ");
        for(i=numeros.length-1, j=0;i>=0;i--,j++)
        {   inverso[j]= numeros[i];
            System.out.printf("%d  ", inverso[j] );
        }
    }
    public static void main(String[] args) {
        
        Numsv2 nm = new Numsv2();
        nm.IngresarDatos();
        nm.Inverso();
    }
}
