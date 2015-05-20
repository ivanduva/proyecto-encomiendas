
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._

/**/
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Proyecto</title>
    <link rel="stylesheet" href='"""),_display_(/*6.35*/routes/*6.41*/.Assets.at("front/bower_components/bootstrap/dist/css/bootstrap.css")),format.raw/*6.110*/("""'>
    <link rel="stylesheet" href='"""),_display_(/*7.35*/routes/*7.41*/.Assets.at("front/bower_components/flat-ui/dist/css/flat-ui.css")),format.raw/*7.106*/("""'>
    <link rel="stylesheet" href='"""),_display_(/*8.35*/routes/*8.41*/.Assets.at("front/static/css/style.css")),format.raw/*8.81*/("""'>
</head>
<body ng-app="app">

    <nav class="navbar navbar-default" role="navigation">
      <div class="navbar-header">
        <a class="navbar-brand" href="#">icono</a>
      </div>
      <div class="collapse navbar-collapse">
        <ul class="nav navbar-nav">
          <li><a href="#/dashboard">Home</a></li>
        </ul>
        <ul class="nav navbar-nav navbar-right">
              <li><a href="#/login">Login</a></li>
              <li><a href="#/public/clientes/new">Registrarse</a></li>
        </ul>
      </div><!-- /.navbar-collapse -->
    </nav><!-- /navbar -->

    <div class="container" ng-view></div>

    <script src='"""),_display_(/*29.19*/routes/*29.25*/.Assets.at("front/bower_components/jquery/dist/jquery.js")),format.raw/*29.83*/("""'></script>
    <script src='"""),_display_(/*30.19*/routes/*30.25*/.Assets.at("front/bower_components/flat-ui/dist/js/flat-ui.js")),format.raw/*30.88*/("""'></script>
    <!-- Angular -->
    <script src='"""),_display_(/*32.19*/routes/*32.25*/.Assets.at("front/bower_components/angular/angular.js")),format.raw/*32.80*/("""'></script>
    <script src='"""),_display_(/*33.19*/routes/*33.25*/.Assets.at("front/bower_components/angular-route/angular-route.js")),format.raw/*33.92*/("""'></script>
    <script src='"""),_display_(/*34.19*/routes/*34.25*/.Assets.at("front/bower_components/angular-resource/angular-resource.js")),format.raw/*34.98*/("""'></script>

    <!-- App -->
    <script src='"""),_display_(/*37.19*/routes/*37.25*/.Assets.at("front/app/app.module.js")),format.raw/*37.62*/("""'></script>
    <script src='"""),_display_(/*38.19*/routes/*38.25*/.Assets.at("front/app/services/data.service.js")),format.raw/*38.73*/("""'></script>

    <!-- Punto de venta -->
    <script src='"""),_display_(/*41.19*/routes/*41.25*/.Assets.at("front/app/punto_venta/punto_venta.module.js")),format.raw/*41.82*/("""'></script>
    <script src='"""),_display_(/*42.19*/routes/*42.25*/.Assets.at("front/app/punto_venta/punto_venta.js")),format.raw/*42.75*/("""'></script>

    <!-- Clientes -->
    <script src='"""),_display_(/*45.19*/routes/*45.25*/.Assets.at("front/app/clientes/clientes.module.js")),format.raw/*45.76*/("""'></script>
    <script src='"""),_display_(/*46.19*/routes/*46.25*/.Assets.at("front/app/clientes/clientes.js")),format.raw/*46.69*/("""'></script>

    <!-- Empleados -->
    <script src='"""),_display_(/*49.19*/routes/*49.25*/.Assets.at("front/app/empleados/empleados.module.js")),format.raw/*49.78*/("""'></script>
    <script src='"""),_display_(/*50.19*/routes/*50.25*/.Assets.at("front/app/empleados/empleados.js")),format.raw/*50.71*/("""'></script>

    <!-- Encomiendas -->
    <script src='"""),_display_(/*53.19*/routes/*53.25*/.Assets.at("front/app/encomiendas/encomiendas.module.js")),format.raw/*53.82*/("""'></script>
    <script src='"""),_display_(/*54.19*/routes/*54.25*/.Assets.at("front/app/encomiendas/encomiendas.js")),format.raw/*54.75*/("""'></script>

    <!-- Ventas -->
    <script src='"""),_display_(/*57.19*/routes/*57.25*/.Assets.at("front/app/ventas/ventas.module.js")),format.raw/*57.72*/("""'></script>
    <script src='"""),_display_(/*58.19*/routes/*58.25*/.Assets.at("front/app/ventas/ventas.js")),format.raw/*58.65*/("""'></script>

</body>
</html>
"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed May 20 12:16:19 ART 2015
                  SOURCE: C:/Users/Ivan/Documents/ivan/repo-codigo/proyecto-encomiendas/app/views/index.scala.html
                  HASH: ec9efad39317cf211d084c9dd92076aac7bffef5
                  MATRIX: 798->0|958->134|972->140|1062->209|1126->247|1140->253|1226->318|1290->356|1304->362|1364->402|2058->1069|2073->1075|2152->1133|2210->1164|2225->1170|2309->1233|2389->1286|2404->1292|2480->1347|2538->1378|2553->1384|2641->1451|2699->1482|2714->1488|2808->1561|2886->1612|2901->1618|2959->1655|3017->1686|3032->1692|3101->1740|3190->1802|3205->1808|3283->1865|3341->1896|3356->1902|3427->1952|3510->2008|3525->2014|3597->2065|3655->2096|3670->2102|3735->2146|3819->2203|3834->2209|3908->2262|3966->2293|3981->2299|4048->2345|4134->2404|4149->2410|4227->2467|4285->2498|4300->2504|4371->2554|4452->2608|4467->2614|4535->2661|4593->2692|4608->2698|4669->2738
                  LINES: 29->1|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|57->29|57->29|57->29|58->30|58->30|58->30|60->32|60->32|60->32|61->33|61->33|61->33|62->34|62->34|62->34|65->37|65->37|65->37|66->38|66->38|66->38|69->41|69->41|69->41|70->42|70->42|70->42|73->45|73->45|73->45|74->46|74->46|74->46|77->49|77->49|77->49|78->50|78->50|78->50|81->53|81->53|81->53|82->54|82->54|82->54|85->57|85->57|85->57|86->58|86->58|86->58
                  -- GENERATED --
              */
          