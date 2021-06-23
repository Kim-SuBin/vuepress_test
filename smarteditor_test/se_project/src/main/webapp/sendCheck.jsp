<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%    
    //����� utf-8ȯ���� �ƴ϶� �ѱ� ���� �׷��� ���Ƿ� �߰�                                                   
    request.setCharacterEncoding("utf-8");
    
    String head = request.getParameter("head");
    String content = request.getParameter("se2Body");
    
    //�ܼ� ���
    System.out.println("����:"+head);
    System.out.println("����:"+content);    
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Send Check Test</title>
</head>
<body>

���� : <%=head %><br>
���� : <br>
<%=content %>

</body>
</html>