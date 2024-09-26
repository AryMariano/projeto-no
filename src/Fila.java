public class Fila {

    private No noEntradaFila;

    public Fila() {
        this.noEntradaFila = null;
    }

    public boolean filaIsEmpty(){
        return noEntradaFila == null ? true : false;
    }

    public void enqueue(No novoNo){
    novoNo.setRefNo(noEntradaFila);
    noEntradaFila = novoNo;
    }

    public No fist(){
        if(!filaIsEmpty()){
            No primeiroNo = noEntradaFila;
            while(primeiroNo.getRefNo() != null){
                primeiroNo = primeiroNo.getRefNo();
            }
            return primeiroNo;

        }else{
            return null;
        }
    }

    public No dequeue(){
        if(!filaIsEmpty()){
            No primeiroNo = noEntradaFila;
            No auxiliarNo = noEntradaFila;
            while(primeiroNo.getRefNo() != null){
                auxiliarNo = primeiroNo;
                primeiroNo = primeiroNo.getRefNo();
            }
            auxiliarNo.setRefNo(null);
            return primeiroNo;

        }else{
            return null;
        }
         
    }

    @Override
    public String toString() {

        String stringRetorno = "";
        No noAuxiliar = noEntradaFila;

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

    

