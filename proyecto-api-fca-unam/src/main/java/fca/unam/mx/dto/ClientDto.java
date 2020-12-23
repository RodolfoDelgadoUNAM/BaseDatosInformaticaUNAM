package fca.unam.mx.dto;

import org.jdbi.v3.core.mapper.reflect.ColumnName;

public class ClientDto {
    private Long id;
    private String name;
    private String paterno;//se cambio por paterno y el tipo a string
    private String materno;//se cambio por materno y el tipo a string
    private String rfc;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ColumnName("nombre")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ColumnName("apellido_paterno") //Se cambio nombre de columna
    public String getpaterno() {//se cambio nombre de metodo
        return paterno;//se cambio por paterno
    }

    public void setpaterno(String paterno) {//se cambio nombre de metodo
        this.paterno = paterno;//se cambio por paterno
    }

    @ColumnName("apellido_materno")//Se cambio nombre de columna
    public String getmaterno() {//se cambio nombre de metodo
        return this.materno;//se cambio por materno
    }

    public void setmaterno(String materno) {//se cambio nombre de metodo
        this.materno = materno;//se cambio por materno
    }

    @ColumnName("rfc")
    public String getrfc() {
        return rfc;
    }

    public void setrfc(String rfc) {
        this.rfc = rfc;
    }

}
