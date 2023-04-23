# EX02
API Clinica dental

## Cliente
GET
  * /api/cliente (Visualizar todos los clientes)
  * /cliente/{id} (Visualizar datos de usuario: Req. 1)
  
PUT
  * /api/cliente/{id} (Modificacion datos de usuario: Req. 2)
  
  
## Dentista
GET
  * /api/dentista/clientes (Visualizar todos los clientes registrados: Req. 8)
  * /api/dentista/citas (Visualizar todas las citas: Req. 7)
  * /api/dentista/{id} (Visualizar dentista)
  
POST
  * /api/dentista (Crear dentista)
  
PUT
  * /api/dentista/{id} (Actualizar datos dentista)

DELETE
  * /api/dentista/{id} (Borrar dentista)
  
## Cita
GET
  * /api/cita (Visualizar citas)
  * /api/cita/{id} (Visualizar cita)
  * /api/cita/cliente/{id} (Visualizar citas de un determinado usuario: Req. 6)

POST
  * /api/cita (Creación de cita: Requerimiento 3)
  
PUT
  * /api/cita/{id} (Modificacion de cita: Requerimiento 4)

DELETE
  * /api/cita/{id} (Requerimiento 5)
