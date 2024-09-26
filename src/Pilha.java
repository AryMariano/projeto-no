public class Pilha {

    private No noEntradaPilha;
    

    public Pilha() {
        this.noEntradaPilha = null;
    }

    public No pop(){
        if(!isEmpty()){
            No noPoped = noEntradaPilha;
            noEntradaPilha = noEntradaPilha.getRefNo();
            return noPoped;
        } else{
            return null;
        }
    }

    public void push(No novoNo){
        No auxiliarNo = noEntradaPilha;
        noEntradaPilha = novoNo;
        novoNo.setRefNo(auxiliarNo);

    }

    public No top(){
        return noEntradaPilha;
    }

    public boolean isEmpty(){

        return noEntradaPilha == null ? true : false;
         
    }

    @Override
    public String toString() {

        String stringRetorno = "";

        No noAuxiliar = noEntradaPilha;

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
    
