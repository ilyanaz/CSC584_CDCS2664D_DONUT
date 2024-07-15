package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class activity_005fhistory_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Activity & History</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            background-color: #f2f2f2;\n");
      out.write("            margin: 0;\n");
      out.write("            display: flex;\n");
      out.write("            min-height: 100vh;\n");
      out.write("            flex-direction: column;\n");
      out.write("        }\n");
      out.write("        .container {\n");
      out.write("            display: flex;\n");
      out.write("            flex: 1;\n");
      out.write("        }\n");
      out.write("        .sidebar {\n");
      out.write("            width: 250px;\n");
      out.write("            background-color: #0277bd;\n");
      out.write("            color: #fff;\n");
      out.write("            display: flex;\n");
      out.write("            flex-direction: column;\n");
      out.write("            align-items: center;\n");
      out.write("            padding: 15px;\n");
      out.write("            box-sizing: border-box;\n");
      out.write("        }\n");
      out.write("        .sidebar h2 {\n");
      out.write("            color: #fff;\n");
      out.write("            margin-bottom: 30px;\n");
      out.write("        }\n");
      out.write("        .sidebar a {\n");
      out.write("            display: block;\n");
      out.write("            color: #fff;\n");
      out.write("            padding: 10px 15px;\n");
      out.write("            text-decoration: none;\n");
      out.write("            margin-bottom: 10px;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            width: 100%;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("        .sidebar a:hover {\n");
      out.write("            background-color: #01579b;\n");
      out.write("        }\n");
      out.write("        .content {\n");
      out.write("            flex: 1;\n");
      out.write("            display: flex;\n");
      out.write("            flex-direction: column;\n");
      out.write("            padding: 20px;\n");
      out.write("            box-sizing: border-box;\n");
      out.write("        }\n");
      out.write("        .header {\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: space-between;\n");
      out.write("            align-items: center;\n");
      out.write("            padding: 20px;\n");
      out.write("            background-color: #fff;\n");
      out.write("            box-shadow: 0 1px 4px rgba(0,0,0,0.1);\n");
      out.write("        }\n");
      out.write("        .header h2 {\n");
      out.write("            margin: 0;\n");
      out.write("            color: #333;\n");
      out.write("        }\n");
      out.write("        .main-content {\n");
      out.write("            padding: 20px;\n");
      out.write("            background-color: #fff;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            box-shadow: 0 1px 4px rgba(0,0,0,0.1);\n");
      out.write("            max-width: 800px;\n");
      out.write("            margin: 20px auto;\n");
      out.write("            flex: 1;\n");
      out.write("        }\n");
      out.write("        .main-content h3 {\n");
      out.write("            margin-top: 0;\n");
      out.write("        }\n");
      out.write("        .reservation-details {\n");
      out.write("            width: 100%;\n");
      out.write("            border-collapse: collapse;\n");
      out.write("            margin-top: 20px;\n");
      out.write("        }\n");
      out.write("        .reservation-details th, .reservation-details td {\n");
      out.write("            padding: 10px;\n");
      out.write("            text-align: left;\n");
      out.write("            border-bottom: 1px solid #ddd;\n");
      out.write("        }\n");
      out.write("        .reservation-details th {\n");
      out.write("            background-color: #f2f2f2;\n");
      out.write("        }\n");
      out.write("        .reservation-details td {\n");
      out.write("            background-color: #fff;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"sidebar\">\n");
      out.write("            <h2>VOLUNTEER MANAGEMENT</h2>\n");
      out.write("            <a href=\"dashboard.jsp\">Dashboard</a>\n");
      out.write("            <a href=\"reservation.jsp\">Reservation</a>\n");
      out.write("            <a href=\"#\">Activity & History</a>\n");
      out.write("            <a href=\"#\">Regulation & Rules</a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"content\">\n");
      out.write("            <div class=\"header\">\n");
      out.write("                <h2>Activity & History</h2>\n");
      out.write("                <form action=\"logout\" method=\"post\">\n");
      out.write("                    <input type=\"submit\" value=\"Logout\">\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"main-content\">\n");
      out.write("                <h3>Reservation Details</h3>\n");
      out.write("                <table class=\"reservation-details\">\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Date</th>\n");
      out.write("                        <td>2024-05-15</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Name</th>\n");
      out.write("                        <td>Alif Satar Bin Omar</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Email</th>\n");
      out.write("                        <td>alifsatar@gmail.com</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Status</th>\n");
      out.write("                        <td>Paid</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>IC Number</th>\n");
      out.write("                        <td>020803424543</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Phone Number</th>\n");
      out.write("                        <td>0199735345</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Date of Birth</th>\n");
      out.write("                        <td>23/3/2001</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Address</th>\n");
      out.write("                        <td>Klang, Selangor</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Age</th>\n");
      out.write("                        <td>23</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Occupation</th>\n");
      out.write("                        <td>Clerk</td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("             <div class=\"main-content\">\n");
      out.write("                <h3> history Reservation Details</h3>\n");
      out.write("                <table class=\"reservation-details\">\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Date</th>\n");
      out.write("                        <td>2024-05-15</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Name</th>\n");
      out.write("                        <td>Alif Satar Bin Omar</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Email</th>\n");
      out.write("                        <td>alifsatar@gmail.com</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Status</th>\n");
      out.write("                        <td>Paid</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>IC Number</th>\n");
      out.write("                        <td>020803424543</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Phone Number</th>\n");
      out.write("                        <td>0199735345</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Date of Birth</th>\n");
      out.write("                        <td>23/3/2001</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Address</th>\n");
      out.write("                        <td>Klang, Selangor</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Age</th>\n");
      out.write("                        <td>23</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Occupation</th>\n");
      out.write("                        <td>Clerk</td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
