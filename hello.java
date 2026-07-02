public class Hello {
   public static void main(String[] args) {
      int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
      System.out.println("sum = " + sum(numbers));
      System.out.println("average = " + average(numbers));
   }

   // 配列の合計値を返す関数
   public static int sum(int[] numbers) {
      int total = 0;
      for (int number : numbers) {
         total += number;
      }
      return total;
   }

   // 配列の平均値を返す関数
   public static int average(int[] numbers) {
      if (numbers == null || numbers.length == 0) {
         return 0;
      }
      return sum(numbers) / numbers.length;
   }
}
