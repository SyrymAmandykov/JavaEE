<%@ page import="app.servlets.sprint.domain.Tasks" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: samandykov
  Date: 12.09.2023
  Time: 20:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    //    Tasks task = (Tasks) request.getAttribute("addTasks");
%>

<html>

<head>

    <title>SprintTask</title>

    <%@ include file="/import/front-bootstrap.jsp" %>

</head>

<body>
<div class="container">
    <div class="row mt-5">
        <!-- Button trigger modal -->
        <button type="button" class="btn btn-primary w-10 mt-3 col-2" data-bs-toggle="modal"
                data-bs-target="#exampleModal">
            Add new task
        </button>
    </div>
    <div class="row mt-5">
        <table class="table">
            <thead>
            <th>ID</th>
            <th>NAME</th>
            <th>DESCRIPTION</th>
            <th>DEADLINEDATE</th>
            <th>DETAILS</th>
            </thead>
            <tbody>

            <%
                List<Tasks> task = (List<Tasks>) request.getAttribute("tasksList");
                for (Tasks tasks : task) {
            %>

            <tr>
                <td><%=tasks.getId()%>
                </td>
                <td><%=tasks.getName()%>
                </td>
                <td><%=tasks.getDescription()%>
                </td>
                <td><%=tasks.getDeadlineDate()%>
                </td>
                <td><a href="/Sprint1/tasks/details?id=<%=tasks.getId()%>" class="btn btn-info btn-sm">Check</a></td>
            </tr>

            <%
                }
            %>
            </tbody>
        </table>
    </div>

    <!-- Modal -->
    <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">New task</h5>
                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                </div>
                <div class="modal-body">
                    <div class="row mt-5">
                        <form action="/Sprint1/tasks" method="post">
                            <div class="form-group">
                                <label for="task_name_input">NAME:</label>
                                <input class="form-control" type="text" name="task_name" id="task_name_input" required>
                            </div>

                            <div class="form-group">
                                <label for="task_description_input">DESCRIPTION:</label>
                                <input class="form-control" type="text" name="task_description"
                                       id="task_description_input" required>
                            </div>

                            <div class="form-group">
                                <label for="task_deadlinedate_input">DEADLINEDATE:</label>
                                <input class="form-control" type="date" name="task_deadlinedate"
                                       id="task_deadlinedate_input" required>
                            </div>

                            <button type="reset" class="btn btn-secondary mt-3" data-bs-dismiss="modal">Reset</button>
                            <button type="submit" class="btn btn-primary mt-3">Add</button>

                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
