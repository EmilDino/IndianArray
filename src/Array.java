public class Array {
    public static void main (String[] args) {
        int marks[] = {72, 85, 93, 29, 85};
        int sum = 0;
        for(int counter = 0; counter < marks.length; counter++) {
            System.out.println(marks[counter]);
            sum = sum + marks[counter];
        }

        System.out.println("sum of all five marks: " + sum);
    }
}
