public class No<T> {

    private T dado;

    private No<T> refNo;

    public No(T dado) {
        this.dado = dado;
    }

    public Object getDado() {
        return dado;
    }

    public void setDado(T dado) {
        this.dado = dado;
    }

    public No<T> getRefNo() {
        return refNo;
    }

    public void setRefNo(No<T> refNo) {
        this.refNo = refNo;
    }

    @Override
    public String toString() {
        return "No [dado=" + dado + "]";
    }

    

}
