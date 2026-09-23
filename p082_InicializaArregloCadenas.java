void main() {

    ArrayList<String> muns = new ArrayList<>();

    muns.add("Teul");
    muns.add("Jerez");
    muns.add("Garcia");
    muns.add("Rio Grande");
    muns.add("Fresnillo");
    muns.add("Momax");
    muns.add("Pinos");
    muns.add("Loreto");
    muns.add("Guadalupe");

    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.printf("Primer elemento de la lista %s\n", muns.get(0));
    System.out.printf("Último elemento de la lista %s\n", muns.get(muns.size() - 1));
    System.out.println("\nTodos los elementos con ciclo for:");
    for (int i = 0; i < muns.size(); i++) {
        System.out.printf("%s ", muns.get(i));
    }
    System.out.println("\n\nTodos los elementos con ciclo for-each:");
    for (String municipio : muns) {
        System.out.printf("%s ", municipio);
    }
    System.out.println("\n\nProceso terminado");
}
