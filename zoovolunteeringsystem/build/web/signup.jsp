<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Zoo Volunteer Sign-Up</title>
    <link href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700" rel="stylesheet">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.5.0/css/all.css" integrity="sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU" crossorigin="anonymous">
    <style>
        body {
            font-family: 'Roboto', sans-serif;
            background: url('https://wallpapers.com/images/featured/elephant-59quwjpbqizudcdr.jpg') no-repeat center center fixed;
            background-size: cover;
            margin: 0;
            padding: 0;
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: flex-start;
            height: 100vh;
        }
        h1 {
            color: #fff;
            margin: 20px 0 10px;
            text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.5);
        }
        form {
            background-color: rgba(255, 255, 255, 0.9);
            width: 90%;
            max-width: 600px;
            padding: 15px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            box-sizing: border-box;
            margin-bottom: 10px;
        }
        label {
            display: block;
            margin: 5px 0;
        }
        input[type="text"],
        input[type="tel"],
        input[type="email"],
        input[type="password"],
        input[type="date"],
        input[type="number"],
        textarea {
            width: 100%;
            padding: 8px;
            margin-bottom: 10px;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-sizing: border-box;
        }
        input[type="submit"] {
            background-color: #007bff;
            color: #fff;
            border: none;
            padding: 10px;
            border-radius: 4px;
            cursor: pointer;
            width: 100%;
            font-size: 16px;
        }
        input[type="submit"]:hover {
            background-color: #0056b3;
        }
        .signup-info {
            display: flex;
            justify-content: center;
            align-items: center;
            color: #fff;
        }
        .signup-info a {
            color: #007bff;
            text-decoration: none;
            margin-left: 5px;
        }
        .signup-info a:hover {
            text-decoration: underline;
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
        @media (min-width: 768px) {
            form {
                padding: 20px;
            }
        }
        @media (min-width: 1024px) {
            form {
                padding: 25px;
            }
        }
    </style>
</head>
<body>
    <h1>Volunteer Sign-Up</h1>
    <form id="signupForm" action="userServlet" method="post" onsubmit="return showPopup()">
        <fieldset>
            <legend>Personal Information</legend>
            <input type="hidden" name="command" value="usersignup" required>
            
            <label for="firstName">First Name:</label>
            <input type="text" id="firstName" name="firstName" required>
            
            <label for="lastName">Last Name:</label>
            <input type="text" id="lastName" name="lastName" required>
            
            <label for="icNumber">IC Number:</label>
            <input type="text" id="icNumber" name="icNumber" required>
            
            <label for="dob">Date of Birth:</label>
            <input type="date" id="dob" name="dob" required>
            
            <label for="age">Age:</label>
            <input type="number" id="age" name="age" required>
            
            <label for="occupation">Occupation:</label>
            <input type="text" id="occupation" name="occupation" required>
            
            <label for="address">Address:</label>
            <textarea id="address" name="address" rows="3" required></textarea>
        </fieldset>
        
        <fieldset>
            <legend>Contact Information</legend>
            <label for="phoneNumber">Phone Number:</label>
            <input type="tel" id="phoneNumber" name="phoneNumber" required>
        </fieldset>
        
        <fieldset>
            <legend>Account Information</legend>
            
            <label for="email">Email:</label>
            <input type="email" id="email" name="email" required>
            
            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required>
        </fieldset>
        
        <input type="submit" value="Sign Up">
    </form>

    <div class="signup-info">
        Already have an account? Please <a href="login.jsp">LOG IN</a> here!
    </div>

    <div class="popup" id="popup">
        Sign-up successful! Redirecting to login page...
    </div>

    <script>
        function showPopup() {
            var popup = document.getElementById("popup");
            popup.style.display = "block";
            setTimeout(function() {
                window.location.href = 'login.jsp';
            }, 3000); // Redirect after 3 seconds
            return false; // Prevent form submission
        }
    </script>
</body>
</html>