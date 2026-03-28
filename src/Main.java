public class Main {
    public static void main(String[] args) {

        MyQueue<String> fila = new MyQueue<>();

        System.out.println("Fila vazia? " + fila.isEmpty());

        fila.add("Helen");
        fila.add("Felipe");
        fila.add("Salami");
        fila.add("Polenta");

        System.out.println("Fila: " + fila);
        System.out.println("Tamanho: " + fila.size());

        System.out.println("Primeiro elemento (peek): " + fila.peek());

        System.out.println("Contém 'Felipe'? " + fila.contains("Felipe"));
        System.out.println("Contém 'Helen'? " + fila.contains("Helen"));

        System.out.println("Removido: " + fila.remove());
        System.out.println("Fila após remover: " + fila);

        Object[] array = fila.toArray();
        System.out.print("Fila em array: ");
        for (Object item : array) {
            System.out.print(item + " ");
        }
        System.out.println();

        fila.clear();
        System.out.println("Fila após clear: " + fila);
        System.out.println("Fila vazia? " + fila.isEmpty());

        try {
            fila.remove();
        } catch (RuntimeException e) {
            System.out.println("Erro esperado: " + e.getMessage());
        }
    }
}