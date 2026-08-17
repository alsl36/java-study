package referenceType;

public class referenceType03 {
    public static void main(String[] args) {
        int[] arr1;
        int arr2[];
        arr1 = new int[] {1, 2, 3};
        arr2 = new int[] {4, 5, 6};
        System.out.println(arr1[0]);
        System.out.println(arr2[0]);
        
        int[] arr3 = {0, 1, 2, 3};
        System.out.println(arr3[2]);

        int[] arr4 = new int[30];
        for (int i=0; i<=29; i++) {
            System.out.printf("%d", arr4[i]);
        }
        System.out.printf("\n");
        System.out.println(arr4.length);

        int[][] scores = {
            {80,90,96},
            {76,88}
        };
        System.out.println(scores[0][2]);

        int[] scores2 = {95, 71, 84, 93, 87};
        for (int score : scores2) {
            System.out.println(score);
        }
    }
    
}
