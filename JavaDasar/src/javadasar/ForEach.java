package javadasar;

public class ForEach {

    public static void main(String[] args) {

        String[] array = {
            "Eko", "Kurniawan", "Khannedy",
            "Programmer", "Zaman", "Now"
        };

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        
        System.out.println("FOE EACH");
        
        for (var value : array) {
            System.out.println(value);
        }
    }

}
