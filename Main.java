class Main {
  public static void main(String[] args) {
    
    ListaEncadeada l1 = new ListaEncadeada();
    l1.adicionarInicio("a");
    l1.adicionarFim("b");
    //System.out.println(l1.buscar(0));
    l1.adicionarFim("c");
    //System.out.println(l1.buscar(1));
    //System.out.println(l1.buscar(2));
    l1.adicionar(1, "d");
    //System.out.println(l1.buscar(0));
    //System.out.println(l1.buscar(1));
    //System.out.println(l1.buscar(2));
    //System.out.println(l1.buscar(3));
    //System.out.println(l1.tamanho());
    l1.adicionar(0, "e");
    //System.out.println(l1.buscar(0));
    //System.out.println(l1.buscar(1));
    //System.out.println(l1.buscar(2));
    //System.out.println(l1.buscar(3));
    //System.out.println(l1.buscar(4));
    //System.out.println(l1.tamanho());
    l1.adicionar(4, "f");
    System.out.println(l1.buscar(0));
    System.out.println(l1.buscar(1));
    System.out.println(l1.buscar(2));
    System.out.println(l1.buscar(3));
    System.out.println(l1.buscar(4));
    System.out.println(l1.buscar(5));
    //System.out.println(l1.buscar(6));
    System.out.println(l1.tamanho());

  }
}