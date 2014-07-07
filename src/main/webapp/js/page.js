$(document).ready(function(){
    renderComments();
});

function renderComments() {
    var commentNodes = $(".comment-raw");
    var comments = [];
    var replies = {};
    $(".comment-raw").each(function(index){
        var comment = generateComment($(this));
        if (comment.isReply()) {
            replies[comment.replyTo] = replies[comment.target] || [];
            replies[comment.replyTo].push(comment);
        } else {
            comments.push(comment);
        }
    });

    comments.sort(function(commentA, commentB) {
        return commentA.createTime > commentB.createTime ? 1 : -1;
    });
    
    var i;
    
    var commentsNode = $("<div/>");
    commentsNode.addClass("comments");
    for (i = 0 ; i < comments.length; ++i) {
        var comment = comments[i];
        var commentReplies = replies[comment.code];
        if (commentReplies) {
            commentReplies.sort(function(commentA, commentB) {
                return commentA.createTime > commentB.createTime ? 1 : -1;
            });
        }
        var node = createCommentNode(comment, commentReplies);
        node.attr("data-index", i + 1);
        commentsNode.append(node);
    }
    $("#comment-area").append(commentsNode);
}

function generateComment(node) {
    var comment = {};
    comment.code = node.attr("data-code");
    comment.target = node.attr("data-target");
    comment.replyTo = node.attr("data-replyTo");
    comment.type = node.attr("data-type");
    comment.receiver = node.attr("data-receiver");
    comment.author = node.attr("data-author");
    comment.authorName = node.attr("data-authorName");
    comment.content = node.attr("data-content");
    comment.createTime = node.attr("data-createTime");
    comment.isReply = function(){
        return Number(comment.type) == 3;
    }
    return comment;
}

function createCommentNode(comment, commentReplies) {
    var node = $("<div/>");
    node.addClass("comment-block");
    var motherCommentNode = createSingleCommentNode(comment);
    node.append(motherCommentNode);
    if (commentReplies) {
        $.each(commentReplies, function(index, reply){
            var replyNode = createSingleCommentNode(reply);
            replyNode.addClass("comment-reply");
            if ((index + 1) % 2 == 0){
                replyNode.addClass("comment-reply-even");
            } else {
                replyNode.addClass("comment-reply-odd");
            }
            node.append(replyNode);
        });
    }
    return node;
}

function createSingleCommentNode(comment) {
    var node = $("<div/>");
    node.addClass("comment");
    var authorNode = $("<div/>");
    authorNode.addClass("comment-author-info");
    authorNode.text(comment.authorName);
    node.append(authorNode);
    
    var contentNode = $("<div/>");
    contentNode.addClass("comment-content");
    contentNode.text(comment.content);
    node.append(contentNode);
    
    return node;
}