/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.3.0.M1
 * Generated at: 2015-09-27 17:46:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class joblistings_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("file:/C:/Users/Pragnani/.m2/repository/org/springframework/spring-webmvc/4.0.9.RELEASE/spring-webmvc-4.0.9.RELEASE.jar", Long.valueOf(1427732685988L));
    _jspx_dependants.put("jar:file:/C:/Users/Pragnani/.m2/repository/org/apache/taglibs/taglibs-standard-impl/1.2.1/taglibs-standard-impl-1.2.1.jar!/META-INF/c.tld", Long.valueOf(1384348662000L));
    _jspx_dependants.put("jar:file:/C:/Users/Pragnani/.m2/repository/org/springframework/spring-webmvc/4.0.9.RELEASE/spring-webmvc-4.0.9.RELEASE.jar!/META-INF/spring-form.tld", Long.valueOf(1419901942000L));
    _jspx_dependants.put("jar:file:/C:/Users/Pragnani/.m2/repository/org/springframework/spring-webmvc/4.0.9.RELEASE/spring-webmvc-4.0.9.RELEASE.jar!/META-INF/spring.tld", Long.valueOf(1419901942000L));
    _jspx_dependants.put("file:/C:/Users/Pragnani/.m2/repository/org/apache/taglibs/taglibs-standard-impl/1.2.1/taglibs-standard-impl-1.2.1.jar", Long.valueOf(1443358027750L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fid_005fcommandName_005faction;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fid_005fcommandName_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fid_005fcommandName_005faction.release();
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../common/header.jsp", out, false);
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("body {\r\n");
      out.write("\tpadding-top: 50px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".starter-template {\r\n");
      out.write("\tpadding: 40px 15px;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".center {\r\n");
      out.write("\tmargin-left: auto;\r\n");
      out.write("\tmargin-right: auto;\r\n");
      out.write("\twidth: 50%;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(document).ready(function() {\r\n");
      out.write("\r\n");
      out.write("\t\t$('#myModal').on('shown.bs.modal', function(event) {\r\n");
      out.write("\r\n");
      out.write("\t\t\tvar button = $(event.relatedTarget) // Button that triggered the modal\r\n");
      out.write("\t\t\tvar id = button.data('id')\r\n");
      out.write("\t\t\t$('#jobId').val(id);\r\n");
      out.write("\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("\t\t<h2>\r\n");
      out.write("\t\t\t<b><font color=\"orange\">Job Listings</font></b>\r\n");
      out.write("\t\t</h2>\r\n");
      out.write("\t\t<hr style=\"border-bottom: 1px black;\" />\r\n");
      out.write("\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Modal -->\r\n");
      out.write("\t\t<div class=\"modal fade\" id=\"myModal\" tabindex=\"-1\" role=\"dialog\"\r\n");
      out.write("\t\t\taria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("\t\t\t<div class=\"modal-dialog\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t");
      //  form:form
      org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_005fform_005f0 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fid_005fcommandName_005faction.get(org.springframework.web.servlet.tags.form.FormTag.class);
      _jspx_th_form_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_form_005fform_005f0.setParent(null);
      // /WEB-INF/jsp/joblistings.jsp(91,4) name = method type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fform_005f0.setMethod("POST");
      // /WEB-INF/jsp/joblistings.jsp(91,4) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fform_005f0.setAction(request.getContextPath() + "/applyJob.html");
      // /WEB-INF/jsp/joblistings.jsp(91,4) name = commandName type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fform_005f0.setCommandName("apply");
      // /WEB-INF/jsp/joblistings.jsp(91,4) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fform_005f0.setId("form");
      int[] _jspx_push_body_count_form_005fform_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_form_005fform_005f0 = _jspx_th_form_005fform_005f0.doStartTag();
        if (_jspx_eval_form_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\t\t\t\t\t<div class=\"modal-content\">\r\n");
            out.write("\t\t\t\t\t\t<div class=\"modal-header\">\r\n");
            out.write("\t\t\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\"\r\n");
            out.write("\t\t\t\t\t\t\t\taria-label=\"Close\">\r\n");
            out.write("\t\t\t\t\t\t\t\t<span aria-hidden=\"true\">&times;</span>\r\n");
            out.write("\t\t\t\t\t\t\t</button>\r\n");
            out.write("\t\t\t\t\t\t\t<h4 class=\"modal-title\" id=\"myModalLabel\">Do you want to\r\n");
            out.write("\t\t\t\t\t\t\t\tapply ?</h4>\r\n");
            out.write("\t\t\t\t\t\t</div>\r\n");
            out.write("\t\t\t\t\t\t<div class=\"modal-body\">\r\n");
            out.write("\r\n");
            out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
            out.write("\t\t\t\t\t\t\t\t<label for=\"InputMessage\">Done anything related to this\r\n");
            out.write("\t\t\t\t\t\t\t\t\tjob?</label>\r\n");
            out.write("\t\t\t\t\t\t\t\t<div class=\"input-group\">\r\n");
            out.write("\t\t\t\t\t\t\t\t\t<input type=\"hidden\" id=\"jobId\" name=\"jobId\" value=\"\"></input>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t<textarea name=\"portfolio\" id=\"InputMessage\"\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\tclass=\"form-control\" rows=\"5\"></textarea>\r\n");
            out.write("\r\n");
            out.write("\t\t\t\t\t\t\t\t\t<span class=\"input-group-addon\"><span\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-asterisk\"></span></span>\r\n");
            out.write("\t\t\t\t\t\t\t\t</div>\r\n");
            out.write("\t\t\t\t\t\t\t</div>\r\n");
            out.write("\r\n");
            out.write("\t\t\t\t\t\t</div>\r\n");
            out.write("\t\t\t\t\t\t<div class=\"modal-footer\">\r\n");
            out.write("\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default\"\r\n");
            out.write("\t\t\t\t\t\t\t\tdata-dismiss=\"modal\">Close</button>\r\n");
            out.write("\t\t\t\t\t\t\t<input type=\"submit\" class=\"btn btn-primary btn-submit\"></input>\r\n");
            out.write("\t\t\t\t\t\t</div>\r\n");
            out.write("\t\t\t\t\t</div>\r\n");
            out.write("\t\t\t\t");
            int evalDoAfterBody = _jspx_th_form_005fform_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_form_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_form_005fform_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_form_005fform_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_form_005fform_005f0.doFinally();
        _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fid_005fcommandName_005faction.reuse(_jspx_th_form_005fform_005f0);
      }
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- Close container -->\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/jsp/joblistings.jsp(52,2) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/joblistings.jsp(52,2) '${jobs}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${jobs}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/jsp/joblistings.jsp(52,2) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("job");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t<table border=\"0\" width=\"100%\"\r\n");
          out.write("\t\t\t\tstyle=\"padding: 8px; vertical-align: top\">\r\n");
          out.write("\t\t\t\t<thead>\r\n");
          out.write("\t\t\t\t\t<tr>\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t<td colspan=\"3\" align=\"left\">\r\n");
          out.write("\t\t\t\t\t\t\t");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t<label style=\"color: activecaption; font-size: 150%;\"\r\n");
          out.write("\t\t\t\t\t\t\tid=\"jobTitle\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${job.jobTitle}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</label>\r\n");
          out.write("\t\t\t\t\t\t</td>\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t<td colspan=\"1\" align=\"right\"><button type=\"button\"\r\n");
          out.write("\t\t\t\t\t\t\t\tclass=\"btn btn-primary btn-sm btn-apply\" data-toggle=\"modal\"\r\n");
          out.write("\t\t\t\t\t\t\t\tdata-id=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${job.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\" data-target=\"#myModal\">Apply</button></td>\r\n");
          out.write("\t\t\t\t\t</tr>\r\n");
          out.write("\t\t\t\t</thead>\r\n");
          out.write("\t\t\t\t<tbody>\r\n");
          out.write("\t\t\t\t\t<tr>\r\n");
          out.write("\t\t\t\t\t\t<td id=\"jobDescription\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${job.jobDescription}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t</tr>\r\n");
          out.write("\t\t\t\t\t<tr>\r\n");
          out.write("\t\t\t\t\t\t<td>By <label style=\"color: blue\"> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${job.postedBy}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write(" </label></td>\r\n");
          out.write("\t\t\t\t\t</tr>\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t</tbody>\r\n");
          out.write("\t\t\t</table>\r\n");
          out.write("\t\t\t<hr />\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
