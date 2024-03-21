/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ferna
 */
public class Producto {
    String CodigoProducto;
    String NombreProducto;
    String NombreEmpleado;
    String CedulaEmpleado;
    int CantProductos;
    double PrecioProducto;
    int TipoProducto;
    double PrecioBrutoProducto;
    double GananciaEsperada;
    
public void Producto(String CodigoProducto, String NombreProducto, String NombreEmpleado, String CedulaEmpleado, int CantProductos, double PrecioProducto, int TipoProducto, double PrecioBrutoProducto, double GananciaEsperada){
    
}

    public void setCodigoProducto(String CodigoProducto) {
        this.CodigoProducto = CodigoProducto;
    }

    public void setNombreProducto(String NombreProducto) {
        this.NombreProducto = NombreProducto;
    }

    public void setNombreEmpleado(String NombreEmpleado) {
        this.NombreEmpleado = NombreEmpleado;
    }

    public void setCantProductos(int CantProductos) {
        this.CantProductos = CantProductos;
    }

    public void setPrecioProducto(double PrecioProducto) {
        this.PrecioProducto = PrecioProducto;
    }

    public void setTipoProducto(int TipoProducto) {
        this.TipoProducto = TipoProducto;
    }

    public void setPrecioBrutoProducto(double PrecioBrutoProducto) {
        this.PrecioBrutoProducto = PrecioBrutoProducto;
    }

    public void setGananciaEsperada(double GananciaEsperada) {
        this.GananciaEsperada = GananciaEsperada;
    }
    PrecioBruto();

private void PrecioBruto();
    switch (TipoProducto){
         case 1:
            PrecioBrutoProducto = PrecioProducto * 0.20 + PrecioProducto;
            break;
        case 2:
            PrecioBrutoProducto = PrecioProducto * 0.30 + PrecioProducto;
            break;
        case 3:
            PrecioBrutoProducto = PrecioProducto * 0.25 + PrecioProducto + 500;
            break;
        case 4:
            PrecioBrutoProducto = PrecioProducto * 0.19 + PrecioProducto * 0.04 + 1000 + PrecioProducto;
            break;       
    }
    }
private void Ganancia();
    GananciaEsperada = (PrecioBrutoProducto - PrecioProducto)* CantProductos;
}
public void Informacion(){
    System.out.println("Código del producto: "+CodigoProducto);
    System.out.println("Nombre del producto: "+NombreProducto);
    System.out.println("Nombre del empleado: " + NombreEmpleado);
    System.out.println("Cédula del empleado: " + CedulaEmpleado);
    System.out.println("Cantidad de productos: " +CantProductos);
    System.out.println("Precio base del producto: "+PrecioProducto);
    System.out.print("Tipo de producto: "+TipoProducto);
    switch (TipoProducto){
            case 1:
                System.out.println("Alimentos");
                break;
            case 2:
                System.out.println("Bebidas");
                break;
            case 3:
                System.out.println("Higiene");
                break;
            case 4:
                System.out.println("Limpieza");
                break;
        }
         System.out.println("Precio bruto: " + PrecioBrutoProducto);
         System.out.println("Ganancia esperada: " + GananciaEsperada);
}
}


