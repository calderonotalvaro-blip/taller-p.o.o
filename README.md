¿Qué diferencias hay entre un constructor y un método?
- que el constructor no tiene tipo de retorno , mientras que el metodo siempre declara que devuelve
- que el constructor se ejecuta 1 vez y el metodo se puede ejecutar veces infinitas o las que quiera 
- los constructores no se heredan y el metodo si 


¿Por qué new Paquete() dejó de compilar en la Etapa 2? ¿Qué harías si la empresa necesitara seguir creando
paquetes sin datos?
- porque  java solo proporciona el constructor sin parametros y pondria en paquete un constructor vacio


¿Qué ocurriría si en el constructor de Paquete escribieras peso = peso; en lugar de this.peso = peso;? ¿El
programa compilaría?
-puede compilar pero no serviria 

¿Qué es la firma de un método y por qué el tipo de retorno no sirve para distinguir dos versiones
sobrecargadas?
-es o que usa java para identificarlo deforma unica 

¿Qué ventaja tiene que los constructores abreviados de Paquete deleguen con this(...) en lugar de asignar los
atributos ellos mismos?
-es que centra el trabajo para no repetir codigo 
