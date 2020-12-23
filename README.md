# BaseDatosInformaticaUNAM
Modificacion de proyecto original para crear el endpoint /clients/all que muestre todos los clientes de una base de datos de MariaDB, parte de la materia base de datos de informatica de la UNAM

Tuve que cambiar bastantes cosas más por intuición que por conocimiento ya que solo se programar por ahora en c# aquí los cambios en los archivos que llegue a tocar:
1)	ClientDto.java
•	Se cambio el nombre de la clase
•	Se cambio el tipo y nombre de las variables, por ejemplo “String paterno”
•	Se cambio el nombre de las @columnas por las que coincidieran con la lista de clientes.
•	Se modifico el nombre de los métodos para realizar el get y el set de las variables.
2)	StoreDao.java
•	Se importo la clase ClientDto en la cabecera del codigo
•	Se realizo el registro de ClientDto.class
•	Se enlisto el método getClients()
3)	StoreDal.java
•	Se importo la clase ClientDto en la cabecera del código
•	Se agrego el método getClients() y se modificaron los parámetros internos
4)	ClientsResource.java
•	Se importo la clase ClientDto en la cabecera del código
•	Se modifico el nombre de la clase para que coincidiera con el nombre del archivo
•	Se modifico el path
•	Se modificaron los strings y métodos por getClients()
En cada uno de los archivos de código anteriores podrá encontrar mis comentarios con los cambios.
