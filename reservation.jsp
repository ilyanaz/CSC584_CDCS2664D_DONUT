<%@ page import="model.userModel" %>
<%@ page import="java.io.IOException" %>
<%@ page import="java.io.InputStream" %>
<%@ page import="util.DatabaseConnection" %>
<%@ page import="java.sql.*" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Zoo Volunteering System - Reservation</title>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            background-color: #f2f2f2;
            margin: 0;
            display: flex;
            height: 100vh;
        }
        .sidebar {
            width: 250px;
            background-color: #0277bd;
            color: #fff;
            display: flex;
            flex-direction: column;
            align-items: center;
            padding: 15px;
            box-sizing: border-box;
            box-shadow: 2px 0 5px rgba(0, 0, 0, 0.1);
        }
        .sidebar h2 {
            color: #fff;
            margin-bottom: 30px;
        }
        .sidebar a {
            display: block;
            color: #fff;
            padding: 10px 15px;
            text-decoration: none;
            margin-bottom: 10px;
            border-radius: 5px;
            width: 100%;
            text-align: center;
            transition: background-color 0.3s, transform 0.3s;
        }
        .sidebar a:hover {
            background-color: #01579b;
            transform: translateY(-2px);
        }
        .content {
            flex: 1;
            display: flex;
            flex-direction: column;
        }
        .header {
            display: flex;
            justify-content: space-between;
            align-items: center;
            padding: 20px;
            background-color: #fff;
            box-shadow: 0 1px 4px rgba(0, 0, 0, 0.1);
        }
        .header h2 {
            margin: 0;
            color: #333;
            font-size: 1.8em;
        }
        .logout-button {
            background-color: #0277bd;
            color: white;
            padding: 10px 20px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            font-size: 16px;
            transition: background-color 0.3s, transform 0.3s;
        }
        .logout-button:hover {
            background-color: #01579b;
            transform: translateY(-2px);
        }
        .main-content {
            padding: 20px;
            display: flex;
            flex-direction: column;
            align-items: center;
            text-align: center;
            background-image: url('https://manybackgrounds.com/images/hd/cute-baby-lion-animal-mno0fks52b7vu897.jpg'); /* Replace with your actual image URL */
            background-size: cover;
            background-position: center;
            flex: 1;
        }
        .form-container {
            background-color: #fff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            max-width: 600px;
            width: 100%;
            text-align: left;
        }
        .form-group {
            margin-bottom: 15px;
            width: 100%;
        }
        .form-group label {
            display: block;
            margin-bottom: 5px;
            color: #333;
        }
        .form-group input,
        .form-group textarea {
            width: 100%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
            box-sizing: border-box;
        }
        .form-group input[type="file"] {
            padding: 3px;
        }
        .form-group button {
            background-color: #0277bd;
            color: white;
            border: none;
            cursor: pointer;
            font-size: 16px;
            padding: 10px 20px;
            border-radius: 5px;
            transition: background-color 0.3s, transform 0.3s;
            margin-top: 10px;
        }
        .form-group button:hover {
            background-color: #01579b;
            transform: translateY(-2px);
        }
        .form-group p {
            color: #333;
        }
        .popup {
            display: none;
            position: fixed;
            left: 50%;
            top: 50%;
            transform: translate(-50%, -50%);
            background-color: rgba(0, 0, 0, 0.8);
            color: white;
            padding: 20px;
            border-radius: 8px;
            z-index: 1000;
            font-size: 1.2em;
        }
    </style>
</head>
<body>
    <div class="sidebar">
        <h2>Volunteer Management</h2>
        <a href="home.jsp">Dashboard</a>
        <a href="reservation.jsp">Reservation</a>
        <a href="reservationServlet?command=viewbyuserid">Activity & History</a>
    </div>
    <div class="content">
        <div class="header">
            <h2>Reservation</h2>
            <form action="userServlet" method="post">
                <input type="hidden" name="command" value="userlogout">
                <input type="submit" value="Logout" class="logout-button">
            </form>
        </div>
        <div class="main-content">
            <div class="form-container">
                <h3>Volunteer Information</h3>
                <%
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
                %>
                <form id="reservationForm" action="reservationServlet" method="post" enctype="multipart/form-data">
                    <input type="hidden" name="command" value="addReservation">
                    <input type="hidden" name="userID" value="<%= userID %>" required>
                    <div class="form-group">
                        <label for="date">Select Date:</label>
                        <input type="date" id="date" name="date" required>
                    </div>
                    <div class="form-group">
                        <label for="name">Name:</label>
                        <input type="text" id="name" name="name" value="<%= rs.getString("firstName") %>" required>
                    </div>
                    <div class="form-group">
                        <label for="ic">IC Number:</label>
                        <input type="text" id="ic" name="ic" value="<%= rs.getString("icNumber") %>" required>
                    </div>
                    <div class="form-group">
                        <label for="phone">Phone Number:</label>
                        <input type="tel" id="phone" name="phone" value="<%= rs.getString("phoneNumber") %>" required>
                    </div>
                    <div class="form-group">
                        <label for="email">Email:</label>
                        <input type="email" id="email" name="email" value="<%= rs.getString("email") %>" required>
                    </div>
                    <div class="form-group">
                        <label for="dob">Date of Birth:</label>
                        <input type="date" id="dob" name="dob" value="<%= rs.getString("dob") %>" required>
                    </div>
                    <div class="form-group">
                        <label for="address">Address:</label>
                        <textarea id="address" name="address" rows="3" required><%= rs.getString("address") %></textarea>
                    </div>
                    <div class="form-group">
                        <label for="age">Age:</label>
                        <input type="number" id="age" name="age" value="<%= rs.getString("age") %>" required>
                    </div>
                    <div class="form-group">
                        <label for="occupation">Occupation:</label>
                        <input type="text" id="occupation" name="occupation" value="<%= rs.getString("occupation") %>" required>
                    </div>
                    <div class="form-group">
                        <p>Please make a payment amount (RM35) and send the file before submit<br>
                        Account number: BSN 019284938495023</p>
                    </div>
                    <div class="form-group">
                        <label for="file">Attach File:</label>
                        <input type="file" id="fileUpload" name="fileupload" accept=".pdf, .doc, .docx">
                    </div>
                    <div class="form-group">
                        <button type="submit" name="submit">Submit</button>
                    </div>
                </form>
                <%
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
                %>
            </div>
        </div>
    </div>

    <!-- Pop-out message -->
    <div id="popup" class="popup">
        Reservation successful! Redirecting to Activity & History Page...
    </div>

    <!-- JavaScript to display the pop-out message and redirect -->
    <script>
        // Function to show pop-out message
        function showPopup() {
            var popup = document.getElementById("popup");
            popup.style.display = "block";
            setTimeout(function() {
                window.location.href = activity_history.jsp';
            }, 3000); // Redirect after 3 seconds
            return true; // Allow form submission
        }

        // Submit form event listener
        var form = document.getElementById("reservationForm");
        form.addEventListener("submit", function(event) {
            event.preventDefault(); // Prevent default form submission
            var isValid = showPopup(); // Show pop-out message and redirect
            if (isValid) {
                this.submit(); // Submit the form after showing the message
            }
        });
    </script>
</body>
</html>
