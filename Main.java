package Main;

import Classes.Produto;

public class Main {

    public static void main(String[] args) {

        Produto p1 = new Produto(1, "Latão BRAHMA", 7.50, 2);
        Produto p2 = new Produto(2, "Biscoito DANIX", 5.50, 10);
        Produto p3 = new Produto(3, "Salgado JOELHO", 7.0, 5);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        p1.pedido();
        p2.pedido();
        p3.pedido();
    }
}