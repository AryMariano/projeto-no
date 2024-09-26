public class Pilha<T> {

    private No<T> noEntradaPilha;
    

    public Pilha() {
        this.noEntradaPilha = null;
    }

    @SuppressWarnings("unchecked")
    public T pop(){
        if(!isEmpty()){
            No<T> noPoped = noEntradaPilha;
            noEntradaPilha = noEntradaPilha.getRefNo();
            return (T) noPoped.getDado();
        } else{
            return null;
        }
    }

    public void push(T dado){ // a criacao do no esta embutido
        No<T> novoNo = new No<T>(dado);
        No<T> auxiliarNo = noEntradaPilha;
        noEntradaPilha = novoNo;
        novoNo.setRefNo(auxiliarNo);

    }

    @SuppressWarnings("unchecked")
    public T top(){
        return (T) noEntradaPilha;
    }

    public boolean isEmpty(){

        return noEntradaPilha == null ? true : false;
         
    }

    @Override
    public String toString() {

        String stringRetorno = "";

        No<T> noAuxiliar = noEntradaPilha;

        while(true){
            if(noAuxiliar != null){
                stringRetorno += "[No{dado=" + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getRefNo();
            }else{
                break;
            }
        }
        return stringRetorno;
    }
}
    
