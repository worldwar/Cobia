<%@ page language="java"  pageEncoding="UTF-8" contentType="text/html;charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
    <head>
        <title>${book.title}</title>
        <link type="text/css" rel="stylesheet" href="/css/basic.css" >
    </head>
    <body>
        <div id="page-data" data-json="${pageJson}" style="display: none;">
        </div>
        <div class="header">
            烂漫网
        </div>
        <div class="content">
            <div id="page">
                <div class="comic-header comic">
                    <div class="book-info" >
                        <a class="book-link" href="/book/${book.code}" >${book.title}</a>
                    </div>
                    >
                    <div class="chapter-info" style="display: inline;">
                        <div style="display: inline;">
                            ${chapter.title}(${index}/${chapter.pageCount})
                        </div>
                    </div>
                </div>
                <div class="comic">
                    <img class="drawing" src="${imageUrl}" />
                </div>

                <div class="comments comic">
                    <div class="comments-header">
                        有${fn:length(comments)}个混蛋发表了评论已经
                    </div>
                    <c:forEach var="comment" items="${comments}" >
                    <div class="comment">
                        <div class="comment-author-info">
                            ${comment.authorName}
                        </div>
                        <div class="comment-content">                            
                            ${comment.content}
                        </div>
                    </div>
                    </c:forEach>
                </div>
            </div>
        </div>
        <div class="footer">
            Copyright © 2014 两个黄鹂鸣翠柳工作室
        </div>
    </body>
</html>