package Javadoc;

public class MyName {

    public static void main(String[] args) {

        Name myName = new Name("Thiago", "Geronimo");
        Name otherName = new Name("Tales", "Geronimo");

        boolean sameName = otherName.equals(myName);
        System.out.println(sameName);

        String meuNome = myName.toString();
        String meuFilho = otherName.toString();

        System.out.println("Meu nome é " + meuNome + "\nMeu filho se chama " + meuFilho);

        int compareNames = otherName.compareTo(myName);

        if (compareNames == 0) {
            System.out.println("Same names");
        } else if (compareNames < 0) {
            System.out.println("Nome menor - ???");
        } else {
            System.out.println("Nome maior - ????");
        }


    }

}
