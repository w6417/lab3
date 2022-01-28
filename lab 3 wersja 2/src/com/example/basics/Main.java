package com.example.basics;
import java.util.Arrays;
import java.util.Random;


        public class lab3 {

            public static void main(String[] args) {

                Random rand = new Random();
                int[] tablica = new int[10];
                for (int i = 0; i < tablica.length; i++)
                    tablica[i] = rand.nextInt(21) - 10;


                int max = tablica[0];
                int min = tablica[0];
                for (int i = 0; i < tablica.length; i++) {
                    System.out.println(tablica[i] + " ");
                    max = Math.max(tablica[i], max);
                    min = Math.min(tablica[i], min);

                }
                System.out.println("MIN " + min);
                System.out.println("MAX " + max);


                int sum = Arrays.stream(tablica).sum();
                double avg = (double) sum / tablica.length;
                System.out.println(avg);

                int mniejsze = 0;
                int wieksze = 0;
                for (int i = 0; i < tablica.length; i++) {
                    if (tablica[i] > avg) {
                        wieksze++;
                    } else if (tablica[i] < avg) {
                        mniejsze++;
                    }
                }
                System.out.println("Mniejszych niz srednia " + mniejsze);
                System.out.println("Wiekszych niz " + wieksze);
            }
        }
/* zadanie2
import java.util.Arrays;
import java.util.Random;
public class labki3 {
    public static void main(String[] args) {
 int[][] arr2= new int[5][5];
        for (int i = 0; i < arr2.length; i++) {
            for(int j = 0; j < arr2[i].length; j++) {
               arr2[i][j]=r.nextInt(10)-5;
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println("");
        }
        int[] max2d=new int[5];
        int[] min2d=new int[5];
        max2d[0]=arr2[0][0];
        max2d[1]=arr2[1][0];
        max2d[2]=arr2[2][0];
        max2d[3]=arr2[3][0];
        max2d[4]=arr2[4][0];
        min2d[0]=arr2[0][0];
        min2d[1]=arr2[1][0];
        min2d[2]=arr2[2][0];
        min2d[3]=arr2[3][0];
        min2d[4]=arr2[4][0];
        for (int i = 0; i < arr2.length; i++) {
            for(int j = 0; j < arr2[i].length;j++) {
                max2d[j] =  Math.max(max2d[j],arr2[j][i]);
                min2d[j] =  Math.min(min2d[j],arr2[j][i]);
            }
        }
        for (int i = 0; i < min2d.length; ++i) {
            System.out.println("MIN w kolumnie "+i+" "+min2d[i]);
        }
        for (int i = 0; i < max2d.length; ++i) {
            System.out.println("MAX w kolumnie "+i+" "+max2d[i]);
        }
}/*
Zad3*/

/*import java.util.Arrays;
import java.util.Random;
public class labki3 {
    public static void main(String[] args) {
System.out.println("Podaj liczbe");
            Scanner myObj = new Scanner(System.in);
            int value = myObj.nextInt();
            int value_copy = value;
            int[] bitArr = new int[32];
            if (value < 0) {
                bitArr[0] = 1;
            }
            for (int i = 31; i > 0; i--) {
                bitArr[i] = Math.abs(value % 2);
                value = value / 2;
            }
            System.out.println("liczba " + Integer.toString(value_copy) + " binarne to:");
        for (int i = 0; i < bitArr.length; ++i) {
            if(i==0){
                System.out.print(bitArr[0]+".");
            }else{
                System.out.print(bitArr[i]);
            }
        }
*/
//zad4
/*import java.util.Arrays;
 import java.util.Random;
public class labki3 {
    public static void main(String[] args) {
        System.out.println("Podaj liczbe");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        char[][] c = new char[n][n];
        for (int i = 0; i < c.length; i++) {
            var str1 = "";
            for (int j = 0; j < c.length; j++) {
                c[i][j] = Nwd(i + 1, j + 1) ? '+' : '.';
                str1 += c[i][j] + " ";
            }
            System.out.println(str1);
        }
        */
//zad5

/*import java.util.Arrays;
import java.util.Random;
public class labki3 {
    public static void main(String[] args) {
        System.out.println("Wpisz wyraz");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] chars = str.toCharArray();
        int licz_ost_lit = 0;
        int suma= 0;
        for (char znak : chars) {
            if (znak == chars[chars.length - 1]) {
                licz_ost_lit++;
            }
        }
        System.out.println("Ostatnia litera występuje: " + Integer.toString(licz_ost_lit )+" razy");
    }
    */
        //zad6
/*import java.util.Arrays;
import java.util.Random;
public class labki3 {
    public static void main(String[] args) {
        System.out.println("Podaj tekst z cyframi np. Ala ma 1 kota i 2 psy");
        Scanner sc2 = new Scanner(System.in);
        String str2 = sc2.nextLine();
        char[] chars2 = str2.toCharArray();
        for (char znak : chars2) {
            if (Character.isDigit(znak)) {
                suma += (int) znak - 48;
            }
        }
        System.out.println("Suma cyfr z tekstu: " + Integer.toString(suma));
    }
}*/
//zad7
/*import java.util.Arrays;
import java.util.Random;
public class labki3 {
    public static void main(String[] args) {
 System.out.println("Podaj znak (szyfr Cezara)");
         Scanner sc1 = new Scanner(System.in);
         String str1 = sc1.nextLine();
         System.out.println("Podaj liczbe");
         int offs = sc1.nextInt();
         char[] chars1 = str1.toCharArray();
         for (int i = 0; i < str1.length(); i++) {
        chars1[i] = (char) ((chars1[i] + offs) % (int) 'a' + (int) 'a');
        }
        }
 */
    }
}
