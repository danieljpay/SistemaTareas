# Sistema de tareas
Sistema para organizar tareas con fecha de entrega y costo.

# Descripción
Sistema de organización de tareas en el cuál es posible agregar personas y asignarle tareas conforme se requiera, a cada tarea que se le agregue a la persona se le puede establecer un costo y fecha de entrega; todo esto está pensado para alguna persona que se dedique a hacer tareas de otras personas y gane dinero por cada tarea que realice, manteniendo una organización con las tareas como con las deudas de sus clientes.

# Instalación
Solo se necesita clonar el repositorio con ``git clone`` seguido del enlace del repositorio o en dado caso copiar las clases.

# Modo de uso
1. Se agrega el nombre del cliente que pidió que le realicen una tarea en el apartado *Ingresar nombre*.
2. Se presiona a la persona que se le desea agregar la tarea.
3. En el apartado de *Agregar tarea* se escribe la tarea, costo (obligatorios) y la fecha de entrega (opcional).
4. Presionar el botón **Agregar tarea** para que la tarea esté asignada a la respectiva persona.
5. En el cuadro debajo de el apartado **Agregar tarea** aparecerán las tareas asignadas a cada persona y si se le presiona a una tarea le indicará la fecha de entrega de esta y el monto a cobrar a la persona por la suma del costo de las tareas.
6. En el apartado de *Abonar* se le debe ingresar la cantidad que se le desea abonar a la persona (anteriormente seleccionada) y presionar el botón **Abonar** para que se le reste la cantidad que debe esta.

- Si se desea eliminar una persona solo se selecciona en el cuadro de nombres y presiona el botón **Eliminar**.

# Contribuir
El sistema funciona correctamente pero tiene el problema de que no guarda datos, se intentó que lo serializa en algún archivo pero desconozco la razón del porqué no se logra, el código del intento se puede encontrar en la clase Controller hasta abajo como ``//Serialización beta`` y ``//Deserialización beta``.

# Licencia
MIT License
