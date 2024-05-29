package javadasar;

public class Array {
    
    public static void main(String[] args) {
        
        String[] stringArray;
        stringArray = new String[3];
        
        stringArray [0] = "Eko";
        stringArray [1] = "Kurniawan";
        stringArray [2] = "Khannedy";
        
        System.err.println(stringArray[0]);
        System.err.println(stringArray[1]);
        System.err.println(stringArray[2]);
        
        String[] stringArray2 = new String[3];
        
        String[] namaNama = {
            "EKo", "Kurniawan", "Khannedy"
        };
        
        namaNama[0] = null;
        
        int[] arrayInt = new int[]{
            1, 2, 3, 4, 5, 6, 7, 7, 8, 9, 10
        };
        
        long[] arrayLong = {
            10L, 20L, 30L
        };
        
        System.out.println(arrayLong.length);
        
        String[][] members = {
            {"Eko", "Kurniawan"},
            {"Budi", "Nugraha"},
            {"Joko"},
        };
        
        System.err.println(members[0][1]);
        System.err.println(members[1][0]);
        
    }
}
