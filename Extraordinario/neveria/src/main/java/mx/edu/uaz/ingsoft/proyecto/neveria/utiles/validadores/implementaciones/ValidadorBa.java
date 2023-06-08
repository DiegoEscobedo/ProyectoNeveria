package mx.edu.uaz.ingsoft.proyecto.neveria.utiles.validadores.implementaciones;

import java.util.logging.Logger;
import static java.util.Objects.nonNull;

public class ValidadorBa<T> {
    public static final String RX_ONLY_ALPHABET = "[a-zA-Z]+";
    public static final String RX_ALFANUMERIC = "[a-zA-Z0-9]+";

    private boolean resultadoEvaluacion;
    private String cadenaEvaluada;
    private Long   valorEnteroEvaluado;
    private Double valorDoubleEvaluado;
    private final Class tipoComparado;

    private ValidadorBa(Class tipo){
        tipoComparado = tipo;
        resultadoEvaluacion = true;
    }

    private ValidadorBa(String cadena){
        this(String.class);
        this.cadenaEvaluada = cadena;
    }

    public static ValidadorBa stringValidador(String cadena) {
        return new ValidadorBa(cadena);
    }
    public static ValidadorBa integerValidador(long entero) {
        return new ValidadorBa(entero);
    }

    public static ValidadorBa doubleValidador(Double p){
        return new ValidadorBa(p);
    }

    public boolean evaluar(){
        return resultadoEvaluacion;
    }
    public boolean getEvaluacion(){
        return resultadoEvaluacion;
    }

    public ValidadorBa(Long valor){
        this(Long.class);
        this.valorEnteroEvaluado = valor;
    }
    public ValidadorBa(Double valor2){
        this(Double.class);
        this.valorDoubleEvaluado = valor2;
    }
    public ValidadorBa noEsNulo(){
        if (!resultadoEvaluacion) {
            return this;
        }
        if (String.class == tipoComparado){
            resultadoEvaluacion = nonNull(cadenaEvaluada);
        }else{
            resultadoEvaluacion = nonNull(valorEnteroEvaluado);
        }
        return this;
    }
    public ValidadorBa limpiar(){
        if (nonNull(cadenaEvaluada)) {
            cadenaEvaluada = cadenaEvaluada.trim();
        }else{
            Logger.getAnonymousLogger().severe("Se intento limpiar una cadena NULL");
        }
        return this;
    }

    public ValidadorBa noVacia(){
        if (!resultadoEvaluacion) {
            return this;
        }
        resultadoEvaluacion = !cadenaEvaluada.isEmpty();
        return this;
    }
    public ValidadorBa esVacia(){
        if (!resultadoEvaluacion) {
            return this;
        }
        resultadoEvaluacion =  cadenaEvaluada.isEmpty();
        return this;
    }
    public ValidadorBa soloAlfabeticas(){
        if (!resultadoEvaluacion) {
            return this;
        }
        resultadoEvaluacion =  cadenaEvaluada.matches(RX_ONLY_ALPHABET);
        return this;
    }
    public ValidadorBa soloAlfaNumericas(){
        if (!resultadoEvaluacion) {
            return this;
        }
        resultadoEvaluacion =  cadenaEvaluada.matches(RX_ALFANUMERIC);
        return this;
    }
    public ValidadorBa cumpleRegExp(String re){
        if (!resultadoEvaluacion) {
            return this;
        }
        resultadoEvaluacion =  cadenaEvaluada.matches(re);
        return this;
    }
    public ValidadorBa menorQue(long limite){
        resultadoEvaluacion =  valorEnteroEvaluado < limite;
        return this;
    }
    public ValidadorBa mayorQue(long limite){
        resultadoEvaluacion =  valorEnteroEvaluado > limite;
        return this;
    }
    public ValidadorBa mayorQueDouble(double min){
        resultadoEvaluacion=valorDoubleEvaluado>min;
        return this;
    }
    public ValidadorBa menorIgualQue(long limite){
        resultadoEvaluacion =  valorEnteroEvaluado <= limite;
        return this;
    }
    public ValidadorBa mayorIgualQue(long limite){
        resultadoEvaluacion =  valorEnteroEvaluado >= limite;
        return this;
    }
    public ValidadorBa valorEntre(long limInferior, long limSuperior){
        resultadoEvaluacion = (limInferior <= valorEnteroEvaluado) && (valorEnteroEvaluado <= limSuperior);
        return this;
    }
    public ValidadorBa cadenaSizeMin(int sMin) {
        if (!resultadoEvaluacion) {
            return this;
        }
        resultadoEvaluacion = this.cadenaEvaluada.length() >= sMin;
        return this;
    }
    public ValidadorBa cadenaSizeBetween(int sMin,int sMax) {
        if (!resultadoEvaluacion) {
            return this;
        }

        resultadoEvaluacion = (this.cadenaEvaluada.length() >= sMin)&& (this.cadenaEvaluada.length() <= sMax);
        return this;
    }
    public ValidadorBa cadenaSizeEquals(int sizeCadena) {
        if (!resultadoEvaluacion) {
            return this;
        }
        resultadoEvaluacion = this.cadenaEvaluada.length() == sizeCadena;

        return this;
    }
    public ValidadorBa cadenaSizeMax(int sMax) {
        if (!resultadoEvaluacion) {
            return this;
        }
        resultadoEvaluacion = this.cadenaEvaluada.length() <= sMax;
        return this;
    }

    public ValidadorBa validarTipo(String tipoV,String tipoV2){
        if (!resultadoEvaluacion){
            return this;
        }
        resultadoEvaluacion =  cadenaEvaluada.matches(tipoV);
        resultadoEvaluacion =  cadenaEvaluada.matches(tipoV2);
        return this;
    }public ValidadorBa validarTaP(String tipoV,String tipoV2){
        if (!resultadoEvaluacion){
            return this;
        }
        resultadoEvaluacion =  cadenaEvaluada.matches(tipoV);
        resultadoEvaluacion =  cadenaEvaluada.matches(tipoV2);
        return this;
    }

}
