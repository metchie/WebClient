/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.39
 * Generated at: 2013-03-30 16:24:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class weekcalendar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\"\"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<style type='text/css'>\n");
      out.write("\n");
      out.write("\tbody {\n");
      out.write("\t\tfont-family: \"Lucida Grande\",Helvetica,Arial,Verdana,sans-serif;\n");
      out.write("\t\tmargin: 0;\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\th1 {\n");
      out.write("\t\tmargin: 0;\n");
      out.write("\t\tpadding: 0.5em;\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\tp.description {\n");
      out.write("\t\tfont-size: 0.8em;\n");
      out.write("\t\tpadding: 1em;\n");
      out.write("\t\tposition: absolute;\n");
      out.write("\t\ttop: 3.2em;\n");
      out.write("\t\tmargin-right: 400px;\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\t#message {\n");
      out.write("\t\tfont-size: 0.7em;\n");
      out.write("\t\tposition: absolute;\n");
      out.write("\t\ttop: 1em; \n");
      out.write("\t\tright: 1em;\n");
      out.write("\t\twidth: 350px;\n");
      out.write("\t\tdisplay: none;\n");
      out.write("\t\tpadding: 1em;\n");
      out.write("\t\tbackground: #ffc;\n");
      out.write("\t\tborder: 1px solid #dda;\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("</style>\n");
      out.write("\t<link rel='stylesheet' type='text/css' href='reset.css' />\n");
      out.write("    <!--\n");
      out.write("\t<link rel='stylesheet' type='text/css' href='http://ajax.googleapis.com/ajax/libs/jqueryui/1.7.2/themes/start/jquery-ui.css' />\n");
      out.write("\t-->\n");
      out.write("\n");
      out.write("    <link rel='stylesheet' type='text/css' href='libs/css/smoothness/jquery-ui-1.8rc3.custom.css' />\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<link rel='stylesheet' type='text/css' href='jquery.weekcalendar.css' />\n");
      out.write("\t<link rel='stylesheet' type='text/css' href='demo.css' />\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<script type='text/javascript' src='http://ajax.googleapis.com/ajax/libs/jquery/1.4.2/jquery.min.js'></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <script type='text/javascript' src='libs/jquery-ui-1.8rc3.custom.min.js'></script>\n");
      out.write("\t<script type='text/javascript' src='jquery.weekcalendar.js'></script>\n");
      out.write("\t<script type='text/javascript' src='scripts/init.js'></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<table style=\"width:100%;\"><tr ><td>\n");
      out.write("\t<h1>Kaan Bingol</h1></td></tr>\n");
      out.write(" \t<tr><td>\n");
      out.write(" \t<div style=\"float:left; width:20%;background-color:gray;\" id='ovunc'>sdadsa</div>\n");
      out.write(" \t<div style=\"float:right;width:80%;background-color:black;\" id='calendar' ></div></td>\n");
      out.write(" \t</tr>\n");
      out.write("\t</table>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}