<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%    
    //제대로 utf-8환경이 아니라 한글 깨짐 그래서 임의로 추가                                                   
    request.setCharacterEncoding("utf-8");
    
    String head = request.getParameter("head");
    String content = request.getParameter("se2Body");
    
    //콘솔 출력
    System.out.println("제목:"+head);
    System.out.println("내용:"+content);    
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Send Check Test</title>
</head>
<body>

제목 : <%=head %><br>
내용 : <br>
<%=content %>

</body>
</html>