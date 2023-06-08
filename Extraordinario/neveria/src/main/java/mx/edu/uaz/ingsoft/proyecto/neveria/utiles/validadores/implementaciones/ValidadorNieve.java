package mx.edu.uaz.ingsoft.proyecto.neveria.utiles.validadores.implementaciones;

import mx.edu.uaz.ingsoft.proyecto.neveria.modelo.dominio.ProductoNieve;
import mx.edu.uaz.ingsoft.proyecto.neveria.utiles.validadores.interfaces.IValidadorEntidad;

import java.util.logging.Logger;

public class ValidadorNieve implements IValidadorEntidad<ProductoNieve> {
    @Override
    public boolean validar(ProductoNieve entidad) {
        if (entidad==null){
            Logger.getAnonymousLogger().info("La nieve no es valida");
            return false;
        }
        ValidadorBa vldSabor,vldTipo,vldTamano,vlsPRecio,vldActivo;
        Logger.getAnonymousLogger().info(entidad.toString());
        vldSabor=ValidadorBa.stringValidador(entidad.getsabor_nieve())
                .noEsNulo()
                .limpiar()
                .cadenaSizeMin(3)
                .soloAlfabeticas();
        vldTipo=ValidadorBa.stringValidador((entidad.getTipo_nieve()))
                .noEsNulo()
                .limpiar()
                .cadenaSizeMin(3)

                .soloAlfabeticas();
        vldTamano=ValidadorBa.stringValidador(entidad.gettamaño_nieve())
                .noEsNulo()
                .limpiar()

                .soloAlfabeticas();
        vlsPRecio=ValidadorBa.doubleValidador(entidad.getPrecio_nieve())
                .mayorQueDouble(10);
        Logger.getAnonymousLogger().info("evSabor= "+vldSabor.evaluar()+", evTamaño= "+vldTamano.evaluar()+", evTipo= "+vldTipo.evaluar()+", evPrecio= "+vlsPRecio.evaluar());
        return vldSabor.evaluar() &&  vldTamano.evaluar() && vldTipo.evaluar() && vlsPRecio.evaluar();
    }
}
