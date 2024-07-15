package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Zoo Volunteering System - Home</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            font-family: 'Arial', sans-serif;\n");
      out.write("            background-color: #f2f2f2;\n");
      out.write("            margin: 0;\n");
      out.write("            display: flex;\n");
      out.write("            height: 100vh;\n");
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
      out.write("            box-shadow: 2px 0 5px rgba(0, 0, 0, 0.1);\n");
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
      out.write("            transition: background-color 0.3s, transform 0.3s;\n");
      out.write("        }\n");
      out.write("        .sidebar a:hover {\n");
      out.write("            background-color: #01579b;\n");
      out.write("            transform: translateY(-2px);\n");
      out.write("        }\n");
      out.write("        .content {\n");
      out.write("            flex: 1;\n");
      out.write("            display: flex;\n");
      out.write("            flex-direction: column;\n");
      out.write("        }\n");
      out.write("        .header {\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: space-between;\n");
      out.write("            align-items: center;\n");
      out.write("            padding: 20px;\n");
      out.write("            background-color: #fff;\n");
      out.write("            box-shadow: 0 1px 4px rgba(0, 0, 0, 0.1);\n");
      out.write("        }\n");
      out.write("        .header h2 {\n");
      out.write("            margin: 0;\n");
      out.write("            color: #333;\n");
      out.write("            font-size: 1.8em;\n");
      out.write("        }\n");
      out.write("        .logout-button {\n");
      out.write("            background-color: #0277bd;\n");
      out.write("            color: white;\n");
      out.write("            padding: 10px 20px;\n");
      out.write("            border: none;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            cursor: pointer;\n");
      out.write("            font-size: 16px;\n");
      out.write("            transition: background-color 0.3s, transform 0.3s;\n");
      out.write("        }\n");
      out.write("        .logout-button:hover {\n");
      out.write("            background-color: #01579b;\n");
      out.write("            transform: translateY(-2px);\n");
      out.write("        }\n");
      out.write("        .main-content {\n");
      out.write("            padding: 20px;\n");
      out.write("            display: flex;\n");
      out.write("            flex-direction: column;\n");
      out.write("            align-items: center;\n");
      out.write("            text-align: center;\n");
      out.write("            background-image: url('https://manybackgrounds.com/images/hd/cute-baby-lion-animal-mno0fks52b7vu897.jpg'); /* Replace with your actual image URL */\n");
      out.write("            background-size: cover;\n");
      out.write("            background-position: center;\n");
      out.write("            flex: 1;\n");
      out.write("        }\n");
      out.write("        .gallery {\n");
      out.write("            display: flex;\n");
      out.write("            flex-direction: column;\n");
      out.write("            align-items: center;\n");
      out.write("            background-color: #fff;\n");
      out.write("            padding: 20px;\n");
      out.write("            border-radius: 8px;\n");
      out.write("            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\n");
      out.write("            animation: fadeIn 1s ease-in-out;\n");
      out.write("        }\n");
      out.write("        .gallery img {\n");
      out.write("            max-width: 300px;\n");
      out.write("            height: auto;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);\n");
      out.write("        }\n");
      out.write("        .gallery h3 {\n");
      out.write("            margin-top: 0;\n");
      out.write("            color: #333;\n");
      out.write("            font-size: 1.5em;\n");
      out.write("        }\n");
      out.write("        .gallery p {\n");
      out.write("            color: #555;\n");
      out.write("            max-width: 600px;\n");
      out.write("            margin: 0 auto;\n");
      out.write("            line-height: 1.6;\n");
      out.write("        }\n");
      out.write("        @keyframes fadeIn {\n");
      out.write("            from {\n");
      out.write("                opacity: 0;\n");
      out.write("            }\n");
      out.write("            to {\n");
      out.write("                opacity: 1;\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"sidebar\">\n");
      out.write("        <h2>Volunteer Management</h2>\n");
      out.write("        <a href=\"home.jsp\">Dashboard</a>\n");
      out.write("        <a href=\"reservation.jsp\">Reservation</a>\n");
      out.write("        <a href=\"reservationServlet?command=viewbyuserid\">Activity & History</a>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"content\">\n");
      out.write("        <div class=\"header\">\n");
      out.write("            <h2>Welcome to the Zoo Volunteering System!</h2>\n");
      out.write("            <form action=\"userServlet\" method=\"post\">\n");
      out.write("                <input type=\"hidden\" name=\"command\" value=\"userlogout\">\n");
      out.write("                <input type=\"submit\" value=\"Logout\" class=\"logout-button\">\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"main-content\">\n");
      out.write("            <div class=\"gallery\">\n");
      out.write("                <h3>Gallery</h3>\n");
      out.write("                <img src=\"images/red-panda.jpg\" alt=\"Red Panda\">\n");
      out.write("                <h3>Red Panda</h3>\n");
      out.write("                <p>Red panda, (Ailurus fulgens), reddish brown, long-tailed, raccoonlike mammal, about the size of a large domestic cat, that is found in the mountain forests of the Himalayas and adjacent areas of eastern Asia and subsists mainly on bamboo and other vegetation, fruits, and insects. Once classified as a relative of the giant panda, it is now usually classified as the sole member of the family Ailuridae.</p>\n");
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
