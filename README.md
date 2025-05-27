# $REPO_NAME
# Por favor, completar con información sobre el repositorio.

Recomendaciones para el uso del arquetipo:

1. Los services siempre devuelven una clase que este dentro de /domain/models/responses. 
2. El service llama a un mapper alojado en /infrastructure/mapper que se encargue de convertir el pojo con el que se venga trabajando a la salida del servicio.
3. Los dtos /models/dtos/* los usamos para todas las comunicaciones de infrastructura y para agrupar datos cuando sea necesario. Normalmente los repositorios nos devuelven estos pojos.
4. Dentro de models/repositories se insertan las interfaces de los repositorios. Las implementaciones de estos van en la capa de infrastructure.
5. Si hubiera validaciones de negocio antes de entrar al servicio estás irian en un paquete validator dentro de models y serían llamadas desde el controlador.
6. Exceptuando los validators, el controlador llama al servicio. La relación entre controlador y servicio debe ser 1 a 1.
7. Los test unitarios se deben hacer de todas las clases. Solamente hay creado un ejemplo para dar una idea de como realizarlos de forma sencilla. (Si cuesta realizar el test de una clase, repensar diseño del código)
8. Las clases de test deben llevar la extension *Test.java en el nombre.

