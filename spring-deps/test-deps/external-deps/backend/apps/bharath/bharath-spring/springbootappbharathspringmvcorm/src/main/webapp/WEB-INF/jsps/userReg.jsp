<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Insert title here</title>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
<script>
	$(document).ready(function() {
		$("#id").change(function() {

			$.ajax({

				url : 'validateEmail',
				data : {
					id : $("#id").val()
				},
				success : function(responseText) {
				$("#errMsg").text(responseText);
				
				if(responseText!=""){
					$("#id").focus();
				}

				}

			});

		});
	});
</script>

</head>
<body>
	<form action="registerUser" method="post">
		<pre>
Id: <input type="text" name="id" id="id" /><span id="errMsg"></span>
Name: <input type="text" name="name" />
Email: <input type="text" name="email" />
<input type="submit" name="register" />
</pre>

	</form>

	<br />${result}

</body>
</html>