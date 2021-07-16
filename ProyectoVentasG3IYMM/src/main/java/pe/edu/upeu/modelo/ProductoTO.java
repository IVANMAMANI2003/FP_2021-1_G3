package pe.edu.upeu.modelo;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ProductoTO {
    
    public String idproducto, nombre, idCeteg, unidaMed;
    public double precioUnit, porcentUtil, stok;
    
}
