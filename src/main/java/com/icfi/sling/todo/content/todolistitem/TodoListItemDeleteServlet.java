package com.icfi.sling.todo.content.todolistitem;

import com.icfi.sling.todo.model.list.TodoListItem;
import org.apache.felix.scr.annotations.sling.SlingServlet;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;

import javax.servlet.ServletException;
import java.io.IOException;

@SlingServlet(
        resourceTypes = "todo/content/todolistitem",
        methods = "DELETE"
)
public class TodoListItemDeleteServlet extends SlingAllMethodsServlet {

    protected void doDelete(SlingHttpServletRequest request, SlingHttpServletResponse response) throws ServletException, IOException {

        TodoListItem todoListItem = request.getResource().adaptTo(TodoListItem.class);

        if (todoListItem != null) {
            todoListItem.delete();
        }

    }

}
