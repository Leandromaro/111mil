package ejercicio7y8;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Tiempop {
    private String fechanac;
    private DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
    private Date fecha;

    public String getFecha() throws ParseException{
        this.fecha = format.parse(fechanac);
        return this.format.format(this.fecha);
    }

    public void setFecha(String fechanac) {
        this.fechanac = fechanac;
    }
    
}
