#!/bin/bash

# Navegar a la carpeta donde CodeDeploy dejó los archivos
cd /var/www/html

# Ejecutar tu clase de Java para que cree el info.txt
java InfoServer

# Darle permisos de Apache al nuevo archivo info.txt para que se pueda ver en la web
chown apache:apache info.txt