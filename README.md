# RestApiCrudPolitecnico
NOTA ACLARATORIA: Reconozco que este api rest no esta completo ni cumple con todos los requisitos que se piden en la prueba tecnica, 
puse mi mayor esfuerzo para crear esta API, con esto doy a entender que soy un estudiante sin experiencia en el area de trabajo que no tiene la practica sificiente en el 
desarrollo de API, pero tengo muchas otras habilidades en el area del desarrollo de software.

API Documentation en Swagger ------> https://apipolitecnico.uc.r.appspot.com/swagger-ui/index.html#/ 

-----HOW TO RUN------
Para obtener todos los registros de una entidad utilice las siguientes URL:
GET
https://apipolitecnico.uc.r.appspot.com/aula
https://apipolitecnico.uc.r.appspot.com/estudiante
https://apipolitecnico.uc.r.appspot.com/profesor

Para insertar datos en una entidad utilice las siguientes URL:
POST
https://apipolitecnico.uc.r.appspot.com/aula
https://apipolitecnico.uc.r.appspot.com/estudiante
https://apipolitecnico.uc.r.appspot.com/profesor

Para ingresar un registro nuevo debe indicarlo sin el identificacor en este caso el id,
ya que este se genera automatico, los esquemas contienen el id, para agregar un nuevo registro
debe obviar el id de lo contrario se realizara una actualizacion del registro con el id introducido en el schema.

- El Schema de la entidad Profesor es el siguiente:
{
apellidos	        string
fecha_creacion	  string
fecha_eliminacion	string
genero	          string
id	              integer($int64)
nombre	          string
telefono	        string
}

- El Schema de la entidad Estudiante es el siguiente:
{
apellidos	  string
genero	    string
id	        integer($int64)
nombre	    string
telefono	  string
}
- El Schema de la entidad Aula es el siguiente:
{
cupo	     integer($int32)
id	       integer($int64)
ubicacion	 string
}


Para eliminar registros de una entidad:
DELETE
https://apipolitecnico.uc.r.appspot.com/aula
https://apipolitecnico.uc.r.appspot.com/estudiante
https://apipolitecnico.uc.r.appspot.com/profesor

Cada una de las url seguido del Identificador de ese registro, ejemplo:
https://apipolitecnico.uc.r.appspot.com/estudiante/2




