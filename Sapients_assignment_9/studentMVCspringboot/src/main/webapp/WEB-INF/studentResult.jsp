<%@page import="com.student.result.studentMVCspringboot.Student"%>

<!DOCTYPE html>
<html>
<head>
<title>student result page</title>
</head>
<body>
<%
Student ob = null;
int id1=0;
String grade="(Ex/A/B/C/D/P/F)";
String percentage="(%)";
if(request.getAttribute("result") !=null){
	ob = (Student)request.getAttribute("result");
	id1=ob.getId();
	percentage=ob.getPercent();
	grade=ob.getGrade();
}
%>

<center>
<form method = "post">
<br>Enter Student id <input name ="id" type="text" value ="<%=id1%>"/>
<br> <input type="submit" value = "GetResult"/>

</form>
<br><h3><b>Result  :</h3></b>
<br><b>Percentage :</b><%=percentage%>
<br><b>Grade Assigned :</b><%=grade%>
<br>
</center>

</body>
</html>