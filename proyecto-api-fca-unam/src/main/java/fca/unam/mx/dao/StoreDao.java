package fca.unam.mx.dao;


import fca.unam.mx.dto.ProductDto;
import fca.unam.mx.dto.ClientDto;//Agregue esta importacion
import org.jdbi.v3.sqlobject.config.RegisterBeanMapper;
import org.jdbi.v3.sqlobject.customizer.BindBean;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import java.util.List;

public interface StoreDao {

    @RegisterBeanMapper(ClientDto.class) //agregue este comando y modifique por la clase CLientDto
    @SqlQuery("SELECT * FROM clientes")
    List<ClientDto> getClients();//puse el metodo getClients

    @RegisterBeanMapper(ProductDto.class)
    @SqlQuery("SELECT * FROM productos")
    List<ProductDto> getProducts();

    @SqlUpdate("INSERT INTO productos (nombre, descripcion, precio, cantidad, sku) VALUES(:p.name, :p.description, :p.price, :p.quantity, :p.sku)")
    void addProduct(@BindBean("p") ProductDto productDto);


}
