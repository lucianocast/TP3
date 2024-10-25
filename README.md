Patrón Adapter (Ejercicio de la aplicación de música)
Explicación: El patrón Adapter lo usamos cuando necesitamos que dos interfaces que no son compatibles trabajen juntas, como en este caso: teníamos la interfaz MusicPlayer y el servicio externo ThirdPartyAudioPlayer, cada uno con métodos distintos para reproducir música.

Para hacer que el servicio externo funcione con la aplicación sin romper nada, implementamos un adaptador (AudioPlayerAdapter), que se encarga de traducir las llamadas entre las dos interfaces. Es decir, se le dice al adaptador que reproduzca una canción y él se encarga de decirle al otro reproductor cómo hacerlo. Con esto, no modificás el código existente, lo que hace que todo funcione de manera prolija y manteniendo el código limpio.

Patrón Composite (Ejercicio del sistema de gestión de archivos)
Explicación: El patrón Composite es ideal cuando queremos manejar objetos simples (como archivos) y compuestos (como directorios) de la misma manera. En este caso, tanto archivos como directorios se tratan de forma uniforme. Los directorios pueden tener archivos y otros directorios adentro, como una especie de estructura jerárquica.

Creamos una clase abstracta FileSystemComponent que define el comportamiento común, y después hicimos que File y Directory hereden de ella. Los directorios pueden tener una lista de estos componentes, lo que te permite armar estructuras de árbol bien jerárquicas. Con el método showDetails(), podés ver el contenido de un directorio de forma recursiva, o sea, que te va mostrando todo lo que hay adentro.

Patrón Template Method (Ejercicio del sistema de pasteles)
Explicación: El patrón Template Method se usa cuando querés definir un flujo común de pasos para varias cosas, pero dejando que algunos pasos varíen según el tipo. En este caso, todos los pasteles tienen los mismos pasos generales (preparar ingredientes, hornear, decorar y empaquetar), pero los detalles varían según si es un pastel de chocolate o de vainilla.

La clase abstracta Cake define el método makeCake(), que organiza todo el proceso, y las subclases (ChocolateCake y VanillaCake) se encargan de los detalles, como los ingredientes y la decoración. Así, compartimos código para los pasos comunes, y proporciona flexibilidad para que las subclases definan los detalles específicos de cada pastel.
