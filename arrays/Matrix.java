import java.util.Scanner;

   public class Matrix {
      public Matrix() {
      }

   static void PrintMatrix(int[][] var0) {
      for(int var1 = 0; var1 < var0.length; ++var1) {
         for(int var2 = 0; var2 < var0[var1].length; ++var2) {
            System.out.print(var0[var1][var2] + " ");
         }

         System.out.println();
      }

   }

   static void add(int[][] var0, int var1, int var2, int[][] var3, int var4, int var5) {
      if (var1 == var4 && var2 == var5) {
         int[][] var6 = new int[var1][var2];

         for(int var7 = 0; var7 < var1; ++var7) {
            for(int var8 = 0; var8 < var2; ++var8) {
               var6[var7][var8] = var0[var7][var8] + var3[var7][var8];
            }
         }

         System.out.println("Sum Matrix:");
         PrintMatrix(var6);
      } else {
         System.out.println("Wrong input - Addition not possible");
      }
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("Enter rows and columns of first matrix:");
      int var2 = var1.nextInt();
      int var3 = var1.nextInt();
      int[][] var4 = new int[var2][var3];
      System.out.println("Enter elements:");

      for(int var5 = 0; var5 < var2; ++var5) {
         for(int var6 = 0; var6 < var3; ++var6) {
            var4[var5][var6] = var1.nextInt();
         }
      }

      System.out.println("Enter rows and columns of second matrix:");
      int var10 = var1.nextInt();
      int var11 = var1.nextInt();
      int[][] var7 = new int[var10][var11];
      System.out.println("Enter elements:");

      for(int var8 = 0; var8 < var10; ++var8) {
         for(int var9 = 0; var9 < var11; ++var9) {
            var7[var8][var9] = var1.nextInt();
         }
      }

      add(var4, var2, var3, var7, var10, var11);
   }
}

