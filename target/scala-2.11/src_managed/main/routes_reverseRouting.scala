// @SOURCE:C:/Users/Ivan/Documents/ivan/repo-codigo/proyecto/proyecto-encomiendas/conf/routes
// @HASH:791ab351fafd4b54e7bcfbb778d05d8106f3ed81
// @DATE:Tue May 19 01:40:44 ART 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:88
// @LINE:86
// @LINE:84
// @LINE:82
// @LINE:80
// @LINE:78
// @LINE:76
// @LINE:74
// @LINE:68
// @LINE:64
// @LINE:62
// @LINE:60
// @LINE:58
// @LINE:56
// @LINE:54
// @LINE:52
// @LINE:50
// @LINE:48
// @LINE:46
// @LINE:44
// @LINE:42
// @LINE:39
// @LINE:37
// @LINE:31
// @LINE:29
// @LINE:27
// @LINE:25
// @LINE:21
// @LINE:19
// @LINE:17
// @LINE:15
// @LINE:13
// @LINE:9
// @LINE:6
package controllers {

// @LINE:9
class ReverseAssets {


// @LINE:9
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:27
// @LINE:25
// @LINE:21
// @LINE:19
// @LINE:17
// @LINE:15
// @LINE:13
class ReversePuntoDeVentaController {


// @LINE:21
def eliminarPunto(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "admin/puntos-de-venta/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:19
def modificarPunto(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "admin/puntos-de-venta/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:27
def listarLocalidades(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "admin/localidad")
}
                        

// @LINE:25
def listarTipoPdv(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "admin/tipo-puntos-de-venta")
}
                        

// @LINE:17
def listarPuntos(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "admin/puntos-de-venta")
}
                        

// @LINE:15
def getPunto(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "admin/puntos-de-venta/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:13
def agregarPunto(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "admin/puntos-de-venta")
}
                        

}
                          

// @LINE:88
// @LINE:86
// @LINE:84
// @LINE:82
// @LINE:80
// @LINE:78
// @LINE:76
// @LINE:74
// @LINE:68
class ReverseEncomiendaController {


// @LINE:84
def despacharEncomienda(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "ventas/encomiendas/despachar/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:78
def getEncomienda(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "ventas/encomiendas/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:76
def generarOrden(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "ventas/encomiendas/punto-de-venta/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:80
def listarEstados(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "ventas/nombre-estados-encomienda")
}
                        

// @LINE:88
def entregarEncomienda(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "ventas/encomiendas/entregar/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:82
def listarHistoricoEstados(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "ventas/encomiendas/estados/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:74
def getVenta(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "ventas/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:86
def recibirEncomienda(id:Long, punto:Long): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "ventas/encomiendas/recibir/" + implicitly[PathBindable[Long]].unbind("id", id) + "/" + implicitly[PathBindable[Long]].unbind("punto", punto))
}
                        

// @LINE:68
def crearVenta(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "ventas")
}
                        

}
                          

// @LINE:31
// @LINE:29
class ReverseSecurityController {


// @LINE:31
def logout(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "logout")
}
                        

// @LINE:29
def login(usuario:String, pass:String): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "login/" + implicitly[PathBindable[String]].unbind("usuario", dynamicString(usuario)) + "/" + implicitly[PathBindable[String]].unbind("pass", dynamicString(pass)))
}
                        

}
                          

// @LINE:6
class ReverseApplication {


// @LINE:6
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

}
                          

// @LINE:64
// @LINE:62
// @LINE:60
// @LINE:58
// @LINE:56
// @LINE:54
// @LINE:52
// @LINE:50
// @LINE:48
// @LINE:46
// @LINE:44
// @LINE:42
// @LINE:39
// @LINE:37
class ReversePersonaController {


// @LINE:58
def cesarEmpleado(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "admin/empleados/cesar/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:50
def listarEmpleados(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "admin/empleados")
}
                        

// @LINE:42
// @LINE:37
def crearCliente(): Call = {
   () match {
// @LINE:37
case ()  =>
  import ReverseRouteContext.empty
  Call("POST", _prefix + { _defaultPrefix } + "admin/clientes")
                                         
   }
}
                                                

// @LINE:46
// @LINE:44
def getPersona(id:Long): Call = {
   (id: @unchecked) match {
// @LINE:44
case (id)  =>
  import ReverseRouteContext.empty
  Call("GET", _prefix + { _defaultPrefix } + "admin/clientes/" + implicitly[PathBindable[Long]].unbind("id", id))
                                         
   }
}
                                                

// @LINE:52
def modificarEmpleado(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "admin/empleados/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:64
// @LINE:62
def eliminarCliente(id:Long): Call = {
   (id: @unchecked) match {
// @LINE:62
case (id)  =>
  import ReverseRouteContext.empty
  Call("DELETE", _prefix + { _defaultPrefix } + "admin/clientes/" + implicitly[PathBindable[Long]].unbind("id", id))
                                         
   }
}
                                                

// @LINE:48
def listarClientes(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "admin/clientes")
}
                        

// @LINE:39
def crearEmpleado(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "admin/empleados")
}
                        

// @LINE:60
def rehabilitarEmpleado(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "admin/empleados/rehabilitar/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:56
// @LINE:54
def modificarCliente(id:Long): Call = {
   (id: @unchecked) match {
// @LINE:54
case (id)  =>
  import ReverseRouteContext.empty
  Call("PUT", _prefix + { _defaultPrefix } + "admin/clientes/" + implicitly[PathBindable[Long]].unbind("id", id))
                                         
   }
}
                                                

}
                          
}
                  


// @LINE:88
// @LINE:86
// @LINE:84
// @LINE:82
// @LINE:80
// @LINE:78
// @LINE:76
// @LINE:74
// @LINE:68
// @LINE:64
// @LINE:62
// @LINE:60
// @LINE:58
// @LINE:56
// @LINE:54
// @LINE:52
// @LINE:50
// @LINE:48
// @LINE:46
// @LINE:44
// @LINE:42
// @LINE:39
// @LINE:37
// @LINE:31
// @LINE:29
// @LINE:27
// @LINE:25
// @LINE:21
// @LINE:19
// @LINE:17
// @LINE:15
// @LINE:13
// @LINE:9
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:9
class ReverseAssets {


// @LINE:9
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:27
// @LINE:25
// @LINE:21
// @LINE:19
// @LINE:17
// @LINE:15
// @LINE:13
class ReversePuntoDeVentaController {


// @LINE:21
def eliminarPunto : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PuntoDeVentaController.eliminarPunto",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/puntos-de-venta/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:19
def modificarPunto : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PuntoDeVentaController.modificarPunto",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/puntos-de-venta/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:27
def listarLocalidades : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PuntoDeVentaController.listarLocalidades",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/localidad"})
      }
   """
)
                        

// @LINE:25
def listarTipoPdv : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PuntoDeVentaController.listarTipoPdv",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/tipo-puntos-de-venta"})
      }
   """
)
                        

// @LINE:17
def listarPuntos : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PuntoDeVentaController.listarPuntos",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/puntos-de-venta"})
      }
   """
)
                        

// @LINE:15
def getPunto : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PuntoDeVentaController.getPunto",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/puntos-de-venta/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:13
def agregarPunto : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PuntoDeVentaController.agregarPunto",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/puntos-de-venta"})
      }
   """
)
                        

}
              

// @LINE:88
// @LINE:86
// @LINE:84
// @LINE:82
// @LINE:80
// @LINE:78
// @LINE:76
// @LINE:74
// @LINE:68
class ReverseEncomiendaController {


// @LINE:84
def despacharEncomienda : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EncomiendaController.despacharEncomienda",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "ventas/encomiendas/despachar/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:78
def getEncomienda : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EncomiendaController.getEncomienda",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ventas/encomiendas/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:76
def generarOrden : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EncomiendaController.generarOrden",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ventas/encomiendas/punto-de-venta/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:80
def listarEstados : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EncomiendaController.listarEstados",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ventas/nombre-estados-encomienda"})
      }
   """
)
                        

// @LINE:88
def entregarEncomienda : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EncomiendaController.entregarEncomienda",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "ventas/encomiendas/entregar/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:82
def listarHistoricoEstados : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EncomiendaController.listarHistoricoEstados",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ventas/encomiendas/estados/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:74
def getVenta : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EncomiendaController.getVenta",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ventas/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:86
def recibirEncomienda : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EncomiendaController.recibirEncomienda",
   """
      function(id,punto) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "ventas/encomiendas/recibir/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("punto", punto)})
      }
   """
)
                        

// @LINE:68
def crearVenta : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EncomiendaController.crearVenta",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "ventas"})
      }
   """
)
                        

}
              

// @LINE:31
// @LINE:29
class ReverseSecurityController {


// @LINE:31
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SecurityController.logout",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:29
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SecurityController.login",
   """
      function(usuario,pass) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("usuario", encodeURIComponent(usuario)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("pass", encodeURIComponent(pass))})
      }
   """
)
                        

}
              

// @LINE:6
class ReverseApplication {


// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

}
              

// @LINE:64
// @LINE:62
// @LINE:60
// @LINE:58
// @LINE:56
// @LINE:54
// @LINE:52
// @LINE:50
// @LINE:48
// @LINE:46
// @LINE:44
// @LINE:42
// @LINE:39
// @LINE:37
class ReversePersonaController {


// @LINE:58
def cesarEmpleado : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PersonaController.cesarEmpleado",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/empleados/cesar/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:50
def listarEmpleados : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PersonaController.listarEmpleados",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/empleados"})
      }
   """
)
                        

// @LINE:42
// @LINE:37
def crearCliente : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PersonaController.crearCliente",
   """
      function() {
      if (true) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/clientes"})
      }
      if (true) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "clientes"})
      }
      }
   """
)
                        

// @LINE:46
// @LINE:44
def getPersona : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PersonaController.getPersona",
   """
      function(id) {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/clientes/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/empleados/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
      }
   """
)
                        

// @LINE:52
def modificarEmpleado : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PersonaController.modificarEmpleado",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/empleados/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:64
// @LINE:62
def eliminarCliente : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PersonaController.eliminarCliente",
   """
      function(id) {
      if (true) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/clientes/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
      if (true) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "clientes/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
      }
   """
)
                        

// @LINE:48
def listarClientes : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PersonaController.listarClientes",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/clientes"})
      }
   """
)
                        

// @LINE:39
def crearEmpleado : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PersonaController.crearEmpleado",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/empleados"})
      }
   """
)
                        

// @LINE:60
def rehabilitarEmpleado : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PersonaController.rehabilitarEmpleado",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/empleados/rehabilitar/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:56
// @LINE:54
def modificarCliente : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PersonaController.modificarCliente",
   """
      function(id) {
      if (true) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/clientes/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
      if (true) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "clientes/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
      }
   """
)
                        

}
              
}
        


// @LINE:88
// @LINE:86
// @LINE:84
// @LINE:82
// @LINE:80
// @LINE:78
// @LINE:76
// @LINE:74
// @LINE:68
// @LINE:64
// @LINE:62
// @LINE:60
// @LINE:58
// @LINE:56
// @LINE:54
// @LINE:52
// @LINE:50
// @LINE:48
// @LINE:46
// @LINE:44
// @LINE:42
// @LINE:39
// @LINE:37
// @LINE:31
// @LINE:29
// @LINE:27
// @LINE:25
// @LINE:21
// @LINE:19
// @LINE:17
// @LINE:15
// @LINE:13
// @LINE:9
// @LINE:6
package controllers.ref {


// @LINE:9
class ReverseAssets {


// @LINE:9
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:27
// @LINE:25
// @LINE:21
// @LINE:19
// @LINE:17
// @LINE:15
// @LINE:13
class ReversePuntoDeVentaController {


// @LINE:21
def eliminarPunto(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PuntoDeVentaController.eliminarPunto(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.PuntoDeVentaController", "eliminarPunto", Seq(classOf[Long]), "DELETE", """""", _prefix + """admin/puntos-de-venta/$id<[^/]+>""")
)
                      

// @LINE:19
def modificarPunto(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PuntoDeVentaController.modificarPunto(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.PuntoDeVentaController", "modificarPunto", Seq(classOf[Long]), "PUT", """""", _prefix + """admin/puntos-de-venta/$id<[^/]+>""")
)
                      

// @LINE:27
def listarLocalidades(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PuntoDeVentaController.listarLocalidades(), HandlerDef(this.getClass.getClassLoader, "", "controllers.PuntoDeVentaController", "listarLocalidades", Seq(), "GET", """""", _prefix + """admin/localidad""")
)
                      

// @LINE:25
def listarTipoPdv(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PuntoDeVentaController.listarTipoPdv(), HandlerDef(this.getClass.getClassLoader, "", "controllers.PuntoDeVentaController", "listarTipoPdv", Seq(), "GET", """""", _prefix + """admin/tipo-puntos-de-venta""")
)
                      

// @LINE:17
def listarPuntos(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PuntoDeVentaController.listarPuntos(), HandlerDef(this.getClass.getClassLoader, "", "controllers.PuntoDeVentaController", "listarPuntos", Seq(), "GET", """""", _prefix + """admin/puntos-de-venta""")
)
                      

// @LINE:15
def getPunto(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PuntoDeVentaController.getPunto(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.PuntoDeVentaController", "getPunto", Seq(classOf[Long]), "GET", """""", _prefix + """admin/puntos-de-venta/$id<[^/]+>""")
)
                      

// @LINE:13
def agregarPunto(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PuntoDeVentaController.agregarPunto(), HandlerDef(this.getClass.getClassLoader, "", "controllers.PuntoDeVentaController", "agregarPunto", Seq(), "POST", """""", _prefix + """admin/puntos-de-venta""")
)
                      

}
                          

// @LINE:88
// @LINE:86
// @LINE:84
// @LINE:82
// @LINE:80
// @LINE:78
// @LINE:76
// @LINE:74
// @LINE:68
class ReverseEncomiendaController {


// @LINE:84
def despacharEncomienda(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EncomiendaController.despacharEncomienda(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.EncomiendaController", "despacharEncomienda", Seq(classOf[Long]), "PUT", """""", _prefix + """ventas/encomiendas/despachar/$id<[^/]+>""")
)
                      

// @LINE:78
def getEncomienda(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EncomiendaController.getEncomienda(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.EncomiendaController", "getEncomienda", Seq(classOf[Long]), "GET", """""", _prefix + """ventas/encomiendas/$id<[^/]+>""")
)
                      

// @LINE:76
def generarOrden(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EncomiendaController.generarOrden(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.EncomiendaController", "generarOrden", Seq(classOf[Long]), "GET", """""", _prefix + """ventas/encomiendas/punto-de-venta/$id<[^/]+>""")
)
                      

// @LINE:80
def listarEstados(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EncomiendaController.listarEstados(), HandlerDef(this.getClass.getClassLoader, "", "controllers.EncomiendaController", "listarEstados", Seq(), "GET", """""", _prefix + """ventas/nombre-estados-encomienda""")
)
                      

// @LINE:88
def entregarEncomienda(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EncomiendaController.entregarEncomienda(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.EncomiendaController", "entregarEncomienda", Seq(classOf[Long]), "PUT", """""", _prefix + """ventas/encomiendas/entregar/$id<[^/]+>""")
)
                      

// @LINE:82
def listarHistoricoEstados(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EncomiendaController.listarHistoricoEstados(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.EncomiendaController", "listarHistoricoEstados", Seq(classOf[Long]), "GET", """""", _prefix + """ventas/encomiendas/estados/$id<[^/]+>""")
)
                      

// @LINE:74
def getVenta(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EncomiendaController.getVenta(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.EncomiendaController", "getVenta", Seq(classOf[Long]), "GET", """""", _prefix + """ventas/$id<[^/]+>""")
)
                      

// @LINE:86
def recibirEncomienda(id:Long, punto:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EncomiendaController.recibirEncomienda(id, punto), HandlerDef(this.getClass.getClassLoader, "", "controllers.EncomiendaController", "recibirEncomienda", Seq(classOf[Long], classOf[Long]), "PUT", """""", _prefix + """ventas/encomiendas/recibir/$id<[^/]+>/$punto<[^/]+>""")
)
                      

// @LINE:68
def crearVenta(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EncomiendaController.crearVenta(), HandlerDef(this.getClass.getClassLoader, "", "controllers.EncomiendaController", "crearVenta", Seq(), "POST", """""", _prefix + """ventas""")
)
                      

}
                          

// @LINE:31
// @LINE:29
class ReverseSecurityController {


// @LINE:31
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SecurityController.logout(), HandlerDef(this.getClass.getClassLoader, "", "controllers.SecurityController", "logout", Seq(), "POST", """""", _prefix + """logout""")
)
                      

// @LINE:29
def login(usuario:String, pass:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SecurityController.login(usuario, pass), HandlerDef(this.getClass.getClassLoader, "", "controllers.SecurityController", "login", Seq(classOf[String], classOf[String]), "POST", """""", _prefix + """login/$usuario<[^/]+>/$pass<[^/]+>""")
)
                      

}
                          

// @LINE:6
class ReverseApplication {


// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

}
                          

// @LINE:64
// @LINE:62
// @LINE:60
// @LINE:58
// @LINE:56
// @LINE:54
// @LINE:52
// @LINE:50
// @LINE:48
// @LINE:46
// @LINE:44
// @LINE:42
// @LINE:39
// @LINE:37
class ReversePersonaController {


// @LINE:58
def cesarEmpleado(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PersonaController.cesarEmpleado(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.PersonaController", "cesarEmpleado", Seq(classOf[Long]), "PUT", """""", _prefix + """admin/empleados/cesar/$id<[^/]+>""")
)
                      

// @LINE:50
def listarEmpleados(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PersonaController.listarEmpleados(), HandlerDef(this.getClass.getClassLoader, "", "controllers.PersonaController", "listarEmpleados", Seq(), "GET", """""", _prefix + """admin/empleados""")
)
                      

// @LINE:37
def crearCliente(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PersonaController.crearCliente(), HandlerDef(this.getClass.getClassLoader, "", "controllers.PersonaController", "crearCliente", Seq(), "POST", """""", _prefix + """admin/clientes""")
)
                      

// @LINE:44
def getPersona(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PersonaController.getPersona(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.PersonaController", "getPersona", Seq(classOf[Long]), "GET", """""", _prefix + """admin/clientes/$id<[^/]+>""")
)
                      

// @LINE:52
def modificarEmpleado(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PersonaController.modificarEmpleado(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.PersonaController", "modificarEmpleado", Seq(classOf[Long]), "PUT", """""", _prefix + """admin/empleados/$id<[^/]+>""")
)
                      

// @LINE:62
def eliminarCliente(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PersonaController.eliminarCliente(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.PersonaController", "eliminarCliente", Seq(classOf[Long]), "DELETE", """""", _prefix + """admin/clientes/$id<[^/]+>""")
)
                      

// @LINE:48
def listarClientes(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PersonaController.listarClientes(), HandlerDef(this.getClass.getClassLoader, "", "controllers.PersonaController", "listarClientes", Seq(), "GET", """""", _prefix + """admin/clientes""")
)
                      

// @LINE:39
def crearEmpleado(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PersonaController.crearEmpleado(), HandlerDef(this.getClass.getClassLoader, "", "controllers.PersonaController", "crearEmpleado", Seq(), "POST", """""", _prefix + """admin/empleados""")
)
                      

// @LINE:60
def rehabilitarEmpleado(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PersonaController.rehabilitarEmpleado(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.PersonaController", "rehabilitarEmpleado", Seq(classOf[Long]), "PUT", """""", _prefix + """admin/empleados/rehabilitar/$id<[^/]+>""")
)
                      

// @LINE:54
def modificarCliente(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PersonaController.modificarCliente(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.PersonaController", "modificarCliente", Seq(classOf[Long]), "PUT", """""", _prefix + """admin/clientes/$id<[^/]+>""")
)
                      

}
                          
}
        
    