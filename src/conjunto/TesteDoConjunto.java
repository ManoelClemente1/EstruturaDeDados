package conjunto;

import java.util.LinkedList;

public class TesteDoConjunto {

    public static void main(String[] args) {

        LinkedList<String> conjunto = new LinkedList<>();

        if(!conjunto.contains("Manoel")){
            conjunto.add("Manoel");
        }

        System.out.println(conjunto);

    }
}
