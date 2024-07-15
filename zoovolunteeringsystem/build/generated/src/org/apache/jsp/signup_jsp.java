package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Zoo Volunteer Sign-Up</title>\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Roboto:300,400,500,700\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.5.0/css/all.css\" integrity=\"sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU\" crossorigin=\"anonymous\">\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            font-family: 'Roboto', sans-serif;\n");
      out.write("            background: url('https://wallpapers.com/images/featured/elephant-59quwjpbqizudcdr.jpg') no-repeat center center fixed;\n");
      out.write("            background-size: cover;\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            display: flex;\n");
      out.write("            flex-direction: column;\n");
      out.write("            align-items: center;\n");
      out.write("            justify-content: flex-start;\n");
      out.write("            height: 100vh;\n");
      out.write("        }\n");
      out.write("        h1 {\n");
      out.write("            color: #fff;\n");
      out.write("            margin: 20px 0 10px;\n");
      out.write("            text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.5);\n");
      out.write("        }\n");
      out.write("        form {\n");
      out.write("            background-color: rgba(255, 255, 255, 0.9);\n");
      out.write("            width: 90%;\n");
      out.write("            max-width: 600px;\n");
      out.write("            padding: 15px;\n");
      out.write("            border-radius: 8px;\n");
      out.write("            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\n");
      out.write("            box-sizing: border-box;\n");
      out.write("            margin-bottom: 10px;\n");
      out.write("        }\n");
      out.write("        label {\n");
      out.write("            display: block;\n");
      out.write("            margin: 5px 0;\n");
      out.write("        }\n");
      out.write("        input[type=\"text\"],\n");
      out.write("        input[type=\"tel\"],\n");
      out.write("        input[type=\"email\"],\n");
      out.write("        input[type=\"password\"],\n");
      out.write("        input[type=\"date\"],\n");
      out.write("        input[type=\"number\"],\n");
      out.write("        textarea {\n");
      out.write("            width: 100%;\n");
      out.write("            padding: 8px;\n");
      out.write("            margin-bottom: 10px;\n");
      out.write("            border: 1px solid #ccc;\n");
      out.write("            border-radius: 4px;\n");
      out.write("            box-sizing: border-box;\n");
      out.write("        }\n");
      out.write("        input[type=\"submit\"] {\n");
      out.write("            background-color: #007bff;\n");
      out.write("            color: #fff;\n");
      out.write("            border: none;\n");
      out.write("            padding: 10px;\n");
      out.write("            border-radius: 4px;\n");
      out.write("            cursor: pointer;\n");
      out.write("            width: 100%;\n");
      out.write("            font-size: 16px;\n");
      out.write("        }\n");
      out.write("        input[type=\"submit\"]:hover {\n");
      out.write("            background-color: #0056b3;\n");
      out.write("        }\n");
      out.write("        .signup-info {\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: center;\n");
      out.write("            align-items: center;\n");
      out.write("            color: #fff;\n");
      out.write("        }\n");
      out.write("        .signup-info a {\n");
      out.write("            color: #007bff;\n");
      out.write("            text-decoration: none;\n");
      out.write("            margin-left: 5px;\n");
      out.write("        }\n");
      out.write("        .signup-info a:hover {\n");
      out.write("            text-decoration: underline;\n");
      out.write("        }\n");
      out.write("        .popup {\n");
      out.write("            display: none;\n");
      out.write("            background-color: rgba(0, 0, 0, 0.7);\n");
      out.write("            color: white;\n");
      out.write("            padding: 10px;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            position: fixed;\n");
      out.write("            top: 50%;\n");
      out.write("            left: 50%;\n");
      out.write("            transform: translate(-50%, -50%);\n");
      out.write("            z-index: 1000;\n");
      out.write("            width: 80%;\n");
      out.write("            max-width: 300px;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("        @media (min-width: 768px) {\n");
      out.write("            form {\n");
      out.write("                padding: 20px;\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("        @media (min-width: 1024px) {\n");
      out.write("            form {\n");
      out.write("                padding: 25px;\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <h1>Volunteer Sign-Up</h1>\n");
      out.write("    <form id=\"signupForm\" action=\"userServlet\" method=\"post\" onsubmit=\"return showPopup()\">\n");
      out.write("        <fieldset>\n");
      out.write("            <legend>Personal Information</legend>\n");
      out.write("            <input type=\"hidden\" name=\"command\" value=\"usersignup\" required>\n");
      out.write("            \n");
      out.write("            <label for=\"firstName\">First Name:</label>\n");
      out.write("            <input type=\"text\" id=\"firstName\" name=\"firstName\" required>\n");
      out.write("            \n");
      out.write("            <label for=\"lastName\">Last Name:</label>\n");
      out.write("            <input type=\"text\" id=\"lastName\" name=\"lastName\" required>\n");
      out.write("            \n");
      out.write("            <label for=\"icNumber\">IC Number:</label>\n");
      out.write("            <input type=\"text\" id=\"icNumber\" name=\"icNumber\" required>\n");
      out.write("            \n");
      out.write("            <label for=\"dob\">Date of Birth:</label>\n");
      out.write("            <input type=\"date\" id=\"dob\" name=\"dob\" required>\n");
      out.write("            \n");
      out.write("            <label for=\"age\">Age:</label>\n");
      out.write("            <input type=\"number\" id=\"age\" name=\"age\" required>\n");
      out.write("            \n");
      out.write("            <label for=\"occupation\">Occupation:</label>\n");
      out.write("            <input type=\"text\" id=\"occupation\" name=\"occupation\" required>\n");
      out.write("            \n");
      out.write("            <label for=\"address\">Address:</label>\n");
      out.write("            <textarea id=\"address\" name=\"address\" rows=\"3\" required></textarea>\n");
      out.write("        </fieldset>\n");
      out.write("        \n");
      out.write("        <fieldset>\n");
      out.write("            <legend>Contact Information</legend>\n");
      out.write("            <label for=\"phoneNumber\">Phone Number:</label>\n");
      out.write("            <input type=\"tel\" id=\"phoneNumber\" name=\"phoneNumber\" required>\n");
      out.write("        </fieldset>\n");
      out.write("        \n");
      out.write("        <fieldset>\n");
      out.write("            <legend>Account Information</legend>\n");
      out.write("            \n");
      out.write("            <label for=\"email\">Email:</label>\n");
      out.write("            <input type=\"email\" id=\"email\" name=\"email\" required>\n");
      out.write("            \n");
      out.write("            <label for=\"password\">Password:</label>\n");
      out.write("            <input type=\"password\" id=\"password\" name=\"password\" required>\n");
      out.write("        </fieldset>\n");
      out.write("        \n");
      out.write("        <input type=\"submit\" value=\"Sign Up\">\n");
      out.write("    </form>\n");
      out.write("\n");
      out.write("    <div class=\"signup-info\">\n");
      out.write("        Already have an account? Please <a href=\"login.jsp\">LOG IN</a> here!\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"popup\" id=\"popup\">\n");
      out.write("        Sign-up successful! Redirecting to login page...\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("        function showPopup() {\n");
      out.write("            var popup = document.getElementById(\"popup\");\n");
      out.write("            popup.style.display = \"block\";\n");
      out.write("            setTimeout(function() {\n");
      out.write("                window.location.href = 'login.jsp';\n");
      out.write("            }, 3000); // Redirect after 3 seconds\n");
      out.write("            return false; // Prevent form submission\n");
      out.write("        }\n");
      out.write("    </script>\n");
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
