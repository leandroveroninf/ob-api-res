# Despliege de apps Spring Book Heroku

Crear archivo `system.properties` en el proyecto con el contenido

````
java.runtime.version=17
````

1. Crear una cuenta en Heroku y gitHub.com
2. Tener configurado git con el ordenador:
        1. `git.config.name = "leandroveroninf"`
        2. `git.config.email = leandroveroninf@gmail.com`
3. Subir el proyecto a git desde Intellij IDEA desde la opcion VCS > Shear projecton GitHub
4. Desde Heroku, crear app y eleguir el metodo github y buscar repocitorio
5. Habilitar desploy automatico y ejecutar Desploy