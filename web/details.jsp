<%@ page import="app.servlets.sprint.domain.Tasks" %><%--
  Created by IntelliJ IDEA.
  User: samandykov
  Date: 16.09.2023
  Time: 18:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    Tasks task = (Tasks) request.getAttribute("taskDetails");
%>
<html>
<head>
    <title></title>
    <%@ include file="/import/front-bootstrap.jsp" %>
</head>

<body>
<div class="container">
    <div class="row mt-5">
        <form action="/Sprint1/tasks/details" method="post">
            <input type="hidden" value="<%=task.getId()%>" name="task_id" >
            <div class="form-group">
                <label for="task_name_input">NAME:</label>
                <input class="form-control" type="text" value="<%=task.getName()%>" name="task_name" id="task_name_input" required>
            </div>

            <div class="form-group">
                <label for="task_description_input">DESCRIPTION:</label>
                <input class="form-control" type="text" value="<%=task.getDescription()%>" name="task_description" id="task_description_input" required>
            </div>

            <div class="form-group">
                <label for="task_deadlinedate_input">DEADLINEDATE:</label>
                <input class="form-control" type="date" value="<%=task.getDeadlineDate()%>" name="task_deadlinedate" id="task_deadlinedate_input" required>
            </div>

            <div class="form-group">
                <button type="submit" class="btn btn-primary w-20 mt-5">Update</button>
            </div>
        </form>

        <form action="/Sprint1/tasks/delete" method="post">
            <div>
                <input type="hidden" value="<%=task.getId()%>" name="task_id">
                <button class="btn btn-danger"> Delete </button>
            </div>
        </form>
    </div>
</div>
</body>
</html>
