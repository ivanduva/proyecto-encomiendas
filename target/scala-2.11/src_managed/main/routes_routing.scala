// @SOURCE:C:/Users/Ivan/Documents/ivan/repo-codigo/proyecto-encomiendas/conf/routes
// @HASH:791ab351fafd4b54e7bcfbb778d05d8106f3ed81
// @DATE:Wed May 20 12:16:16 ART 2015


import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String): Unit = {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Application_index0_invoker = createInvoker(
controllers.Application.index(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
        

// @LINE:9
private[this] lazy val controllers_Assets_at1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at1_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        

// @LINE:13
private[this] lazy val controllers_PuntoDeVentaController_agregarPunto2_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin/puntos-de-venta"))))
private[this] lazy val controllers_PuntoDeVentaController_agregarPunto2_invoker = createInvoker(
controllers.PuntoDeVentaController.agregarPunto(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.PuntoDeVentaController", "agregarPunto", Nil,"POST", """""", Routes.prefix + """admin/puntos-de-venta"""))
        

// @LINE:15
private[this] lazy val controllers_PuntoDeVentaController_getPunto3_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin/puntos-de-venta/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_PuntoDeVentaController_getPunto3_invoker = createInvoker(
controllers.PuntoDeVentaController.getPunto(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.PuntoDeVentaController", "getPunto", Seq(classOf[Long]),"GET", """""", Routes.prefix + """admin/puntos-de-venta/$id<[^/]+>"""))
        

// @LINE:17
private[this] lazy val controllers_PuntoDeVentaController_listarPuntos4_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin/puntos-de-venta"))))
private[this] lazy val controllers_PuntoDeVentaController_listarPuntos4_invoker = createInvoker(
controllers.PuntoDeVentaController.listarPuntos(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.PuntoDeVentaController", "listarPuntos", Nil,"GET", """""", Routes.prefix + """admin/puntos-de-venta"""))
        

// @LINE:19
private[this] lazy val controllers_PuntoDeVentaController_modificarPunto5_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin/puntos-de-venta/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_PuntoDeVentaController_modificarPunto5_invoker = createInvoker(
controllers.PuntoDeVentaController.modificarPunto(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.PuntoDeVentaController", "modificarPunto", Seq(classOf[Long]),"PUT", """""", Routes.prefix + """admin/puntos-de-venta/$id<[^/]+>"""))
        

// @LINE:21
private[this] lazy val controllers_PuntoDeVentaController_eliminarPunto6_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin/puntos-de-venta/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_PuntoDeVentaController_eliminarPunto6_invoker = createInvoker(
controllers.PuntoDeVentaController.eliminarPunto(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.PuntoDeVentaController", "eliminarPunto", Seq(classOf[Long]),"DELETE", """""", Routes.prefix + """admin/puntos-de-venta/$id<[^/]+>"""))
        

// @LINE:25
private[this] lazy val controllers_PuntoDeVentaController_listarTipoPdv7_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin/tipo-puntos-de-venta"))))
private[this] lazy val controllers_PuntoDeVentaController_listarTipoPdv7_invoker = createInvoker(
controllers.PuntoDeVentaController.listarTipoPdv(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.PuntoDeVentaController", "listarTipoPdv", Nil,"GET", """""", Routes.prefix + """admin/tipo-puntos-de-venta"""))
        

// @LINE:27
private[this] lazy val controllers_PuntoDeVentaController_listarLocalidades8_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin/localidad"))))
private[this] lazy val controllers_PuntoDeVentaController_listarLocalidades8_invoker = createInvoker(
controllers.PuntoDeVentaController.listarLocalidades(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.PuntoDeVentaController", "listarLocalidades", Nil,"GET", """""", Routes.prefix + """admin/localidad"""))
        

// @LINE:29
private[this] lazy val controllers_SecurityController_login9_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login/"),DynamicPart("usuario", """[^/]+""",true),StaticPart("/"),DynamicPart("pass", """[^/]+""",true))))
private[this] lazy val controllers_SecurityController_login9_invoker = createInvoker(
controllers.SecurityController.login(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.SecurityController", "login", Seq(classOf[String], classOf[String]),"POST", """""", Routes.prefix + """login/$usuario<[^/]+>/$pass<[^/]+>"""))
        

// @LINE:31
private[this] lazy val controllers_SecurityController_logout10_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
private[this] lazy val controllers_SecurityController_logout10_invoker = createInvoker(
controllers.SecurityController.logout,
HandlerDef(this.getClass.getClassLoader, "", "controllers.SecurityController", "logout", Nil,"POST", """""", Routes.prefix + """logout"""))
        

// @LINE:37
private[this] lazy val controllers_PersonaController_crearCliente11_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin/clientes"))))
private[this] lazy val controllers_PersonaController_crearCliente11_invoker = createInvoker(
controllers.PersonaController.crearCliente(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.PersonaController", "crearCliente", Nil,"POST", """""", Routes.prefix + """admin/clientes"""))
        

// @LINE:39
private[this] lazy val controllers_PersonaController_crearEmpleado12_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin/empleados"))))
private[this] lazy val controllers_PersonaController_crearEmpleado12_invoker = createInvoker(
controllers.PersonaController.crearEmpleado(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.PersonaController", "crearEmpleado", Nil,"POST", """""", Routes.prefix + """admin/empleados"""))
        

// @LINE:42
private[this] lazy val controllers_PersonaController_crearCliente13_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("clientes"))))
private[this] lazy val controllers_PersonaController_crearCliente13_invoker = createInvoker(
controllers.PersonaController.crearCliente(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.PersonaController", "crearCliente", Nil,"POST", """ Para cuando el cliente se registra por su cuenta""", Routes.prefix + """clientes"""))
        

// @LINE:44
private[this] lazy val controllers_PersonaController_getPersona14_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin/clientes/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_PersonaController_getPersona14_invoker = createInvoker(
controllers.PersonaController.getPersona(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.PersonaController", "getPersona", Seq(classOf[Long]),"GET", """""", Routes.prefix + """admin/clientes/$id<[^/]+>"""))
        

// @LINE:46
private[this] lazy val controllers_PersonaController_getPersona15_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin/empleados/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_PersonaController_getPersona15_invoker = createInvoker(
controllers.PersonaController.getPersona(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.PersonaController", "getPersona", Seq(classOf[Long]),"GET", """""", Routes.prefix + """admin/empleados/$id<[^/]+>"""))
        

// @LINE:48
private[this] lazy val controllers_PersonaController_listarClientes16_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin/clientes"))))
private[this] lazy val controllers_PersonaController_listarClientes16_invoker = createInvoker(
controllers.PersonaController.listarClientes(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.PersonaController", "listarClientes", Nil,"GET", """""", Routes.prefix + """admin/clientes"""))
        

// @LINE:50
private[this] lazy val controllers_PersonaController_listarEmpleados17_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin/empleados"))))
private[this] lazy val controllers_PersonaController_listarEmpleados17_invoker = createInvoker(
controllers.PersonaController.listarEmpleados(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.PersonaController", "listarEmpleados", Nil,"GET", """""", Routes.prefix + """admin/empleados"""))
        

// @LINE:52
private[this] lazy val controllers_PersonaController_modificarEmpleado18_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin/empleados/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_PersonaController_modificarEmpleado18_invoker = createInvoker(
controllers.PersonaController.modificarEmpleado(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.PersonaController", "modificarEmpleado", Seq(classOf[Long]),"PUT", """""", Routes.prefix + """admin/empleados/$id<[^/]+>"""))
        

// @LINE:54
private[this] lazy val controllers_PersonaController_modificarCliente19_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin/clientes/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_PersonaController_modificarCliente19_invoker = createInvoker(
controllers.PersonaController.modificarCliente(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.PersonaController", "modificarCliente", Seq(classOf[Long]),"PUT", """""", Routes.prefix + """admin/clientes/$id<[^/]+>"""))
        

// @LINE:56
private[this] lazy val controllers_PersonaController_modificarCliente20_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("clientes/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_PersonaController_modificarCliente20_invoker = createInvoker(
controllers.PersonaController.modificarCliente(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.PersonaController", "modificarCliente", Seq(classOf[Long]),"PUT", """""", Routes.prefix + """clientes/$id<[^/]+>"""))
        

// @LINE:58
private[this] lazy val controllers_PersonaController_cesarEmpleado21_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin/empleados/cesar/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_PersonaController_cesarEmpleado21_invoker = createInvoker(
controllers.PersonaController.cesarEmpleado(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.PersonaController", "cesarEmpleado", Seq(classOf[Long]),"PUT", """""", Routes.prefix + """admin/empleados/cesar/$id<[^/]+>"""))
        

// @LINE:60
private[this] lazy val controllers_PersonaController_rehabilitarEmpleado22_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin/empleados/rehabilitar/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_PersonaController_rehabilitarEmpleado22_invoker = createInvoker(
controllers.PersonaController.rehabilitarEmpleado(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.PersonaController", "rehabilitarEmpleado", Seq(classOf[Long]),"PUT", """""", Routes.prefix + """admin/empleados/rehabilitar/$id<[^/]+>"""))
        

// @LINE:62
private[this] lazy val controllers_PersonaController_eliminarCliente23_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin/clientes/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_PersonaController_eliminarCliente23_invoker = createInvoker(
controllers.PersonaController.eliminarCliente(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.PersonaController", "eliminarCliente", Seq(classOf[Long]),"DELETE", """""", Routes.prefix + """admin/clientes/$id<[^/]+>"""))
        

// @LINE:64
private[this] lazy val controllers_PersonaController_eliminarCliente24_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("clientes/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_PersonaController_eliminarCliente24_invoker = createInvoker(
controllers.PersonaController.eliminarCliente(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.PersonaController", "eliminarCliente", Seq(classOf[Long]),"DELETE", """""", Routes.prefix + """clientes/$id<[^/]+>"""))
        

// @LINE:68
private[this] lazy val controllers_EncomiendaController_crearVenta25_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("ventas"))))
private[this] lazy val controllers_EncomiendaController_crearVenta25_invoker = createInvoker(
controllers.EncomiendaController.crearVenta(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.EncomiendaController", "crearVenta", Nil,"POST", """""", Routes.prefix + """ventas"""))
        

// @LINE:74
private[this] lazy val controllers_EncomiendaController_getVenta26_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("ventas/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_EncomiendaController_getVenta26_invoker = createInvoker(
controllers.EncomiendaController.getVenta(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.EncomiendaController", "getVenta", Seq(classOf[Long]),"GET", """""", Routes.prefix + """ventas/$id<[^/]+>"""))
        

// @LINE:76
private[this] lazy val controllers_EncomiendaController_generarOrden27_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("ventas/encomiendas/punto-de-venta/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_EncomiendaController_generarOrden27_invoker = createInvoker(
controllers.EncomiendaController.generarOrden(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.EncomiendaController", "generarOrden", Seq(classOf[Long]),"GET", """""", Routes.prefix + """ventas/encomiendas/punto-de-venta/$id<[^/]+>"""))
        

// @LINE:78
private[this] lazy val controllers_EncomiendaController_getEncomienda28_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("ventas/encomiendas/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_EncomiendaController_getEncomienda28_invoker = createInvoker(
controllers.EncomiendaController.getEncomienda(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.EncomiendaController", "getEncomienda", Seq(classOf[Long]),"GET", """""", Routes.prefix + """ventas/encomiendas/$id<[^/]+>"""))
        

// @LINE:80
private[this] lazy val controllers_EncomiendaController_listarEstados29_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("ventas/nombre-estados-encomienda"))))
private[this] lazy val controllers_EncomiendaController_listarEstados29_invoker = createInvoker(
controllers.EncomiendaController.listarEstados(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.EncomiendaController", "listarEstados", Nil,"GET", """""", Routes.prefix + """ventas/nombre-estados-encomienda"""))
        

// @LINE:82
private[this] lazy val controllers_EncomiendaController_listarHistoricoEstados30_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("ventas/encomiendas/estados/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_EncomiendaController_listarHistoricoEstados30_invoker = createInvoker(
controllers.EncomiendaController.listarHistoricoEstados(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.EncomiendaController", "listarHistoricoEstados", Seq(classOf[Long]),"GET", """""", Routes.prefix + """ventas/encomiendas/estados/$id<[^/]+>"""))
        

// @LINE:84
private[this] lazy val controllers_EncomiendaController_despacharEncomienda31_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("ventas/encomiendas/despachar/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_EncomiendaController_despacharEncomienda31_invoker = createInvoker(
controllers.EncomiendaController.despacharEncomienda(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.EncomiendaController", "despacharEncomienda", Seq(classOf[Long]),"PUT", """""", Routes.prefix + """ventas/encomiendas/despachar/$id<[^/]+>"""))
        

// @LINE:86
private[this] lazy val controllers_EncomiendaController_recibirEncomienda32_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("ventas/encomiendas/recibir/"),DynamicPart("id", """[^/]+""",true),StaticPart("/"),DynamicPart("punto", """[^/]+""",true))))
private[this] lazy val controllers_EncomiendaController_recibirEncomienda32_invoker = createInvoker(
controllers.EncomiendaController.recibirEncomienda(fakeValue[Long], fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.EncomiendaController", "recibirEncomienda", Seq(classOf[Long], classOf[Long]),"PUT", """""", Routes.prefix + """ventas/encomiendas/recibir/$id<[^/]+>/$punto<[^/]+>"""))
        

// @LINE:88
private[this] lazy val controllers_EncomiendaController_entregarEncomienda33_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("ventas/encomiendas/entregar/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_EncomiendaController_entregarEncomienda33_invoker = createInvoker(
controllers.EncomiendaController.entregarEncomienda(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.EncomiendaController", "entregarEncomienda", Seq(classOf[Long]),"PUT", """""", Routes.prefix + """ventas/encomiendas/entregar/$id<[^/]+>"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/puntos-de-venta""","""controllers.PuntoDeVentaController.agregarPunto()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/puntos-de-venta/$id<[^/]+>""","""controllers.PuntoDeVentaController.getPunto(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/puntos-de-venta""","""controllers.PuntoDeVentaController.listarPuntos()"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/puntos-de-venta/$id<[^/]+>""","""controllers.PuntoDeVentaController.modificarPunto(id:Long)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/puntos-de-venta/$id<[^/]+>""","""controllers.PuntoDeVentaController.eliminarPunto(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/tipo-puntos-de-venta""","""controllers.PuntoDeVentaController.listarTipoPdv()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/localidad""","""controllers.PuntoDeVentaController.listarLocalidades()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login/$usuario<[^/]+>/$pass<[^/]+>""","""controllers.SecurityController.login(usuario:String, pass:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.SecurityController.logout"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/clientes""","""controllers.PersonaController.crearCliente()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/empleados""","""controllers.PersonaController.crearEmpleado()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """clientes""","""controllers.PersonaController.crearCliente()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/clientes/$id<[^/]+>""","""controllers.PersonaController.getPersona(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/empleados/$id<[^/]+>""","""controllers.PersonaController.getPersona(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/clientes""","""controllers.PersonaController.listarClientes()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/empleados""","""controllers.PersonaController.listarEmpleados()"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/empleados/$id<[^/]+>""","""controllers.PersonaController.modificarEmpleado(id:Long)"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/clientes/$id<[^/]+>""","""controllers.PersonaController.modificarCliente(id:Long)"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """clientes/$id<[^/]+>""","""controllers.PersonaController.modificarCliente(id:Long)"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/empleados/cesar/$id<[^/]+>""","""controllers.PersonaController.cesarEmpleado(id:Long)"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/empleados/rehabilitar/$id<[^/]+>""","""controllers.PersonaController.rehabilitarEmpleado(id:Long)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/clientes/$id<[^/]+>""","""controllers.PersonaController.eliminarCliente(id:Long)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """clientes/$id<[^/]+>""","""controllers.PersonaController.eliminarCliente(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """ventas""","""controllers.EncomiendaController.crearVenta()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """ventas/$id<[^/]+>""","""controllers.EncomiendaController.getVenta(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """ventas/encomiendas/punto-de-venta/$id<[^/]+>""","""controllers.EncomiendaController.generarOrden(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """ventas/encomiendas/$id<[^/]+>""","""controllers.EncomiendaController.getEncomienda(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """ventas/nombre-estados-encomienda""","""controllers.EncomiendaController.listarEstados()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """ventas/encomiendas/estados/$id<[^/]+>""","""controllers.EncomiendaController.listarHistoricoEstados(id:Long)"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """ventas/encomiendas/despachar/$id<[^/]+>""","""controllers.EncomiendaController.despacharEncomienda(id:Long)"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """ventas/encomiendas/recibir/$id<[^/]+>/$punto<[^/]+>""","""controllers.EncomiendaController.recibirEncomienda(id:Long, punto:Long)"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """ventas/encomiendas/entregar/$id<[^/]+>""","""controllers.EncomiendaController.entregarEncomienda(id:Long)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0_route(params) => {
   call { 
        controllers_Application_index0_invoker.call(controllers.Application.index())
   }
}
        

// @LINE:9
case controllers_Assets_at1_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at1_invoker.call(controllers.Assets.at(path, file))
   }
}
        

// @LINE:13
case controllers_PuntoDeVentaController_agregarPunto2_route(params) => {
   call { 
        controllers_PuntoDeVentaController_agregarPunto2_invoker.call(controllers.PuntoDeVentaController.agregarPunto())
   }
}
        

// @LINE:15
case controllers_PuntoDeVentaController_getPunto3_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PuntoDeVentaController_getPunto3_invoker.call(controllers.PuntoDeVentaController.getPunto(id))
   }
}
        

// @LINE:17
case controllers_PuntoDeVentaController_listarPuntos4_route(params) => {
   call { 
        controllers_PuntoDeVentaController_listarPuntos4_invoker.call(controllers.PuntoDeVentaController.listarPuntos())
   }
}
        

// @LINE:19
case controllers_PuntoDeVentaController_modificarPunto5_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PuntoDeVentaController_modificarPunto5_invoker.call(controllers.PuntoDeVentaController.modificarPunto(id))
   }
}
        

// @LINE:21
case controllers_PuntoDeVentaController_eliminarPunto6_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PuntoDeVentaController_eliminarPunto6_invoker.call(controllers.PuntoDeVentaController.eliminarPunto(id))
   }
}
        

// @LINE:25
case controllers_PuntoDeVentaController_listarTipoPdv7_route(params) => {
   call { 
        controllers_PuntoDeVentaController_listarTipoPdv7_invoker.call(controllers.PuntoDeVentaController.listarTipoPdv())
   }
}
        

// @LINE:27
case controllers_PuntoDeVentaController_listarLocalidades8_route(params) => {
   call { 
        controllers_PuntoDeVentaController_listarLocalidades8_invoker.call(controllers.PuntoDeVentaController.listarLocalidades())
   }
}
        

// @LINE:29
case controllers_SecurityController_login9_route(params) => {
   call(params.fromPath[String]("usuario", None), params.fromPath[String]("pass", None)) { (usuario, pass) =>
        controllers_SecurityController_login9_invoker.call(controllers.SecurityController.login(usuario, pass))
   }
}
        

// @LINE:31
case controllers_SecurityController_logout10_route(params) => {
   call { 
        controllers_SecurityController_logout10_invoker.call(controllers.SecurityController.logout)
   }
}
        

// @LINE:37
case controllers_PersonaController_crearCliente11_route(params) => {
   call { 
        controllers_PersonaController_crearCliente11_invoker.call(controllers.PersonaController.crearCliente())
   }
}
        

// @LINE:39
case controllers_PersonaController_crearEmpleado12_route(params) => {
   call { 
        controllers_PersonaController_crearEmpleado12_invoker.call(controllers.PersonaController.crearEmpleado())
   }
}
        

// @LINE:42
case controllers_PersonaController_crearCliente13_route(params) => {
   call { 
        controllers_PersonaController_crearCliente13_invoker.call(controllers.PersonaController.crearCliente())
   }
}
        

// @LINE:44
case controllers_PersonaController_getPersona14_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PersonaController_getPersona14_invoker.call(controllers.PersonaController.getPersona(id))
   }
}
        

// @LINE:46
case controllers_PersonaController_getPersona15_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PersonaController_getPersona15_invoker.call(controllers.PersonaController.getPersona(id))
   }
}
        

// @LINE:48
case controllers_PersonaController_listarClientes16_route(params) => {
   call { 
        controllers_PersonaController_listarClientes16_invoker.call(controllers.PersonaController.listarClientes())
   }
}
        

// @LINE:50
case controllers_PersonaController_listarEmpleados17_route(params) => {
   call { 
        controllers_PersonaController_listarEmpleados17_invoker.call(controllers.PersonaController.listarEmpleados())
   }
}
        

// @LINE:52
case controllers_PersonaController_modificarEmpleado18_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PersonaController_modificarEmpleado18_invoker.call(controllers.PersonaController.modificarEmpleado(id))
   }
}
        

// @LINE:54
case controllers_PersonaController_modificarCliente19_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PersonaController_modificarCliente19_invoker.call(controllers.PersonaController.modificarCliente(id))
   }
}
        

// @LINE:56
case controllers_PersonaController_modificarCliente20_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PersonaController_modificarCliente20_invoker.call(controllers.PersonaController.modificarCliente(id))
   }
}
        

// @LINE:58
case controllers_PersonaController_cesarEmpleado21_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PersonaController_cesarEmpleado21_invoker.call(controllers.PersonaController.cesarEmpleado(id))
   }
}
        

// @LINE:60
case controllers_PersonaController_rehabilitarEmpleado22_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PersonaController_rehabilitarEmpleado22_invoker.call(controllers.PersonaController.rehabilitarEmpleado(id))
   }
}
        

// @LINE:62
case controllers_PersonaController_eliminarCliente23_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PersonaController_eliminarCliente23_invoker.call(controllers.PersonaController.eliminarCliente(id))
   }
}
        

// @LINE:64
case controllers_PersonaController_eliminarCliente24_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PersonaController_eliminarCliente24_invoker.call(controllers.PersonaController.eliminarCliente(id))
   }
}
        

// @LINE:68
case controllers_EncomiendaController_crearVenta25_route(params) => {
   call { 
        controllers_EncomiendaController_crearVenta25_invoker.call(controllers.EncomiendaController.crearVenta())
   }
}
        

// @LINE:74
case controllers_EncomiendaController_getVenta26_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_EncomiendaController_getVenta26_invoker.call(controllers.EncomiendaController.getVenta(id))
   }
}
        

// @LINE:76
case controllers_EncomiendaController_generarOrden27_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_EncomiendaController_generarOrden27_invoker.call(controllers.EncomiendaController.generarOrden(id))
   }
}
        

// @LINE:78
case controllers_EncomiendaController_getEncomienda28_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_EncomiendaController_getEncomienda28_invoker.call(controllers.EncomiendaController.getEncomienda(id))
   }
}
        

// @LINE:80
case controllers_EncomiendaController_listarEstados29_route(params) => {
   call { 
        controllers_EncomiendaController_listarEstados29_invoker.call(controllers.EncomiendaController.listarEstados())
   }
}
        

// @LINE:82
case controllers_EncomiendaController_listarHistoricoEstados30_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_EncomiendaController_listarHistoricoEstados30_invoker.call(controllers.EncomiendaController.listarHistoricoEstados(id))
   }
}
        

// @LINE:84
case controllers_EncomiendaController_despacharEncomienda31_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_EncomiendaController_despacharEncomienda31_invoker.call(controllers.EncomiendaController.despacharEncomienda(id))
   }
}
        

// @LINE:86
case controllers_EncomiendaController_recibirEncomienda32_route(params) => {
   call(params.fromPath[Long]("id", None), params.fromPath[Long]("punto", None)) { (id, punto) =>
        controllers_EncomiendaController_recibirEncomienda32_invoker.call(controllers.EncomiendaController.recibirEncomienda(id, punto))
   }
}
        

// @LINE:88
case controllers_EncomiendaController_entregarEncomienda33_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_EncomiendaController_entregarEncomienda33_invoker.call(controllers.EncomiendaController.entregarEncomienda(id))
   }
}
        
}

}
     