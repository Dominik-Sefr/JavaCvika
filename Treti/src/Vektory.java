import java.util.*;

public class Vektory{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] u = new int[3];
        int[] v = new int[3];
        System.out.println("Ux: ");
        u[0] = sc.nextInt();
        System.out.println("Uy: ");
        u[1] = sc.nextInt();
        System.out.println("Uz: ");
        u[2] = sc.nextInt();
        System.out.println("Vx: ");
        v[0] = sc.nextInt();
        System.out.println("Vy: ");
        v[1] = sc.nextInt();
        System.out.println("Vz: ");
        v[2] = sc.nextInt();
        int skalar = u[0]*v[0]+u[1]*v[1]+u[2]*v[2];
        int[] vusoucin = new int[3];
        vusoucin[0] = u[1]*v[2]-u[2]*v[1];
        vusoucin[1] = u[2]*v[0]-u[0]*v[2];
        vusoucin[2] = u[0]*v[1]-u[1]*v[0];
        double rad = skalar/(delka(u)*delka(v));
        double uhel = Math.cos(rad);
        System.out.printf("Skalarní součin: %s\nVektorový součin: %s\nÚhel vektorů: %s", skalar, Arrays.toString(vusoucin), uhel);

    }
    private static double delka(int[] x){
        return Math.sqrt(Math.pow((double) (x[0]),2)+Math.pow((double)x[1],2)+Math.pow((double)x[2],2));
    }
}
