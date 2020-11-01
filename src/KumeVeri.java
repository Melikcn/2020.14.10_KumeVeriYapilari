import java.util.Arrays;

public class KumeVeri {

    String[] isim = new String[100];
    int nameCount = 0;

    public boolean add(String name) {
        for (String ad : isim){
            if (ad != null && (ad.equalsIgnoreCase(name))){
                System.out.println("Bu isim zaten mevcut");
                return false;
            }
        }
        if (nameCount == isim.length) {
            System.out.println("Kapasite doldu.");
            return false;


        } else if (isim != null) {

            isim[nameCount] = name;
            nameCount++;
            System.out.println(name + " ekledim.");


        }

        return true;

    }

    public boolean delete(String name) {
        for (int i = 0; i < isim.length; i++) {
            if (isim[i].equalsIgnoreCase(name)) {
                isim[i] = null;
                System.out.println(name + " ismini sildim.");
                nameCount--;
                return true;
            }
        }
        return false;
    }

    public void print() {
        System.out.println("------- L I S T -------");
        for (String name : isim) {
            if (name != null)
                System.out.println(name);
        }
    }





    @Override
    public String toString() {
        return "KumeVeri{" +
                "isim=" + Arrays.toString(isim) +
                '}';
    }
}
