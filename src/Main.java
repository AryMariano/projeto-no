public class Main {
    public static void main(String[] args) throws Exception {
        
        No no1 = new No(1);
        No no2 = new No(2);
        No no3 = new No(3);
        No no4 = new No(4);
        No no5 = new No(5);

        no2.setRefNo(no1);
        no3.setRefNo(no2);
        no4.setRefNo(no3);
        no5.setRefNo(no4);

        Pilha pilha1  = new Pilha();

        pilha1.push(no1);
        pilha1.push(no2);
        pilha1.push(no3);
        pilha1.push(no4);
        pilha1.push(no5);

        System.out.println(pilha1);



    }
}
