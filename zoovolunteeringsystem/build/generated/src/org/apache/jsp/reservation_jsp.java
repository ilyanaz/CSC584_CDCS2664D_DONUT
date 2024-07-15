package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.userModel;
import java.io.IOException;
import java.io.InputStream;
import util.DatabaseConnection;
import java.sql.*;

public final class reservation_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Zoo Volunteering System - Reservation</title>\n");
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
      out.write("        .form-container {\n");
      out.write("            background-color: #fff;\n");
      out.write("            padding: 20px;\n");
      out.write("            border-radius: 8px;\n");
      out.write("            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\n");
      out.write("            max-width: 600px;\n");
      out.write("            width: 100%;\n");
      out.write("            text-align: left;\n");
      out.write("        }\n");
      out.write("        .form-group {\n");
      out.write("            margin-bottom: 15px;\n");
      out.write("            width: 100%;\n");
      out.write("        }\n");
      out.write("        .form-group label {\n");
      out.write("            display: block;\n");
      out.write("            margin-bottom: 5px;\n");
      out.write("            color: #333;\n");
      out.write("        }\n");
      out.write("        .form-group input,\n");
      out.write("        .form-group textarea {\n");
      out.write("            width: 100%;\n");
      out.write("            padding: 10px;\n");
      out.write("            border: 1px solid #ccc;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            box-sizing: border-box;\n");
      out.write("        }\n");
      out.write("        .form-group input[type=\"file\"] {\n");
      out.write("            padding: 3px;\n");
      out.write("        }\n");
      out.write("        .form-group button {\n");
      out.write("            background-color: #0277bd;\n");
      out.write("            color: white;\n");
      out.write("            border: none;\n");
      out.write("            cursor: pointer;\n");
      out.write("            font-size: 16px;\n");
      out.write("            padding: 10px 20px;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            transition: background-color 0.3s, transform 0.3s;\n");
      out.write("            margin-top: 10px;\n");
      out.write("        }\n");
      out.write("        .form-group button:hover {\n");
      out.write("            background-color: #01579b;\n");
      out.write("            transform: translateY(-2px);\n");
      out.write("        }\n");
      out.write("        .form-group p {\n");
      out.write("            color: #333;\n");
      out.write("        }\n");
      out.write("        .popup {\n");
      out.write("            display: none;\n");
      out.write("            position: fixed;\n");
      out.write("            left: 50%;\n");
      out.write("            top: 50%;\n");
      out.write("            transform: translate(-50%, -50%);\n");
      out.write("            background-color: rgba(0, 0, 0, 0.8);\n");
      out.write("            color: white;\n");
      out.write("            padding: 20px;\n");
      out.write("            border-radius: 8px;\n");
      out.write("            z-index: 1000;\n");
      out.write("            font-size: 1.2em;\n");
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
      out.write("            <h2>Reservation</h2>\n");
      out.write("            <form action=\"userServlet\" method=\"post\">\n");
      out.write("                <input type=\"hidden\" name=\"command\" value=\"userlogout\">\n");
      out.write("                <input type=\"submit\" value=\"Logout\" class=\"logout-button\">\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"main-content\">\n");
      out.write("            <div class=\"form-container\">\n");
      out.write("                <h3>Volunteer Information</h3>\n");
      out.write("                ");

                    userModel user = (userModel) session.getAttribute("user");
                    if (user != null) {
                        String userID = user.getUserid();
                        Connection con = null;
                        PreparedStatement pstmt = null;
                        ResultSet rs = null;
                        try {
                            Class.forName("com.mysql.cj.jdbc.Driver");
                            con = DatabaseConnection.getConnection();
                            String query = "SELECT * FROM users WHERE userID = ?";
                            pstmt = con.prepareStatement(query);
                            pstmt.setString(1, userID);
                            rs = pstmt.executeQuery();

                            if (rs.next()) {
                
      out.write("\n");
      out.write("                <form id=\"reservationForm\" action=\"reservationServlet\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("                    <input type=\"hidden\" name=\"command\" value=\"addReservation\">\n");
      out.write("                    <input type=\"hidden\" name=\"userID\" value=\"");
      out.print( userID );
      out.write("\" required>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"date\">Select Date:</label>\n");
      out.write("                        <input type=\"date\" id=\"date\" name=\"date\" required>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"name\">Name:</label>\n");
      out.write("                        <input type=\"text\" id=\"name\" name=\"name\" value=\"");
      out.print( rs.getString("firstName") );
      out.write("\" required>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"ic\">IC Number:</label>\n");
      out.write("                        <input type=\"text\" id=\"ic\" name=\"ic\" value=\"");
      out.print( rs.getString("icNumber") );
      out.write("\" required>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"phone\">Phone Number:</label>\n");
      out.write("                        <input type=\"tel\" id=\"phone\" name=\"phone\" value=\"");
      out.print( rs.getString("phoneNumber") );
      out.write("\" required>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"email\">Email:</label>\n");
      out.write("                        <input type=\"email\" id=\"email\" name=\"email\" value=\"");
      out.print( rs.getString("email") );
      out.write("\" required>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"dob\">Date of Birth:</label>\n");
      out.write("                        <input type=\"date\" id=\"dob\" name=\"dob\" value=\"");
      out.print( rs.getString("dob") );
      out.write("\" required>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"address\">Address:</label>\n");
      out.write("                        <textarea id=\"address\" name=\"address\" rows=\"3\" required>");
      out.print( rs.getString("address") );
      out.write("</textarea>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"age\">Age:</label>\n");
      out.write("                        <input type=\"number\" id=\"age\" name=\"age\" value=\"");
      out.print( rs.getString("age") );
      out.write("\" required>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"occupation\">Occupation:</label>\n");
      out.write("                        <input type=\"text\" id=\"occupation\" name=\"occupation\" value=\"");
      out.print( rs.getString("occupation") );
      out.write("\" required>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <p>Please make a payment amount (RM35) and send the file before submit<br>\n");
      out.write("                        Account number: BSN 019284938495023</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"file\">Attach File:</label>\n");
      out.write("                        <input type=\"file\" id=\"fileUpload\" name=\"fileupload\" accept=\".pdf, .doc, .docx\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <button type=\"submit\" name=\"submit\">Submit</button>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("                ");

                            }
                        } catch (SQLException e) {
                            e.printStackTrace();
                        } catch (ClassNotFoundException e) {
                            e.printStackTrace();
                        } finally {
                            try {
                                if (rs != null) rs.close();
                                if (pstmt != null) pstmt.close();
                                if (con != null) con.close();
                            } catch (SQLException ex) {
                                ex.printStackTrace();
                            }
                        }
                    } else {
                        response.sendRedirect("login.jsp");
                    }
                
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Pop-out message -->\n");
      out.write("    <div id=\"popup\" class=\"popup\">\n");
      out.write("        Reservation successful! Redirecting to Activity & History Page...\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- JavaScript to display the pop-out message and redirect -->\n");
      out.write("    <script>\n");
      out.write("        // Function to show pop-out message\n");
      out.write("        function showPopup() {\n");
      out.write("            var popup = document.getElementById(\"popup\");\n");
      out.write("            popup.style.display = \"block\";\n");
      out.write("            setTimeout(function() {\n");
      out.write("                window.location.href = activity_history.jsp';\n");
      out.write("            }, 2000); // Redirect after 3 seconds\n");
      out.write("            return true; // Allow form submission\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        // Submit form event listener\n");
      out.write("        var form = document.getElementById(\"reservationForm\");\n");
      out.write("        form.addEventListener(\"submit\", function(event) {\n");
      out.write("            event.preventDefault(); // Prevent default form submission\n");
      out.write("            var isValid = showPopup(); // Show pop-out message and redirect\n");
      out.write("            if (isValid) {\n");
      out.write("                this.submit(); // Submit the form after showing the message\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
