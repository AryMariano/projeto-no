public class Main {
    public static void main(String[] args) throws Exception {
        
     

        Pilha<String> pilha1  = new Pilha<>();

        pilha1.push("primeiro");
        pilha1.push("segundo");
        pilha1.push("terceiro");
        pilha1.push("quarto");
        pilha1.push("quinto");

        System.out.println(pilha1);

        Fila<Integer> fila1 = new Fila<>();

        fila1.enqueue(1);
        fila1.enqueue(2);
        fila1.enqueue(3);
        fila1.enqueue(4);
        fila1.enqueue(5);

        fila1.dequeue();
        fila1.enqueue(1);
        fila1.dequeue();
        fila1.enqueue(2);
        fila1.dequeue();
        fila1.enqueue(3);

        System.out.println(fila1);



    }
}
