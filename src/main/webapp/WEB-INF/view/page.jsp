<%@ page language="java"  pageEncoding="UTF-8" contentType="text/html;charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
    </head>
    <body>
        <div id="page-data" data-json="${pageJson}" style="display: none;">
        </div>
        <div class="content">
            <div id="page">
                <div id="header">
                    <div id="book-info" style="display: inline;">
                        <a href="/book/${book.code}" >${book.title}</a>
                    </div>
                    >
                    <div id="chapter-info" style="display: inline;">
                        <div style="display: inline;">
                            ${chapter.title}(${index}/${chapter.pageCount})
                        </div>
                    </div>
                </div>
                <div id="comic">
                    <img src="${imageUrl}" style="max-width: 400px;max-height:800px"/>
                </div>

                <div id="comments">
                    <c:forEach var="comment" items="${comments}" >
                    <div class="comment">
                        ${comment.authorName}:${comment.content}
                    </div>
                    </c:forEach>
                </div>
            </div>
        </div>
    </body>
</html>