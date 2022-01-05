package multidimensionstring;

public class MultiDimensionString {
    
    public static void main(String[] args) {

        String line = "1,4,3,2,3,7,5,6,9\n" + "8,6,3,7,3,7,5,6,9\n";

        String[] newString = line.split("\n");
        String firstString = newString[0];
        String secondString = newString[1];

        String[] tempString1 = firstString.split(",");
        int[] values1 = new int[tempString1.length];
        for (int i = 0; i < tempString1.length; i++) {
            values1[i] = Integer.parseInt(tempString1[i]);
        }

        String[] tempString2 = secondString.split(",");
        int[] values2 = new int[tempString2.length];
        for (int i = 0; i < tempString2.length; i++) {
            values2[i] = Integer.parseInt(tempString2[i]);
        }

        int[] oneArray = new int[values1.length + values2.length];

        System.arraycopy(values1, 0, oneArray, 0, values1.length);
        System.arraycopy(values2, 0, oneArray, values1.length, values2.length);

        int[][] myarray = new int[2][9];
        int index = 0;

        for (int[] myarray1 : myarray) {
            for (int j = 0; j < myarray1.length; j++) {
                myarray1[j] = oneArray[index++];
            }
        }
        
        for (int[] myarray1 : myarray) {
            for (int j = 0; j < myarray1.length; j++) {
                System.out.print(myarray1[j] + " ");
            }
            System.out.println();
        }

    }

}
