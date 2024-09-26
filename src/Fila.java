public class Fila<T> {

    private No<T> noEntradaFila;

    public Fila() {
        this.noEntradaFila = null;
    }

    public boolean filaIsEmpty(){
        return noEntradaFila == null ? true : false;
    }

    public void enqueue(T dado){
        No<T> novoNo = new No<T>(dado);
        novoNo.setRefNo(noEntradaFila);
        noEntradaFila = novoNo;
    }

    @SuppressWarnings("unchecked")
    public T first(){
        if(!filaIsEmpty()){
            No<T> primeiroNo = noEntradaFila;
            while(primeiroNo.getRefNo() != null){
                primeiroNo = primeiroNo.getRefNo();
            }
            return (T) primeiroNo.getDado();

        }else{
            return null;
        }
    }

    @SuppressWarnings("unchecked")
    public T dequeue(){
        if(!filaIsEmpty()){
            No<T> primeiroNo = noEntradaFila;
            No<T> auxiliarNo = noEntradaFila;
            while(primeiroNo.getRefNo() != null){
                auxiliarNo = primeiroNo;
                primeiroNo = primeiroNo.getRefNo();
            }
            auxiliarNo.setRefNo(null);
            return (T) primeiroNo.getDado();

        }else{
            return null;
        }
         
    }

    @Override
    public String toString() {

        String stringRetorno = "";
        No<T> noAuxiliar = noEntradaFila;

        if(noAuxiliar != null){
            while(true){
                stringRetorno += "[No{dado=" + noAuxiliar.getDado() + "}]\n";
                if(noAuxiliar.getRefNo() != null){
                    noAuxiliar = noAuxiliar.getRefNo();
                }
                else{
                    stringRetorno += "null";
                    break;
                }
            }
        }
        return stringRetorno;
    }
}

    

