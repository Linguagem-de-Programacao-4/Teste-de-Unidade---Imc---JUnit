package imc;

public class Imc {

    private double peso, altura;
    private boolean sexo;

    public Imc() {
        this.peso = peso;
        this.altura = altura;
        this.sexo = sexo;
    }

    public String calculaImc(){
        double imc = (peso / (altura*altura));

        if(sexo){ // fem
            if(imc<19.1){
                return "Abaixo do peso";
            }else{
                if(imc<25.8){
                    return "No peso Normal";
                }else{
                    if(imc<27.3){
                        return "Marginalmente acima do peso";
                    }else{
                        if(imc<32.3){
                            return "Acima do peso ideal";
                        }else{
                            return "Obeso";
                        }
                    }
                }
            }

        }else{ // masc
            if(imc<20.7){
                return "Abaixo do peso";
            }else{
                if(imc<26.4){
                    return "No peso Normal";
                }else{
                    if(imc<27.8){
                        return "Marginalmente acima do peso";
                    }else{
                        if(imc<31.1){
                            return "Acima do peso ideal";
                        }else{
                            return "Obeso";
                        }
                    }
                }
            }
        }
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

}

