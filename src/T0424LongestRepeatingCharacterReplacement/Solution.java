package T0424LongestRepeatingCharacterReplacement;

public class Solution {

    public static void main(String[] args) {
        System.out.println(characterReplacement("ABAB",2));
        System.out.println(characterReplacement("AABABBA",1));
    }

    public static int characterReplacement(String s, int k) {
        int[] count = new int[26]; // Массив для подсчета частоты символов
        int left = 0; // Левая граница окна
        int maxCount = 0; // Максимальная частота символа в текущем окне
        int maxLength = 0; // Максимальная длина валидной подстроки

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            count[currentChar - 'A']++; // Увеличиваем частоту текущего символа
            maxCount = Math.max(maxCount, count[currentChar - 'A']); // Обновляем maxCount

            // Проверяем, нужно ли сдвинуть левую границу
            while (right - left + 1 - maxCount > k) {
                count[s.charAt(left) - 'A']--; // Уменьшаем частоту символа, выходящего из окна
                left++; // Сдвигаем левую границу
            }

            // Обновляем максимальную длину
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
