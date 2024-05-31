class Solution {
   public int splitNum(int num) {
        int[] digits = numberToDigitArray(num);
        int n = digits.length;
        int m = n / 2;

        Arrays.sort(digits);

        int pow = 1;

        int num1 = 0;
        int num2 = 0;
        int j = n - 1;

        for (int i =0;i<=m-1;i++)
        {
            num1 += digits[j--] * pow;
            num2 += digits[j--] * pow;
            pow *= 10;
        }

        if (j == 0)
        {
            num1 += pow * digits[0];
        }

        return num1 + num2;
    }

    private int[] numberToDigitArray(int n)
    {
        int l = 0;
        int temp = n;
        while (temp != 0) {
            l++;
            temp /= 10;
        }

        int[] arr = new int[l];
        int i = l - 1;

        while (n != 0)
        {
            arr[i--] = n % 10;
            n /= 10;
        }

        return arr;
    }
}