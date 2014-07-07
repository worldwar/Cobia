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
        <div class="header basic-background-color">
            烂漫网
        </div>
        <div class="content">
            <div id="page">
                <div class="rounded-corner-block basic-background-color">
                    <div class="drawing-info">
                        <span class="book-info" >
                            <a class="book-link" href="/book/${book.code}" >${book.title}</a>
                        </span>
                        >
                        <span class="chapter-info">
                                ${chapter.title}(${index}/${chapter.pageCount})
                        </span>
                    </div>
                </div>
                <div class="rounded-corner-block basic-background-color">
                    <img class="drawing" src="${imageUrl}" />
                </div>

                <div id="comment-area" class="comment-area rounded-corner-block basic-background-color">
                    <div class="comments-header">
                        有${fn:length(comments)}个混蛋发表了评论已经
                    </div>
                    <c:forEach var="comment" items="${comments}" >
                    <div class="comment-raw" 
                         data-code="${comment.code}"
                         data-author="${comment.author}"
                         data-target="${comment.target}"
                         data-replyTo="${comment.replyTo}"
                         data-type="${comment.type}"
                         data-receiver="${comment.receiver}"
                         data-authorName="${comment.authorName}"
                         data-content="${comment.content}"
                         data-createTime="${comment.createTime}"
                         >
<!--
                        <div class="comment-author-info">
                            ${comment.authorName}
                        </div>
                        <div class="comment-content">                            
                            ${comment.content}
                        </div>
-->
                    </div>
                    </c:forEach>
                </div>
            </div>
        </div>
        <div class="footer basic-background-color">
            Copyright © 2014 两个黄鹂鸣翠柳工作室
        </div>
        <script src="/js/lib/jquery-1.11.0.js" type="text/javascript" ></script>
        <script src="/js/page.js" type="text/javascript" ></script>
    </body>
</html>