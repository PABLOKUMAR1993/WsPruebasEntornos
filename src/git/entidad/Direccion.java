package git.entidad;

public class Direccion {

    private String tipoVia, nombreVia, CP, ciudad;

    public Direccion(String tipoVia, String nombreVia, String CP) {
        this.tipoVia = tipoVia;
        this.nombreVia = nombreVia;
        this.CP = CP;
    }

    public String getTipoVia() {
        return tipoVia;
    }

    public void setTipoVia(String tipoVia) {
        this.tipoVia = tipoVia;
    }

    public String getNombreVia() {
        return nombreVia;
    }

    public void setNombreVia(String nombreVia) {
        this.nombreVia = nombreVia;
    }

    public String getCP() {
        return CP;
    }

    public void setCP(String CP) {
        this.CP = CP;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
