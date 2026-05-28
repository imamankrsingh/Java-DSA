public class main {
   
 

   static void countSort(int[] var0, int var1) {
      int[] var2 = new int[var1];
      int[] var3 = new int[256];

      for(int var4 = 0; var4 < 256; ++var4) {
         var3[var4] = 0;
      }

      for(int var5 = 0; var5 < var1; ++var5) {
         ++var3[var0[var5]];
      }

      for(int var6 = 1; var6 <= 255; ++var6) {
         var3[var6] += var3[var6 - 1];
      }

      for(int var7 = var1 - 1; var7 >= 0; --var7) {
         var2[var3[var0[var7]] - 1] = var0[var7];
         --var3[var0[var7]];
      }

      for(int var8 = 0; var8 < var1; ++var8) {
         var0[var8] = var2[var8];
      }

   }

   static void printArr(int[] var0, int var1) {
      for(int var2 = 0; var2 < var1; ++var2) {
         System.out.print(var0[var2] + " ");
      }

   }

   public static void main(String[] var0) {
      int[] var1 = new int[]{4, 2, 2, 8, 3, 3, 1};
      int var2 = var1.length;
      countSort(var1, var2);
      System.out.println("Sorted character array is ");

      for(int var3 = 0; var3 < var2; ++var3) {
         System.out.print(var1[var3] + " ");
      }

   }
}
 

