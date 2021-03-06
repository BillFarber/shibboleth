/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-07-11 00:35:42 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.security;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
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

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" dir=\"ltr\">\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/templates/head.jsp", out, false);
      out.write("\n");
      out.write("<body>\n");
      out.write("<div id=\"site-wrapper\">\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/templates/navigation.jsp", out, false);
      out.write("\n");
      out.write("    <div class=\"main\" id=\"main-two-columns\">\n");
      out.write("        <div class=\"left\" id=\"main-content\">\n");
      out.write("            <div class=\"section\">\n");
      out.write("                <div class=\"section-content\">\n");
      out.write("                    <div class=\"post\">\n");
      out.write("                        <div class=\"post-title\"><h2 class=\"label label-green\">Login to administration</h2></div>\n");
      out.write("                        <p class=\"quiet large\">Please login to the metadata administration using a local account (by default admin/admin).</p>\n");
      out.write("                        <div class=\"post-body\">\n");
      out.write("                            ");
 String errorString = (String) request.getAttribute("error"); 
      out.write("\n");
      out.write("                            ");
 if (errorString != null && errorString.trim().equals("true")) { 
      out.write("\n");
      out.write("                                <div class=\"error\">Incorrect login name or password. Please retry using correct login name and password.</div>\n");
      out.write("                            ");
 } 
      out.write("\n");
      out.write("                            <p>\n");
      out.write("                            <form name='loginForm' action=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\" method='POST'>\n");
      out.write("                                <table>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td><label for=\"username\">User:</label></td>\n");
      out.write("                                        <td><input type='text' name='j_username' id=\"username\" class=\"text\" value='admin'></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td><label for=\"password\">Password:</label></td>\n");
      out.write("                                        <td><input type='password' name='j_password' id=\"password\" class=\"text\" value=\"admin\"/></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td></td>\n");
      out.write("                                        <td><input name=\"submit\" class=\"button\" type=\"submit\" value=\"Login\"/></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                </table>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"clearer\">&nbsp;</div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"clearer\">&nbsp;</div>\n");
      out.write("        </div>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/templates/sidebar.jsp", out, false);
      out.write("\n");
      out.write("    </div>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/templates/footer.jsp", out, false);
      out.write("\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f0.setParent(null);
    // /WEB-INF/security/adminLogin.jsp(21,59) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setValue("/saml/web/login");
    int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
    if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
    return false;
  }
}
