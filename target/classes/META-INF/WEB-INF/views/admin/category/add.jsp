<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<c:choose>
    <c:when test="${category.isEdit}">
        <h2>Edit Category</h2>
    </c:when>
    <c:otherwise>
        <h2>Add New Category</h2>
    </c:otherwise>
</c:choose>

<form action="/admin/categories/save" method="post">
    
    <input type="hidden" name="isEdit" value="${category.isEdit}">
    <input type="hidden" name="id" value="${category.id}">
    
    <label>Category name</label><br>
    <input type="text" name="name" value="${category.name}"><br>
    
    <label>Images</label><br>
    <input type="text" name="images" value="${category.images}"><br>
    
    <label>Status</label><br>
    <input type="text" name="status" value="${category.status}"><br>
    
    <c:choose>
        <c:when test="${category.isEdit}">
            <input type="submit" value="Update">
        </c:when>
        <c:otherwise>
            <input type="submit" value="Insert">
        </c:otherwise>
    </c:choose>
</form>
