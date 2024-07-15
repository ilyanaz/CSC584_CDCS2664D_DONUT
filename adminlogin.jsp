<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Zoo Volunteer Admin Log In</title>
    <link href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700" rel="stylesheet">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.5.0/css/all.css" integrity="sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU" crossorigin="anonymous">

    <style>
        body {
            font-family: 'Roboto', sans-serif;
            background: url('https://muralsyourway.vtexassets.com/arquivos/ids/267656/Forest-Joy-Wallpaper-Mural.jpg?v=638185041526170000') no-repeat center center fixed; 
            background-size: cover;
            margin: 0;
            padding: 0;
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
            height: 100vh;
        }
        h1 {
            color: #fff;
            margin-bottom: 20px;
            text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.5);
        }
        form {
            background-color: rgba(255, 255, 255, 0.9);
            width: 100%;
            max-width: 400px;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            box-sizing: border-box;
        }
        label {
            display: block;
            margin: 10px 0 5px;
        }
        input[type="text"],
        input[type="password"],
        input[type="email"],
        textarea {
            width: 100%;
            padding: 10px;
            margin-bottom: 20px;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-sizing: border-box;
        }
        input[type="submit"] {
            background-color: #007bff;
            color: #fff;
            border: none;
            padding: 10px 20px;
            border-radius: 4px;
            cursor: pointer;
            width: 100%;
            font-size: 16px;
        }
        input[type="submit"]:hover {
            background-color: #0056b3;
        }
        a {
            text-decoration: none;
            color: #007bff;
        }
        a:hover {
            text-decoration: underline;
        }
        .error-message {
            color: red;
            margin-bottom: 20px;
        }
        .signup-info {
            display: flex;
            justify-content: center;
            align-items: center;
            margin-top: 20px;
            color: #fff;
        }
        .popup {
            display: none;
            background-color: rgba(0, 0, 0, 0.7);
            color: white;
            padding: 10px;
            border-radius: 5px;
            position: fixed;
            top: 50%;
            left: 50%;
            transform: translate(-50%, -50%);
            z-index: 1000;
            width: 80%;
            max-width: 300px;
            text-align: center;
        }
    </style>
</head>
<body>
    <h1>Admin Log In</h1>
    <% String errorMessage = (String) request.getAttribute("errorMessage"); %>
    <form id="loginForm" action="userServlet" method="post" onsubmit="return validateForm()">
        <input type="hidden" name="command" value="adminlogin" required>

        <label for="email">Email:</label>
        <input type="text" id="email" name="email" required>

        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required>

        <input type="submit" value="Login">
    </form>

    <div class="signup-info">
        Not an admin? Go to <a href="login.jsp" class="button">Volunteer Login</a>
    </div>

    <div class="popup" id="popup">
        <% if (errorMessage != null) { %>
            <%= errorMessage %>
        <% } else { %>
            Please enter a valid email and password.
        <% } %>
    </div>

    <script>
        document.addEventListener("DOMContentLoaded", function() {
            var errorMessage = "<%= errorMessage %>";
            var popup = document.getElementById("popup");

            if (errorMessage) {
                popup.style.display = "block";
                setTimeout(function() {
                    popup.style.display = "none";
                }, 3000);
            }
        });
        
        function validateForm() {
            var email = document.getElementById("email").value;
            var password = document.getElementById("password").value;
            var popup = document.getElementById("popup");

            if (email === "" || password === "") {
                popup.style.display = "block";
                setTimeout(function() {
                    popup.style.display = "none";
                }, 3000);
                return false;
            }
            return true;
        }
    </script>
</body>
</html>