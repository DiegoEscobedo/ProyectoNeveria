package mx.edu.uaz.ingsoft.proyecto.neveria.utiles.validadores.implementaciones;

import mx.edu.uaz.ingsoft.proyecto.neveria.modelo.dominio.ProductoPaleta;
import mx.edu.uaz.ingsoft.proyecto.neveria.utiles.validadores.interfaces.IValidadorEntidad;

import java.util.logging.Logger;

public class ValidadorPaleta implements IValidadorEntidad<ProductoPaleta> {
    @Override
    public boolean validar(ProductoPaleta entidad) {
        if(entidad==null){
            Logger.getAnonymousLogger().info("La paleta no es valida");
            return false;
        }
        ValidadorBa vldSabor,vldTipo,vldTamano,vlsPRecio;

        Logger.getAnonymousLogger().info(entidad.toString());
        vldSabor=ValidadorBa.stringValidador(entidad.getsabor_paleta())
                .noEsNulo()
                .limpiar()
                .cadenaSizeMin(3)
                .soloAlfabeticas();
        vldTipo=ValidadorBa.stringValidador((entidad.getTipo_paleta()))
                .noEsNulo()
                .limpiar()
                .cadenaSizeMin(3)
                .soloAlfabeticas();
        vldTamano=ValidadorBa.stringValidador(entidad.gettamaño_paleta())
                .noEsNulo()
                .limpiar()
                .cadenaSizeMin(3)
                .soloAlfabeticas();
        vlsPRecio=ValidadorBa.doubleValidador(entidad.getPrecio_paleta())
                .mayorQueDouble(10);
        Logger.getAnonymousLogger().info("evSabor= "+vldSabor.evaluar()+", evTamaño= "+vldTamano.evaluar()+", evTipo= "+vldTipo.evaluar()+", evPrecio= "+vlsPRecio.evaluar());
        return vldSabor.evaluar() &&  vldTamano.evaluar() && vldTipo.evaluar() && vlsPRecio.evaluar();
    }
}
